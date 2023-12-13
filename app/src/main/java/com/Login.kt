package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.example.test3.MainActivity
import com.example.test3.R

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var gender = findViewById<Spinner>(R.id.gender)
        var array = arrayListOf("Gender","Male","Female","Trans_gender")
        var adpter = ArrayAdapter(this, com.google.android.material.R.layout.support_simple_spinner_dropdown_item,array)
        gender.adapter=adpter

        var register = findViewById<Button>(R.id.register)
        register.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}