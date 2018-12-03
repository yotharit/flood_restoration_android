package com.yotharit.ittp_mobile.ui.landing

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.yotharit.ittp_mobile.R
import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
import com.yotharit.ittp_mobile.ui.flood.FloodingActivity
import com.yotharit.ittp_mobile.ui.landing.dialog.HelpDialogFragment
import io.github.inflationx.viewpump.ViewPumpContextWrapper
import kotlinx.android.synthetic.main.landing_layout.*

class LandingActivity : BaseMvpActivity<LandingContractor.Presenter>(), LandingContractor.View {

    val dialogTag = "abc"

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    override fun createPresenter() {
        LandingPresenter.createPresenter(this)
    }

    override fun getLayoutView(): Int {
        return R.layout.landing_layout
    }

    override fun bindView() {

    }

    override fun setupView() {
        helpBtn.setOnClickListener {
            getHelp()
        }
        continueBtn.setOnClickListener {
            presenter.requestStep()
        }
    }

    fun getHelp() {
        presenter.requestHelp()
    }

    override fun openHelp(text : String) {
        val builder : HelpDialogFragment.Builder = HelpDialogFragment.Builder()
        builder.setText(text)
        val fragment = builder.build()
        fragment.show(supportFragmentManager,dialogTag)
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

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun nextStep() {
        startActivity(Intent(this, FloodingActivity::class.java))
    }
}