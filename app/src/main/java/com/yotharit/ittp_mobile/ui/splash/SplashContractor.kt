package com.yotharit.ittp_mobile.ui.splash

import com.yotharit.ittp_mobile.common.base.BaseMvpContractorPresenter
import com.yotharit.ittp_mobile.common.base.BaseMvpContractorView

class SplashContractor {

    interface Presenter : BaseMvpContractorPresenter {
        fun requestSplash()
    }

    interface View : BaseMvpContractorView<Presenter> {
        fun sendSplash()
    }

}

