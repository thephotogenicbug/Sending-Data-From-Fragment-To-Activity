package com.naveen.sendingdatafromfragmenttoactivity

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class MyFragment : Fragment() {

    lateinit var name : EditText
    lateinit var email : EditText
    lateinit var submit : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view : View = inflater.inflate(R.layout.fragment_my, container, false)

        name = view.findViewById(R.id.editTextName)
        email = view.findViewById(R.id.editTextEmail)
        submit = view.findViewById(R.id.buttonSubmit)

        submit.setOnClickListener {

            val userName = name.text.toString()
            val userEmail = email.text.toString()

            (activity as MainActivity).getData(userName,userEmail)

        }

        // Inflate the layout for this fragment
        return view
    }
}