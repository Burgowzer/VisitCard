package com.burgowzer.visitcard

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.net.URL


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun openCreateCardMenu(button: View){

        val intentCard: Intent = Intent(this, AddCardMenu::class.java)
        if (intentCard != null) {
            startActivity((intentCard))
        }
    }

    fun openNfcOption(button: View) {

        val intentNfc: Intent = Intent(this, NfcOption::class.java)
        if (intentNfc != null) {
            startActivity((intentNfc))
        }
    }

    fun openMyCardsMenu(button: View) {

        val intentMyCards: Intent = Intent(this, MyCards::class.java)
        if (intentMyCards != null) {
            startActivity((intentMyCards))
        }
    }

    fun openRepertoryMenu(button: View) {

        val intentRepertory: Intent = Intent(this, MyRepertory::class.java)
        if (intentRepertory != null) {
            startActivity((intentRepertory))
        }
    }

    fun openWebsite(button: View) {

        val website: Uri = Uri.parse("https://BusinessCard.com")
        val intent = Intent(Intent.ACTION_VIEW, website)
        if (intent!= null){
            startActivity(intent)
        }
    }

}