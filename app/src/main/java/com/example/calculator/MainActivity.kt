package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var numb1 = 10
        var numb2 = 10
        var modif = "none"
        var result = "none"
        val resultTextView1: TextView = findViewById(R.id.num1display)
        val resultTextView2: TextView = findViewById(R.id.num2display)
        val resultTextView3: TextView = findViewById(R.id.operdisplay)
        val resultTextView4: TextView = findViewById(R.id.display)

        //Logic for numbered buttons (repeated)
        val b0: Button = findViewById(R.id.button0) // adds button location to a value
        b0.setOnClickListener { // When button is clicked do...
            if (numb1 == 10) { // If 1st number isnt added...
                numb1 = 0 // Make 1st number number on button
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 0
                resultTextView2.text = "$numb2"
            }
        }
        val b1: Button = findViewById(R.id.button1)
        b1.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 1
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 1
                resultTextView2.text = "$numb2"
            }
        }
        val b2: Button = findViewById(R.id.button2)
        b2.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 2
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 2
                resultTextView2.text = "$numb2"
            }
        }
        val b3: Button = findViewById(R.id.button3)
        b3.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 3
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 3
                resultTextView2.text = "$numb2"
            }
        }
        val b4: Button = findViewById(R.id.button4)
        b4.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 4
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 4
                resultTextView2.text = "$numb2"
            }
        }
        val b5: Button = findViewById(R.id.button5)
        b5.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 5
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 5
                resultTextView2.text = "$numb2"
            }
        }
        val b6: Button = findViewById(R.id.button6)
        b6.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 6
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 6
                resultTextView2.text = "$numb2"
            }
        }
        val b7: Button = findViewById(R.id.button7)
        b7.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 7
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 7
                resultTextView2.text = "$numb2"
            }
        }
        val b8: Button = findViewById(R.id.button8)
        b8.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 8
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 8
                resultTextView2.text = "$numb2"
            }
        }
        val b9: Button = findViewById(R.id.button9)
        b9.setOnClickListener {
            if (numb1 == 10) {
                numb1 = 9
                resultTextView1.text = "$numb1"
            } else {
                numb2 = 9
                resultTextView2.text = "$numb2"
            }
        }
        // Logic for + & - Buttons
        val badd : Button = findViewById(R.id.buttonadd)
        badd.setOnClickListener {
            modif = "+"
            resultTextView3.text = "$modif"
        }
        val bsub : Button = findViewById(R.id.buttonsub)
        bsub.setOnClickListener {
            modif = "-"
            resultTextView3.text = "$modif"
        }
        // calculates function
        val benter : Button = findViewById(R.id.buttonequals)
        benter.setOnClickListener {
            if (modif == "+") {
                result = ((numb1 + numb2).toString())
            }
            if (modif == "-") {
                result = ((numb1 - numb2).toString())
            }
            resultTextView4.text = "$result"
            }
        // clear button resets variables and clears displays
        val bC : Button = findViewById(R.id.buttonclear)
        bC.setOnClickListener {
            numb1 = 10
            numb2 = 10
            modif = "none"
            result = "none"
            resultTextView1.text = ""
            resultTextView2.text = ""
            resultTextView3.text = ""
            resultTextView4.text = ""
        }
    }
}