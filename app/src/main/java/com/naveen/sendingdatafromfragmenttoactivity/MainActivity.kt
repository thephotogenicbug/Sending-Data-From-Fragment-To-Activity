package com.naveen.sendingdatafromfragmenttoactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    lateinit var name : TextView
    lateinit var email : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.textViewName)
        email = findViewById(R.id.textViewEmail)

        val fm : FragmentManager = supportFragmentManager
        val ft : FragmentTransaction = fm.beginTransaction()
        val myFragment = MyFragment()
        ft.add(R.id.frame, myFragment)
        ft.commit()

    }

    fun getData(userName : String, userEmail: String){

        name.text = userName
        email.text = userEmail

    }
}