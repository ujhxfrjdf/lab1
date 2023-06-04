package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.EditText
import android.view.View

 class MainActivity : AppCompatActivity() {

     override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_main)
    }

     fun onClickTest(view: View){
         val text1 = findViewById<TextView>(R.id.text1)
         val edit1 = findViewById<EditText>(R.id.edit1)

         text1.text = edit1.text.toString()
     }
}
 