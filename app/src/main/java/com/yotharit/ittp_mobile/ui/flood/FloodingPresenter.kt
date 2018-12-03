package com.yotharit.ittp_mobile.ui.flood

import android.os.Bundle
import com.yotharit.ittp_mobile.common.base.BaseMvpPresenter
import com.yotharit.ittp_mobile.ui.splash.SplashContractor
import com.yotharit.ittp_mobile.ui.splash.SplashPresenter

class FloodingPresenter(view : FloodingContractor.View) : BaseMvpPresenter<FloodingContractor.View>(view) , FloodingContractor.Presenter {
    override fun getView(): FloodingContractor.View {
        return super.getView()
    }

    override fun start() {

    }

    override fun stop() {

    }

    companion object {
        fun createPresenter(view: FloodingContractor.View): FloodingPresenter {
            return FloodingPresenter(view)
        }
    }

    override fun requestBundle() {
        view.sendInfo()
    }

    override fun requestHelp(bundle: Bundle) {
        view.getHelp(bundle)
    }

}