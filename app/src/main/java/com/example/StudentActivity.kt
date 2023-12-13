package com.example

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.Student_Adpter
import com.example.test3.R
//import java.util.ArrayList
//import kotlin.collections.ArrayList

class StudentActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)
        var listview= findViewById<ListView>(R.id.listview)
        var student_list = arrayListOf(Data_Student("Deepak kumar","Kumardeepak36945@gmail.com",
            "8292328203","Male",R.drawable.baseline_manage_accounts_24)
            ,Data_Student("Aditya kumar","Kumaraditya36945@gmail.com",
                "8292328203","Male",R.drawable.baseline_manage_accounts_24),
            Data_Student("Pawan kumar","pawan36945@gmail.com",
                "8292328203","Male",R.drawable.baseline_manage_accounts_24) )

        var adpter = Student_Adpter(this,student_list)
        listview.adapter=adpter
    }



    }
