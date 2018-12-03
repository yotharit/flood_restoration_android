package com.yotharit.ittp_mobile.ui.result.util

import com.yotharit.ittp_mobile.ui.result.modal.Contractor
import com.yotharit.ittp_mobile.ui.result.repository.MockRepository
import java.lang.StringBuilder

class LogicUtil private constructor() {

    private var repository: MockRepository

    init {
        repository = MockRepository.getInstance()
    }

    companion object {

        private var instance: LogicUtil? = null

        fun getInstance(): LogicUtil {
            if (instance == null)
                instance = LogicUtil()
            return instance!!
        }
    }

    fun getSuggestion(category: String , contact: String, contractor: String, type: String, info: String) : String {

        val suggestion : StringBuilder = StringBuilder()
        when(category) {

            "ประตู" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "หน้าต่าง" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "พื้นบ้าน" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "ฉนวนความร้อน" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "วัสดุชั้นนอก" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "โครงบ้าน" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "ระบบไฟฟ้า" -> {
                if(info == "เป็นสนิม") {
                    suggestion.append("อาการที่พบ : ระบบไฟฟ้าเป็นสนิม")
                    suggestion.append("แนะนำวิธีแก้ไขเมื่อพบอาการนี้ : \n")
                    suggestion.append("ติดต่อช่างผู้ชำนาญการ \n")
                    var list : ArrayList<Contractor> = ArrayList()
                    when(contractor) {
                        "P Build Corporation(Thailand) Co.,Ltd." -> {
                            list = repository.PBuilding
                        }
                        "M TOP Corporation Co.,Ltd" -> {
                            list = repository.MTop
                        }
                        "Conxecute" -> {
                            list = repository.Conxecute
                        }
                    }
                    for(con in list) {
                        if(con.job == "ช่างไฟฟ้า"){
                            suggestion.append("แนะนำช่างไฟฟ้า : "+ con.name + "\nบริษัท " + contractor + "\nโดยจะมีช่างติดต่อไปหาท่านที่เบอร์ " + contact)
                        }
                    }
                    suggestion.append("")

                } else if(info == "เปียก") {
                    suggestion.append("อาการที่พบ : ระบบไฟฟ้าโดนน้ำท่วม แต่ยังไม่เป็นสนิม\n")
                    suggestion.append("แนะนำวิธีแก้ไขเมื่อพบอาการนี้ : \n")
                    suggestion.append("ตัดไฟและใช้พัดลมหรือลมร้อน ลดความชื้น และทำให้ระบบไฟฟ้าแห้งสนิท")
                    suggestion.append("\n\nหากสงสัย สามารถติดต่อสอบถามข้อมูลเพิ่มเติมได้ที่เบอร์โทรศัพท์ 1150\n" +
                            "หรืออ่านข้อมูลเพิ่มเติมได้ที่เว็ป\n" +
                            "https://www.washingtonpost.com/graphics/2017/national/flooded-homes/?noredirect=on&utm_term=.6e5f72ca3498")
                }
            }

            "เครื่องใช้ไฟฟ้า" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }

            "เฟอนิเจอร์" -> {
                suggestion.append("ยังไม่มีข้อมูลในส่วนนี้\nจะติดต่อกลับไปที่เบอร์" + contact)
            }
        }

        return suggestion.toString()

    }


}