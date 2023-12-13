package com.example.test3

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import com.Login
import com.Student_details_Show
import com.example.StudentActivity
import com.example.TabActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val registernow = findViewById<TextView>(R.id.registernow)
        var dontaccount = findViewById<TextView>(R.id.dontaccount)
        dontaccount.setOnClickListener {
            var intent = Intent(this,Login::class.java)
            startActivity(intent)
        }
        registernow.setOnClickListener {
            val intent1= Intent(this,Login::class.java)
            startActivity(intent1)
        }
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            var intent=Intent(this,TabActivity::class.java)
            startActivity(intent)
        }
    }
}