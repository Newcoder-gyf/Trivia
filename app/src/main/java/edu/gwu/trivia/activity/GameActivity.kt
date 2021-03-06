package edu.gwu.trivia.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import edu.gwu.trivia.BingImageSearchManager
import edu.gwu.trivia.R
import edu.gwu.trivia.model.GameData
import kotlinx.android.synthetic.main.activity_game.*
import org.jetbrains.anko.toast
import java.util.*

class GameActivity : AppCompatActivity(), BingImageSearchManager.ImageSearchCompletionListener {

    private val TAG = "GameActivity"
    private lateinit var gameData: GameData
    private lateinit var bingImageSearchManager: BingImageSearchManager

    private var score = 0
    private var currentQuestionIndex = 0
    private var numWrong = 0

    private var buttons = ArrayList<Button>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        buttons.add(top_left_button)
        buttons.add(top_rigth_button)
        buttons.add(bottom_left_button)
        buttons.add(bottom_right_button)

        buttons.apply {

        }


        bingImageSearchManager = BingImageSearchManager(this,image_view)
        bingImageSearchManager.imageSearchCompletionListener = this

        gameData = intent.getParcelableExtra<GameData>(MenuActivity.GAME_DATA_KEY)
        Log.d(TAG, "we passed game data with ${gameData.question.size} questions")

        nextTurn()
    }

    private fun nextTurn() {
        if(numWrong == 3 ) { //game over condition
            finish()
        }
        else {
            currentQuestionIndex++
            currentQuestionIndex %= gameData.question.size

            val question = gameData.question.get(currentQuestionIndex)
            val answer = question.correctAnswer
            val wrongAnswers = question.wrongAnswer

            Log.d(TAG, "the correct answer is ${answer.answer}")

            bingImageSearchManager.searchImages(answer.answer)
        }

    }

    private fun displayAnswers(){
        val answers = gameData.question[currentQuestionIndex].wrongAnswer + gameData.question[currentQuestionIndex].correctAnswer

        Collections.shuffle(answers)

        for (i in buttons.indices){
            val answer = answers[i]
            val button = buttons[i]

            button.apply {
                text = answer.answer
                tag = answer.correct
            }
        }

    }

    fun buttonPressed(view: View){
        val isCorrect = view.tag as Boolean
        if(isCorrect){
            toast(R.string.correct)
            score++
        }
        else{
            toast(R.string.wrong)
            numWrong++
        }
        nextTurn()
    }

    override fun imageLoaded() {
        displayAnswers()
    }

    override fun imageNotLoaded() {
        nextTurn()
    }
}
