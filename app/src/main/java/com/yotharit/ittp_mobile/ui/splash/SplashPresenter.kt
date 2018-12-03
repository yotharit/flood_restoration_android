package com.yotharit.ittp_mobile.ui.splash

import android.app.Activity
import com.yotharit.ittp_mobile.common.base.BaseMvpPresenter

class SplashPresenter(view : SplashContractor.View) : BaseMvpPresenter<SplashContractor.View>(view) ,SplashContractor.Presenter {

    val activity = Activity()

    override fun getView(): SplashContractor.View {
        return super.getView()
    }

    override fun start() {

    }

    override fun stop() {

    }

    override fun requestSplash() {

        if (!activity.isFinishing) {
            view.sendSplash()
        }

    }

    companion object {
        fun createPresenter(view: SplashContractor.View): SplashPresenter {
            return SplashPresenter(view)
        }
    }
}