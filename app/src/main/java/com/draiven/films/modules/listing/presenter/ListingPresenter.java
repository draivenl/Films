package com.draiven.films.modules.listing.presenter;

import com.draiven.films.common.presenter.BasePresenter;
import com.draiven.films.common.model.Film;
import com.draiven.films.modules.listing.repository.ListingRepository;
import com.draiven.films.modules.listing.view.activity.ListingActivity;

import java.util.ArrayList;

/**
 * Created by Lisandro Gómez on 11/6/17.
 */

public class ListingPresenter extends BasePresenter<ListingActivity, ListingRepository> {
    public ArrayList<Film> getFilms() {
        return getRepository().getFilms();
    }
}
