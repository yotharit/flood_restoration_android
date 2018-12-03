package com.yotharit.ittp_mobile.ui.splash

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.yotharit.ittp_mobile.R
import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
import com.yotharit.ittp_mobile.ui.flood.FloodingActivity
import com.yotharit.ittp_mobile.ui.landing.LandingActivity
import io.github.inflationx.viewpump.ViewPumpContextWrapper


class SplashActivity : BaseMvpActivity<SplashContractor.Presenter>(), SplashContractor.View {


    private val SPLASH_DELAY = 2000L
    private val mHandler = Handler()
    private val mLauncher = Launcher()

    override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
    }

    override fun createPresenter() {
        SplashPresenter.createPresenter(this)
    }

    override fun getLayoutView(): Int {
        return R.layout.splash_layout
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
        mHandler.postDelayed(mLauncher, SPLASH_DELAY)
    }

    override fun onStop() {
        super.onStop()
        mHandler.removeCallbacks(mLauncher)
    }

    override fun sendSplash() {
        startActivity(Intent(this, LandingActivity::class.java))
        overridePendingTransition(R.anim.fade_in, R.anim.fade_out)
        finish()
    }

    private inner class Launcher : Runnable {
        override fun run() {
            presenter.requestSplash()
        }
    }

}