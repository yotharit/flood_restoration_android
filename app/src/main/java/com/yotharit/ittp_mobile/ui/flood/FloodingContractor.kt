package com.yotharit.ittp_mobile.ui.flood

import android.os.Bundle
import com.yotharit.ittp_mobile.common.base.BaseMvpContractorPresenter
import com.yotharit.ittp_mobile.common.base.BaseMvpContractorView

class FloodingContractor {

    interface Presenter : BaseMvpContractorPresenter {
        fun requestBundle()
        fun requestHelp(bundle: Bundle)
    }

    interface View : BaseMvpContractorView<Presenter> {
        fun sendInfo()
        fun getHelp(bundle: Bundle)
    }

}