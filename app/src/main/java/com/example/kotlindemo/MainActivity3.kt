package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var input = findViewById<EditText>(R.id.inputNum)
        var btn = findViewById<Button>(R.id.btn_3)
        var result = findViewById<TextView>(R.id.tv_3)

        btn.setOnClickListener(View.OnClickListener {

            var num:Int= input.text.toString().toInt()
            var i:Int= 1
            var s:String= ""

            while (true){
                s+= "$i@"
                if (i==num){
                    break
                }
                ++i
            }
            result.setText(s)






        })













    }
}