package com.yotharit.ittp_mobile.ui.result

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.yotharit.ittp_mobile.R
import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
import com.yotharit.ittp_mobile.ui.flood.FloodingActivity
import com.yotharit.ittp_mobile.ui.landing.LandingPresenter
import com.yotharit.ittp_mobile.ui.landing.dialog.HelpDialogFragment
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import kotlinx.android.synthetic.main.landing_layout.*
import kotlinx.android.synthetic.main.result_layout.*
import java.util.*

class ResultActivity : BaseMvpActivity<ResultContractor.Presenter>() , ResultContractor.View {

    lateinit var contact : String
    lateinit var contractor: String
    lateinit var category : String
    lateinit var type : String
    lateinit var info : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getBundle()
    }

    fun getBundle() {
        val bundle = intent.getBundleExtra("bundle")

        if(bundle!=null) {
            contact = bundle.getString("contact")!!
            contractor = bundle.getString("contractor")!!
            category = bundle.getString("category")!!
            type = bundle.getString("type")!!
            info = bundle.getString("info")!!
        }
    }

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    override fun createPresenter() {
        ResultPresenter.createPresenter(this)
    }

    override fun getLayoutView(): Int {
        return R.layout.result_layout
    }

    override fun bindView() {

    }

    override fun setupView() {

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
        presenter.start()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun requestSuggestion() {
        presenter.getSuggestion(category,contact,contractor,type,info)
    }

    override fun showSuggestion(suggestion: String) {
        suggestionText.text = suggestion
    }
}