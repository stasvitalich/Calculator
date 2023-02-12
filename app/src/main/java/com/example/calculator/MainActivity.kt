package com.example.calculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        buttonsClick()
    }

    fun buttonsClick() = with(binding){
        button0.setOnClickListener { textResult.text = "0" }
        button1.setOnClickListener {  }
        button2.setOnClickListener {  }
        button3.setOnClickListener {  }
        button4.setOnClickListener {  }
        button5.setOnClickListener {  }
        button6.setOnClickListener {  }
        button7.setOnClickListener {  }
        button8.setOnClickListener {  }
        button9.setOnClickListener {  }

        buttonDivide.setOnClickListener {  }
        buttonMultiply.setOnClickListener {  }
        buttonMinus.setOnClickListener {  }
        buttonPlus.setOnClickListener {  }
        buttonEqual.setOnClickListener {  }
        buttonEqual.setOnClickListener {  }
    }
}