package com.yotharit.ittp_mobile.common.base;

public interface BaseMvpContractorView<CP extends BaseMvpContractorPresenter> {
    void setPresenter(CP presenter);

    void showLoading();

    void hiddenLoading();

    void showDialog(String message);
}
