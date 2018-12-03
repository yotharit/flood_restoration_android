package com.yotharit.ittp_mobile.ui.flood

import com.yotharit.ittp_mobile.common.base.BaseMvpContractorPresenter
import com.yotharit.ittp_mobile.common.base.BaseMvpContractorView

class FloodingContractor {

    interface Presenter : BaseMvpContractorPresenter {
    }

    interface View : BaseMvpContractorView<Presenter> {
    }

}