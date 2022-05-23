package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import kotlinx.android.synthetic.main.activity_main.*
import android.util.Log
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    var counter = 0
    //lateinit var list:ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Life cycle", "On create")

        btnplus.setOnClickListener{
            text.setText(""+ ++counter)
        }
        btnmin.setOnClickListener{
            text.setText(""+ --counter)
        }

        next.setOnClickListener{
            val nextIntent = Intent(this, CalculatorActivity::class.java)
            startActivity(nextIntent)
        }

        //list.findViewById<ListView>(R.id.listview)

    }
//restore state oncreate, called on stop and stored data when oncreate is called
    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

    }
//stores all data for restorw method.
    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

    }
    override fun onStart() {
        super.onStart()
        Log.d("Life cycle", "On Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Life cycle", "On Restart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Life cycle", "On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Life cycle", "On Pause")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Life cycle", "On Destroy")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Life cycle", "On Stop")

    }
}