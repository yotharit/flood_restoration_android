package com.yotharit.ittp_mobile.ui.flood

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.yotharit.ittp_mobile.R
import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
import com.yotharit.ittp_mobile.ui.result.ResultActivity
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import kotlinx.android.synthetic.main.flooding_layout.*


class FloodingActivity : BaseMvpActivity<FloodingContractor.Presenter>(), FloodingContractor.View {

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    override fun createPresenter() {
        FloodingPresenter.createPresenter(this)
    }

    override fun getLayoutView(): Int {
        return R.layout.flooding_layout
    }

    override fun bindView() {
    }

    override fun setupView() {

        val categories = ArrayList<String>()
        categories.add("ประตู")
        categories.add("หน้าต่าง")
        categories.add("พื้นบ้าน")
        categories.add("ฉนวนความร้อน")
        categories.add("วัสดุชั้นนอก")
        categories.add("โครงบ้าน")
        categories.add("ระบบไฟฟ้า")
        categories.add("เครื่องใช้ไฟฟ้า")
        categories.add("เฟอนิเจอร์")

        val categoriesAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, categories)

        categorySpinner.setAdapter(categoriesAdapter)

        categorySpinner.setOnSpinnerItemClickListener { i, s ->
            //something
        }

        val type = ArrayList<String>()
        type.add("ซีเมนต์")
        type.add("ไม้")
        type.add("อื่นๆ")

        val typeAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, type)

        typeSpinner.setAdapter(typeAdapter)

        typeSpinner.setOnSpinnerItemClickListener { i, s ->
            //something
        }

        val damages = ArrayList<String>()
        damages.add("เปียก")
        damages.add("โดนน้ำเล็กน้อย")
        damages.add("ชำรุด")
        damages.add("ปลวก")
        damages.add("จมน้ำ")
        damages.add("เชื้อรา")
        damages.add("ติดขัด")
        damages.add("เป็นรอย")
        damages.add("เป็นรู")
        damages.add("เป็นสนิม")

        val damagesAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, damages)

        infoSpinner.setAdapter(damagesAdapter)

        infoSpinner.setOnSpinnerItemClickListener { i, s ->
            //something
        }

        val contractor  = ArrayList<String>()
        contractor.add("P Build Corporation(Thailand) Co.,Ltd.")
        contractor.add("M TOP Corporation Co.,Ltd")
        contractor.add("Conxecute")

        val contractorAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, contractor)

        contractorSpinner.setAdapter(contractorAdapter)
        contractorSpinner.setOnSpinnerItemClickListener { i, s ->
            //something
        }

        continueBtn.setOnClickListener {
            presenter.requestBundle()
        }
    }

    override fun restoreArgument(extras: Bundle?) {
    }

    override fun initialize() {
    }

    override fun restoreInstanceState(savedInstanceState: Bundle?) {
    }

    override fun restoreView() {
    }

    override fun saveInstanceState(outState: Bundle?) {
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onStop() {
        super.onStop()

    }

    override fun sendInfo() {
        val contact = contactEditText.text.toString()
        val contractor = contractorSpinner.selectedItem
        val category = categorySpinner.selectedItem
        val types = typeSpinner.selectedItem
        val info = infoSpinner.selectedItem

        if (contact != "" && contractor != "" && category != "" && types != "" && info != ""){
            val bundle = Bundle()
            bundle.putString("contact",contact)
            bundle.putString("contractor",contractor)
            bundle.putString("category",category)
            bundle.putString("type",types)
            bundle.putString("info",info)
            presenter.requestHelp(bundle)
        }
        else {
            Toast.makeText(this,"โปรดใส่ข้อมูลให้ครบ",Toast.LENGTH_LONG).show()
        }

    }

    override fun getHelp(bundle: Bundle) {
        val intent = Intent(this,ResultActivity::class.java)
        intent.putExtra("bundle",bundle)
        startActivity(intent)
    }

}