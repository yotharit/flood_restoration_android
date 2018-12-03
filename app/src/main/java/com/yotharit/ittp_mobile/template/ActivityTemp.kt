//package com.yotharit.ittp_mobile.template
//
//import android.content.Context
//import android.content.Intent
//import android.os.Bundle
//import android.os.Handler
//import com.yotharit.ittp_mobile.R
//import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
//import com.yotharit.ittp_mobile.ui.landing.LandingActivity
//import com.yotharit.ittp_mobile.ui.splash.SplashContractor
//import com.yotharit.ittp_mobile.ui.splash.SplashPresenter
//import io.github.inflationx.viewpump.ViewPumpContextWrapper
//
//package com.yotharit.ittp_mobile.ui.splash
//
//import android.content.Context
//import android.content.Intent
//import android.os.Bundle
//import android.os.Handler
//import com.yotharit.ittp_mobile.R
//import com.yotharit.ittp_mobile.common.base.BaseMvpActivity
//import com.yotharit.ittp_mobile.ui.landing.LandingActivity
//import io.github.inflationx.viewpump.ViewPumpContextWrapper




//class SplashActivity : BaseMvpActivity<SplashContractor.Presenter>(), SplashContractor.View {
//
//
//    override fun attachBaseContext(newBase: Context) {
//        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase))
//    }
//
//    override fun createPresenter() {
//        SplashPresenter.createPresenter(this)
//    }
//
//    override fun getLayoutView(): Int {
//        return R.layout.splash_layout
//    }
//
//    override fun bindView() {
//    }
//
//    override fun setupView() {
//    }
//
//    override fun restoreArgument(extras: Bundle?) {
//    }
//
//    override fun initialize() {
//    }
//
//    override fun restoreInstanceState(savedInstanceState: Bundle?) {
//    }
//
//    override fun restoreView() {
//    }
//
//    override fun saveInstanceState(outState: Bundle?) {
//    }
//
//    override fun onStart() {
//        super.onStart()
//    }
//
//    override fun onStop() {
//        super.onStop()
//    }
//
//
//}