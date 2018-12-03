package com.yotharit.ittp_mobile.ui.landing

import com.yotharit.ittp_mobile.common.base.BaseMvpContractorPresenter
import com.yotharit.ittp_mobile.common.base.BaseMvpContractorView

class LandingContractor {

    interface Presenter : BaseMvpContractorPresenter {
        fun requestHelp()
        fun requestStep()
    }

    interface View : BaseMvpContractorView<Presenter> {
        fun openHelp(text: String)
        fun nextStep()
    }

}