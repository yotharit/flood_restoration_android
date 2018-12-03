package com.yotharit.ittp_mobile.ui.result.repository

import com.yotharit.ittp_mobile.ui.result.modal.Contractor

class MockRepository private constructor(){

    var PBuilding : ArrayList<Contractor>
    var MTop : ArrayList<Contractor>
    var Conxecute : ArrayList<Contractor>


    init {

        PBuilding = ArrayList()
        MTop = ArrayList()
        Conxecute = ArrayList()

        PBuilding.add(Contractor("สมชาย ไพรชำนาญ","ช่างรับเหมา"))
        PBuilding.add(Contractor("พงษ์ศักดิ๋ กิตติประภา","ช่างไม้"))
        PBuilding.add(Contractor("สมจิต วิจิตรพงษ์","ช่างไฟฟ้า"))

        MTop.add(Contractor("ธนภัทร แล้วใจ","ช่างรับเหมา"))
        MTop.add(Contractor("พิสิตพงษ์ วงศ์ถนอม","ช่างไม้"))
        MTop.add(Contractor("อครพงศ์ ชีพจันทร์","ช่างไฟฟ้า"))


        Conxecute.add(Contractor("ธีระยุทธ์ อรสว่าง","ช่างรับเหมา"))
        Conxecute.add(Contractor("ชุติมา เรืองวัฒน์","ช่างไม้"))
        Conxecute.add(Contractor("ชนากาญจน์ ประกาสิทธิ์","ช่างไฟฟ้า"))

    }

    companion object {

        private var instance: MockRepository? = null

        fun getInstance(): MockRepository {
            if (instance == null)
                instance = MockRepository()
            return instance!!
        }
    }

}