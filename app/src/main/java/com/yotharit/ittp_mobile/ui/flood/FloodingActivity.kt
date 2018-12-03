package com.yotharit.ittp_mobile.ui.flood

import android.content.Context
import android.os.Bundle
import android.widget.ArrayAdapter
import com.yotharit.ittp_mobile.R
import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
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


}