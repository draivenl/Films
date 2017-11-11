package com.draiven.films.common.presenter;

import com.draiven.films.common.repository.BaseRepository;
import com.draiven.films.common.view.activity.IBaseView;

public class BasePresenter<T extends IBaseView, B extends BaseRepository> {
    private T view;
    private B repository;


    public boolean isConnected(){
        return getView().isConnected();

    }


    public T getView() {
        return view;
    }

    public void setView(T view) {
        this.view = view;
    }

    public B getRepository() {
        return repository;
    }

    public void setRepository(B repository) {
        this.repository = repository;
    }
}
