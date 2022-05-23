package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_calculator.*

//import kotlinx.android.synthetic.main.activity_main.view.*

class CalculatorActivity : AppCompatActivity() {
    var ans: Float = 0.0f
    var ex = ""
    var arg2 = "0"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
    }

    fun setarg(view: View) {
        val b = view as Button
        arg2 += b.getText().toString()
        anstxt.setText(arg2)
        //anstxt.append(b.getText())
        Log.d("view", arg2)
    }

    fun setex(view: View) {
        val b = view as Button
        expression.setText(b.getText())
        if(ex.equals("")){
            ans = arg2.toFloat()
        }else if(ex.equals("+")){
            ans += arg2.toFloat()
        }else if(ex.equals("-")){
            ans -= arg2.toFloat()
        }else if(ex.equals("/")){
            ans /= arg2.toFloat()
        }else if(ex.equals("*")){
            ans *= arg2.toFloat()
        }else if(ex.equals("%")){
            ans %= arg2.toFloat()
        }
        ex = b.getText().toString()
        arg2=""
        anstxt.setText(""+ans)
        if(ex.equals("=")){
            ex = ""
            arg2 = "0"
        }
        Log.d("view",  ex)
    }

    fun reset(view: View) {
        ans = 0.0f
         ex = ""
         arg2 = "0"
    }
}