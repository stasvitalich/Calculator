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
    val symbols = Regex("[/*+]")
    var doubleDot = false

    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        buttonsClick()



    }

    fun buttonsClick() = with(binding) {
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

        buttonDivide.setOnClickListener {
            if (textResult.text.isNotEmpty() && (!symbols.containsMatchIn(textResult.text)) && (lastNumeric == true)) {
                textResult.append("/")
                lastNumeric = false
                lastDot = false
            }
        }

        buttonMultiply.setOnClickListener {
            if (textResult.text.isNotEmpty() && (!symbols.containsMatchIn(textResult.text)) && (lastNumeric == true)) {
                textResult.append("*")
                lastNumeric = false
                lastDot = false
            }
        }

        buttonMinus.setOnClickListener {
            if (textResult.text.isEmpty()) {
                textResult.append("-")
                lastNumeric = false
                lastDot = false
            } else if (textResult.text.isNotEmpty() && textResult.text.last() != '-') {
                textResult.append("-")
                lastNumeric = false
                lastDot = false
            }

        }

        buttonPlus.setOnClickListener {
            if (textResult.text.isNotEmpty() && (!symbols.containsMatchIn(textResult.text)) && (lastNumeric == true)) {
                textResult.append("+")
                lastNumeric = false
                lastDot = false
            }
        }

        buttonEqual.setOnClickListener {
            if (lastNumeric) {
                var tvValue = textResult.text.toString()
                var prefix = ""
                try {
                    if (tvValue.startsWith("-")) {
                        prefix = "-"
                        tvValue = tvValue.substring(1)
                    }

                    if (tvValue.contains("-")) {
                        val splitValue = tvValue.split("-")

                        var one = splitValue[0]
                        var two = splitValue[1]

                        if (prefix.isNotEmpty()) {
                            one = prefix + one
                        }

                        textResult.text = (one.toDouble() - two.toDouble()).toString()
                    } else if (tvValue.contains("+")) {
                        val splitValue = tvValue.split("+")

                        var one = splitValue[0]
                        var two = splitValue[1]

                        if (prefix.isNotEmpty()) {
                            one = prefix + one
                        }

                        textResult.text = (one.toDouble() + two.toDouble()).toString()
                    } else if (tvValue.contains("/")) {
                        val splitValue = tvValue.split("/")

                        var one = splitValue[0]
                        var two = splitValue[1]

                        if (prefix.isNotEmpty()) {
                            one = prefix + one
                        }

                        textResult.text = (one.toDouble() / two.toDouble()).toString()
                    } else if (tvValue.contains("*")) {
                        val splitValue = tvValue.split("*")

                        var one = splitValue[0]
                        var two = splitValue[1]

                        if (prefix.isNotEmpty()) {
                            one = prefix + one
                        }

                        textResult.text = (one.toDouble() * two.toDouble()).toString()
                    }


                } catch (e: ArithmeticException) {
                    e.printStackTrace()
                }
            }
        }
        buttonClear.setOnClickListener {
            textResult.text = ""
        }


    }

}



