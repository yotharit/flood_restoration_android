package com.yotharit.ittp_mobile.ui.result

import com.yotharit.ittp_mobile.common.base.BaseMvpPresenter
import com.yotharit.ittp_mobile.ui.result.util.LogicUtil

class ResultPresenter(view : ResultContractor.View) : BaseMvpPresenter<ResultContractor.View>(view) , ResultContractor.Presenter {

    lateinit var logicUtil: LogicUtil

    override fun getView(): ResultContractor.View {
        return super.getView()
    }

    override fun start() {
        logicUtil = LogicUtil.getInstance()
        view.requestSuggestion()
    }

    override fun stop() {

    }

    companion object {
        fun createPresenter(view: ResultContractor.View): ResultPresenter {
            return ResultPresenter(view)
        }
    }

    override fun getSuggestion(category: String, contact: String, contractor: String, type: String, info: String) {
        view.showSuggestion(logicUtil.getSuggestion(category,contact,contractor,type,info))
    }
}