package com.example

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.TeacherData
import com.example.test3.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Tab2.newInstance] factory method to
 * create an instance of this fragment.
 */
class Tab2 : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var layout= inflater.inflate(R.layout.fragment_tab2, container, false)

        var recylerview = layout.findViewById<RecyclerView>(R.id.recycileview)
        var teacherlist = arrayListOf(TeacherData("Shubham pandey","Android",R.drawable.img),
            TeacherData("Shubham pandey","Android",R.drawable.img))
        var adpter = RecyclerAdpter(requireContext(),teacherlist)
        recylerview.adapter=adpter
        recylerview.layoutManager = LinearLayoutManager(requireContext())
        var add = layout.findViewById<Button>(R.id.add)
        add.setOnClickListener {
            var alert = AlertDialog.Builder(requireContext())
            var alertlayout = LayoutInflater.from(requireContext()).inflate(R.layout.addlayout,null,false)
          var name = layout.findViewById<EditText>(R.id.teachername)
            var subject = layout.findViewById<EditText>(R.id.tsubject)

            var button = layout.findViewById<Button>(R.id.add)
           var dilog= alert.create()


            alert.setView(alertlayout)
            button.setOnClickListener {
                teacherlist.add (TeacherData(name.text.toString(),subject.text.toString(),R.drawable.img))
                adpter.notifyDataSetChanged()
                dilog.dismiss()

            }


            alert.show()

        }

        return layout
    }
}
