package com

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.Data_Student
import com.example.test3.R

class Student_Adpter (var context:Context,var studentlist:ArrayList<Data_Student>):BaseAdapter(){

    override fun getCount(): Int {
       return studentlist.size
    }


    override fun getItem(position: Int): Any {
        return studentlist[position]
    }


    override fun getItemId(position: Int): Long {
        return (position).toLong()
    }


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
       var layout = LayoutInflater.from(context).inflate(R.layout.layout,null,false)
        var name = layout.findViewById<TextView>(R.id.name)
       var email = layout.findViewById<TextView>(R.id.email)
       var phone = layout.findViewById<TextView>(R.id.phone)
       var image = layout.findViewById<ImageView>(R.id.image)
        name.text=studentlist[position].name
        email.text=studentlist[position].email
       phone.text=studentlist[position].phone
        image.setImageResource(studentlist[position].image)
//        var intent = Intent(context,Student_details_Show::class.java)
//        intent.putExtra("name",name.text.toString())
//        intent.putExtra("email",email.text.toString())
//        intent.putExtra("phone",phone.text.toString())

//        intent.putExtra("image",image.)

        return layout
    }
}


