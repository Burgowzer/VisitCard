package com.burgowzer.visitcard

import io.realm.RealmObject
import io.realm.annotations.RealmClass

@RealmClass
open class CardDefinition: RealmObject () {
    var company: String =""
    var firstName: String=""
    var lastName: String=""
    var email: String=""
    var jobPosition: String=""
    var phoneNumber:  String=""
}