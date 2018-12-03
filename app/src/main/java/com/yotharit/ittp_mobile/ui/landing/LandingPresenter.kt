package com.yotharit.ittp_mobile.ui.landing

import com.yotharit.ittp_mobile.common.base.BaseMvpPresenter

class LandingPresenter(view : LandingContractor.View) : BaseMvpPresenter<LandingContractor.View>(view) , LandingContractor.Presenter {

    override fun getView(): LandingContractor.View {
        return super.getView()
    }

    override fun start() {

    }

    override fun stop() {

    }

    companion object {
        fun createPresenter(view: LandingContractor.View): LandingPresenter {
            return LandingPresenter(view)
        }
    }

    override fun requestHelp() {
        val text = "Flood เป็นแอพพลิเคชั่นที่ออกแบบมาเพื่ออำนวยความสะดวก และให้คำแนะนำกับผู้ใช้ ในเรื่องการทำนุบำรุงรักษา บ้านของท่านหลังเผชิญอุทกภัย" +
                "\n\n SKE14."
        view.openHelp(text)
    }

    override fun requestStep() {
        view.nextStep()
    }
}