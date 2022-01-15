package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            rollDice()
        }
    }
    private fun rollDice(){
        val dice=Dice(6)
        val diceRoll=dice.roll()
        textView.text=diceRoll.toString()
    }


}
class Dice(val numSidel: Int ){
    fun roll() :Int{
        return(1..numSidel).random()
    }
}