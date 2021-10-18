package com.example.arraylistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    lateinit var entName: EditText
    lateinit var entNum: EditText
    lateinit var btnAdd: Button
    lateinit var btnGet: Button
    lateinit var txt1: TextView
    var names = ArrayList<String>()
    var num = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        entName=findViewById(R.id.entName)
        entNum=findViewById(R.id.entNum)

        txt1=findViewById(R.id.txt1)

        btnAdd=findViewById(R.id.btnAdd)
        btnGet=findViewById(R.id.btnGet)

        btnAdd.setOnClickListener {
            names.add(entName.text.toString())
            entName.clearFocus()
            num++
            Toast.makeText(applicationContext, "Name is Save in Number $num", Toast.LENGTH_SHORT).show()
        }

        btnGet.setOnClickListener {
           var ent = entNum.text.toString()
            num = ent.toInt()
            num--
            if (num<names.size) {
                txt1.text = "${names.get(num)}"
            }else{
                Toast.makeText(applicationContext, "filed number", Toast.LENGTH_SHORT).show()
            }
        }
    }
}