package com.anymeshsingh.diceegame

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dice = ArrayList<Int>(6)
        dice.add(R.drawable.dice1)
        dice.add(R.drawable.dice2)
        dice.add(R.drawable.dice3)
        dice.add(R.drawable.dice4)
        dice.add(R.drawable.dice5)
        dice.add(R.drawable.dice6)

        rollbtn.setOnClickListener{
            var random = Random()
            var randomnumber1:Int = random.nextInt(6)
            dice1.setImageResource(dice[randomnumber1])

            var randomnumber2:Int = random.nextInt(6)
            dice2.setImageResource(dice[randomnumber2])
        }

    }

}
