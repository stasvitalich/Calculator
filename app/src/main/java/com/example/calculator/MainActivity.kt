package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    //private var tvInput = binding.textResult.text // Create a variable for result which we'll change.

    var lastNumeric = false
    var lastDot = false

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        buttonsClick()


    }

    private fun buttonsClick() = with(binding) {
        button0.setOnClickListener {
            textResult.append("0")
            lastNumeric = true
            lastDot = false
        }
        button1.setOnClickListener {
            textResult.append("1")
            lastNumeric = true
            lastDot = false
        }
        button2.setOnClickListener {
            textResult.append("2")
            lastNumeric = true
            lastDot = false
        }
        button3.setOnClickListener {
            textResult.append("3")
            lastNumeric = true
            lastDot = false
        }
        button4.setOnClickListener {
            textResult.append("4")
            lastNumeric = true
            lastDot = false
        }
        button5.setOnClickListener {
            textResult.append("5")
            lastNumeric = true
            lastDot = false
        }
        button6.setOnClickListener {
            textResult.append("6")
            lastNumeric = true
            lastDot = false
        }
        button7.setOnClickListener {
            textResult.append("7")
            lastNumeric = true
            lastDot = false
        }
        button8.setOnClickListener {
            textResult.append("8")
            lastNumeric = true
            lastDot = false
        }
        button9.setOnClickListener {
            textResult.append("9")
            lastNumeric = true
            lastDot = false
        }

        buttonDot.setOnClickListener {
            if (lastNumeric && !lastDot && textResult.text.isNotEmpty()) {
                textResult.append(".")
                lastDot = true
                lastNumeric = false
            }
        }

        buttonDivide.setOnClickListener { }
        buttonMultiply.setOnClickListener { }
        buttonMinus.setOnClickListener { }
        buttonPlus.setOnClickListener { }
        buttonEqual.setOnClickListener { }
        buttonClear.setOnClickListener {
            textResult.text = ""
        }
    }

}
