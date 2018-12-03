package com.yotharit.ittp_mobile.modal

import java.io.Serializable
import java.util.*

class UserId : Serializable {

    //According to DOPA API

    var citizenId: String = ""
    var nameEN_Prefix: String = ""
    var nameEN_FirstName: String = ""
    var nameEN_MiddleName: String = ""
    var nameEN_SurName: String = ""
    var nameTH_FirstName: String = ""
    var nameTH_MiddleName: String = ""
    var nameTH_SurName: String = ""
    var sexId: Int = MALE_SEX_ID
    var sex = MALE_SEX
    var birthDate: Date? = null
    var age: Int = UNIDENTIFY_SEX_ID
    var personStatusId: Int = UNIDENTIFY_PERSON_STATUS_ID
    var personStatus: String = UNIDENTIFY_PERSON_STATUS
    var addressId: String = ""
    var addressNo: String = ""
    var addressMoo: String = ""
    var addressAlley: String = ""
    var addressSoi: String = ""
    var addressRoad: String = ""
    var addressTumbol: String = ""
    var addressAmphur: String = ""
    var issueDate: Date? = null
    var expireDate: Date? = null
    var issuerId: String = ""
    var issuerPlace: String = ""
    var issuerAgency: String = ""
    var nationality: String = ""
    var nationalityOld: String = ""
    var nationalityChangeDate: Date? = null
    var fatherCitizenId: String = ""
    var fatherFirstNameEN: String = ""
    var fatherFirstNameTH: String = ""
    var motherCitizenId: String = ""
    var motherFirstNameEN: String = ""
    var motherFirstNameTH: String = ""
    var domicileType: String = ""
    var domicileStatus: String = ""
    var domicileDate: Date? = null


    companion object {
        val UNIDENTIFY_SEX_ID = 0
        val MALE_SEX_ID = 1
        val FEMALE_SEX_ID = 2

        val UNIDENTIFY_SEX = "ไม่ระบุ"
        val MALE_SEX = "ขาย"
        val FEMALE_SEX = "หญิง"

        val UNIDENTIFY_PERSON_STATUS_ID = 0
        val ALIVE_PERSON_STATUS_ID = 1
        val DEATH_PERSON_STATUS_ID = 2
        val SOLD_PERSON_STATUS_ID = 3

        val UNIDENTIFY_PERSON_STATUS = "ไม่ระบุ"
        val ALIVE_PERSON_STATUS = "มีชีวิตอยู่"
        val DEATH_PERSON_STATUS = "เสียชีวิต"
        val SOLD_PERSON_STATUS = "จำหน่าย"
    }


}