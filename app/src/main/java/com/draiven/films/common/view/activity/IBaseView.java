package com.draiven.films.common.view.activity;

/**
 * Created by draiven on 10/1/17.
 */

public interface IBaseView {
    public  void showProgress(int message);
    public  void hideProgress();

    public void showToast(int resId);

    boolean isConnected();
}
