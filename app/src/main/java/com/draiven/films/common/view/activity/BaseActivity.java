package com.draiven.films.common.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.draiven.films.R;
import com.draiven.films.common.helper.ValidateInternet;
import com.draiven.films.common.presenter.BasePresenter;
import com.draiven.films.common.repository.BaseRepository;

public class BaseActivity<T extends BasePresenter, B extends BaseRepository> extends AppCompatActivity implements IBaseView{

    private T presenter;
    private B repository;
    private ValidateInternet validateInternet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        validateInternet = new ValidateInternet(this);


    }


    public void setupMVP( T classPresenter, B classRepository ) {
        try {
            setPresenter( classPresenter );
            getPresenter().setRepository( classRepository );
        } catch( Exception e ){
            e.printStackTrace();
        }
    }


    public T getPresenter() {
        return presenter;
    }

    public void setPresenter(T presenter) {
        this.presenter = presenter;
    }

    public B getRepository() {
        return repository;
    }

    public void setRepository(B repository) {
        this.repository = repository;
    }

    @Override
    public void showProgress(int message) {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showToast(int resId) {

    }

    @Override
    public boolean isConnected() {
        return validateInternet.isConnected();
    }
}
