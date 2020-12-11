package com.burgowzer.visitcard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_my_cards.*
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager


class MyCards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_cards)

        recyclerViewCard.adapter = CardViewer()
        recyclerViewCard.layoutManager = LinearLayoutManager(this)
    }




//class MyCards : AppCompatActivity() {
    //override fun onCreate(savedInstanceState: Bundle?) {
      //  super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_my_cards)

        //val companyText: String = intent.getStringExtra("companyName")
        //companyTextView.setText(companyText)

    //val lastNameText: String = intent.getStringExtra("lastName")
    //  lastNameTextView.setText(lastNameText)

    //  val firstNameText: String = intent.getStringExtra("firstName")
    //  lastNameTextView.setText(firstNameText)

    //  val jobPositionText: String = intent.getStringExtra("jobPosition")
    //  jobPositionTextView.setText(jobPositionText)

    //  val emailText: String = intent.getStringExtra("email")
    //  emailTextView.setText(emailText)

    //  val phoneNumberText: String = intent.getStringExtra("phoneNumber")
    //  phoneNumberTextView.setText(phoneNumberText)
    //}

    fun backMenuClicked(button: View) {

     val intent = Intent(this, MainActivity::class.java)
     if (intent != null) {
        startActivity(intent)
     }
    }

}

    //}

