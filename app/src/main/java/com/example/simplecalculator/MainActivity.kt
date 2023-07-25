package com.example.simplecalculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var no1: Int? = null
    var no2: Int? = null
    var result: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btAdd = findViewById<Button>(R.id.button)
        val btsub = findViewById<Button>(R.id.button2)
        val btmul = findViewById<Button>(R.id.button3)
        val btndivide = findViewById<Button>(R.id.button4)
        val text1 = findViewById<EditText>(R.id.editNumber1)
        val text2 = findViewById<EditText>(R.id.editNumber2)
        val textView = findViewById<TextView>(R.id.resultView)


        btAdd.setOnClickListener {

            no1 = text1.text.toString().toIntOrNull()
            no2 = text2.text.toString().toIntOrNull()
            if (no1 == null || no2 == null) {
                textView.text = "fill all blanks"

                // result = no1!! + no2!!
                // textView.text = "Sum is : ${result}"
                //   Toast.makeText(this, "Sum is $sum", Toast.LENGTH_LONG).show()

            } else {
                var result = no1!! + no2!!
                textView.text = "Sum is : ${result}"
                //textView.text = "fill all blanks"
                // Toast.makeText(this, "fill all blanks.", Toast.LENGTH_LONG).show()
            }


        }
        btsub.setOnClickListener {
            val no1 = text1.text.toString().toIntOrNull()
            val no2 = text2.text.toString().toIntOrNull()
            if (no1 == null || no2 == null) {
                textView.text = "fill all blanks"
            } else {
                var result = no1!! - no2!!
                textView.text = "Difference is : ${result}"
                //textView.text = "fill all blanks"
                // Toast.makeText(this, "fill all blanks.", Toast.LENGTH_LONG).show()
            }


        }
        //val sub: Int
        //  sub = if (no1 > no2) {
        //    no1 - no2
        //  } else {
        //     no2 - no1
        // }

        // textView.text = "diff is : ${sub}"

        // Toast.makeText(this, "Difference is $sub", Toast.LENGTH_LONG).show()

        //  } else {
        // textView.text = "fill all blanks"
        //  Toast.makeText(this, "fill all blanks.", Toast.LENGTH_LONG).show()


        btmul.setOnClickListener {
            val no1 = text1.text.toString().toIntOrNull()
            val no2 = text2.text.toString().toIntOrNull()
            if (no1 == null || no2 == null) {
                textView.text = "fill all blanks"
            } else {
                var result = no1!! * no2!!
                textView.text = "Product is : ${result}"

            }
        }
        btndivide.setOnClickListener {
            val no1 = text1.text.toString().toIntOrNull()
            val no2 = text2.text.toString().toIntOrNull()
            if (no1 == null || no2 == null) {
                textView.text = "fill all blanks"
            } else {
                var result = no1!! / no2!!
                textView.text = "Division is : ${result}"


            }
        }
    }
}

