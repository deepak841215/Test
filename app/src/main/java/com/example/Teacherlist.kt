package com.example

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.TeacherData
import com.example.test3.R

class RecyclerAdpter(teacherlist1: Context, private var teacherlist: ArrayList<TeacherData>):RecyclerView.Adapter<RecyclerAdpter.Myviewholder>(){
    class Myviewholder(itemView:View):RecyclerView.ViewHolder(itemView){
        var names:TextView=itemView.findViewById(R.id.name)
        var subject:TextView=itemView.findViewById(R.id.subject)
        var image:ImageView=itemView.findViewById(R.id.image)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
       var layout= LayoutInflater.from(parent.context).inflate(R.layout.teacher_layout,parent,false)
        return Myviewholder(layout)
    }

    override fun getItemCount(): Int {
        return teacherlist.size
    }


    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
       holder.names.text=teacherlist[position].name
        holder.subject.text=teacherlist[position].subject
        holder.image.setImageResource(teacherlist[position].image)
    }


}


