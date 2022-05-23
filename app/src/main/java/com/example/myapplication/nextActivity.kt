package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*
import android.util.Log
import android.view.View

class nextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        prev.setOnClickListener {
            val prevIntent = Intent(this, MainActivity::class.java)
            startActivity(prevIntent)
            Log.d("click" ,"inside prev")
        }
    }

    fun testClick(view: View) {
        Log.d("Test", "Testing onClick")
    }
}