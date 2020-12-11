package com.burgowzer.visitcard

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_add_card_menu.*

var firstName: String =""
var lastName: String =""
var companyName: String =""
var jobPosition: String =""
var email: String =""
var phoneNumber: String =""


class AddCardMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_card_menu)
        val preferencesReader = getSharedPreferences("com.burgowzer.visitcard", Context.MODE_PRIVATE)
    }


    fun clickSaveButton (button: View){

        val preferencesManager = getSharedPreferences("com.burgowzer.visitcard", Context.MODE_PRIVATE).edit()



        companyName = companyTextView.text.toString()
        firstName = firstNameTextView.text.toString()
        lastName = lastNameTextView.text.toString()
        email = emailTextView.text.toString()
        jobPosition = jobPositionTextView.text.toString()
        phoneNumber = phoneNumberTextView.text.toString()




        preferencesManager.putString("companyName", companyName)
        preferencesManager.putString("firstName", firstName)
        preferencesManager.putString("lastName", lastName)
        preferencesManager.putString("email", email)
        preferencesManager.putString("jobPosition", jobPosition)
        preferencesManager.putString("phoneNumber", phoneNumber)


        preferencesManager.apply()


        val intent = Intent(this, CardViewer::class.java)

        intent.putExtra("companyName", companyName)
        intent.putExtra("firstName", firstName)
        intent.putExtra("lastName", lastName)
        intent.putExtra("email", email)
        intent.putExtra("jobPosition", jobPosition)
        intent.putExtra("phoneNumber", phoneNumber)
        //startActivity(intent)

        val toastTextSave = Toast.makeText(this, "Card Saved", Toast.LENGTH_LONG)

        toastTextSave.show()
    }

    fun backMenuClicked(button: View) {

        val intent = Intent(this, MainActivity::class.java)
        if (intent!= null){
            startActivity(intent)
        }
    }
}
