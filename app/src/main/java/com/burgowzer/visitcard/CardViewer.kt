package com.burgowzer.visitcard

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.realm.Realm
import io.realm.RealmResults
import kotlinx.android.synthetic.main.activity_single_card.view.*


class CardViewer: RecyclerView.Adapter<CardViewer.CardViewHolder>() {
    init {
        val realm = Realm.getDefaultInstance()

        val newCard: CardDefinition= CardDefinition()

        newCard.company= companyName
        newCard.firstName= firstName
        newCard.email= email
        newCard.jobPosition= jobPosition
        newCard.lastName= lastName
        newCard.phoneNumber= phoneNumber


        realm.beginTransaction()
        realm.copyToRealm(newCard)
        realm.commitTransaction()




    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {

        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.activity_single_card,parent,false)

        val holder = CardViewHolder(rootView)


        return holder
    }

    override fun getItemCount(): Int {
        return 100
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {

        val realm = Realm.getDefaultInstance()

        val _cardList: RealmResults<CardDefinition>

        _cardList = realm.where(CardDefinition::class.java).findAll()

        if (_cardList[position] != null) {
            _cardList[position]?.let { holder.cardInformationFiller(it) }
        }
    }

    class CardViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView){

        private val companyTextView = rootView.companyTextView
        private val firstNameTextView = rootView.firstNameTextView
        private val lastNameTextView = rootView.lastNameTextView
        private val jobPositionTextView = rootView.jobPositionTextView
        private val emailTextView = rootView.emailTextView
        private val phoneNumberTextView = rootView.phoneNumberTextView

        fun cardInformationFiller(newCard: CardDefinition) {

            companyTextView.text = newCard.company
            firstNameTextView.text = newCard.firstName
            lastNameTextView.text = newCard.lastName
            jobPositionTextView.text = newCard.jobPosition
            emailTextView.text = newCard.email
            phoneNumberTextView.text = newCard.phoneNumber

            
        }

    }
}
