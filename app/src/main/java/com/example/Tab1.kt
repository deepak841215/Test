package com.example

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import com.Student_Adpter
import com.example.test3.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Tab1 : Fragment() {


    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var layout=inflater.inflate(R.layout.fragment_tab1, container, false)


        var listview=layout. findViewById<ListView>(R.id.listview)
       var student_list= arrayListOf(Data_Student("aditya kuamr","kumaraditya36945@gmail.com","8292328203","Male",R.drawable.img),
           Data_Student("Deepak kuamr","kumaraditya36945@gmail.com","8292328203","Male",R.drawable.img) )

        var adpter = Student_Adpter(requireContext(),student_list)
        listview.adapter=adpter
    return layout


    }
}