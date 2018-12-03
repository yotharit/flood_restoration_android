package com.yotharit.ittp_mobile.ui.result

import com.yotharit.ittp_mobile.common.base.BaseMvpContractorPresenter
import com.yotharit.ittp_mobile.common.base.BaseMvpContractorView

class ResultContractor {

    interface Presenter : BaseMvpContractorPresenter {
        fun getSuggestion(category: String , contact: String, contractor: String, type: String, info: String)
    }

    interface View : BaseMvpContractorView<Presenter> {
        fun requestSuggestion()
        fun showSuggestion(suggestion : String)
    }

}