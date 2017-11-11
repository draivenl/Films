package com.draiven.films.modules.listing.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.draiven.films.R;
import com.draiven.films.common.view.activity.BaseActivity;
import com.draiven.films.modules.listing.presenter.ListingPresenter;
import com.draiven.films.modules.listing.repository.ListingRepository;
import com.draiven.films.modules.listing.view.adapter.ListingAdapter;

public class ListingActivity extends BaseActivity<ListingPresenter, ListingRepository> {

    private RecyclerView rvFilmsListing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        setupMVP(new ListingPresenter(), new ListingRepository());

        initViews();
        callAdapter();

    }

    private void initViews() {
        rvFilmsListing = (RecyclerView) findViewById(R.id.listing_rv_films);
    }

    private void callAdapter(){
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        rvFilmsListing.setLayoutManager(linearLayoutManager);

        ListingAdapter listingAdapter = new ListingAdapter(getPresenter().getFilms(), R.layout.activity_listing_item, this);
        rvFilmsListing.setAdapter(listingAdapter);
    }

}
