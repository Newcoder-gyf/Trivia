package edu.gwu.trivia.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import edu.gwu.trivia.BingImageSearchManager
import edu.gwu.trivia.model.GameData
import edu.gwu.trivia.R
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    private val TAG = "GameActivity"
    private lateinit var gameData: GameData //garrente gamedata will not be null and will init before use it
    private lateinit var bingImageSearchManager: BingImageSearchManager

    private var score = 0
    private var currentQuestionIndex = 0
    private var numberWrong = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        bingImageSearchManager = BingImageSearchManager(this, imageView = image_view)

        val gameData = intent.getParcelableExtra<GameData>(MenuActivity.GAME_DATA_KEY)
        Log.d(TAG,"we passed game data with ${gameData.question.size} questions")

        nextTurn()

    }

    private fun nextTurn(){
        if(numberWrong == 3){ //game over
            TODO()
        }
        else{
            currentQuestionIndex ++
            currentQuestionIndex %= gameData.question.size

            val question = gameData.question.get(currentQuestionIndex)
            val answer = question.correctAnswer
            val wrongAnswer = question.wrongAnswer

            Log.d(TAG, "the correct answer is ${answer.answer}")

            bingImageSearchManager.searchImages(answer.answer)
        }
    }
}
