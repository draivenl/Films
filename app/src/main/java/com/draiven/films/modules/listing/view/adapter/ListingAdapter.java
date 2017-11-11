package com.draiven.films.modules.listing.view.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CalendarView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.draiven.films.R;
import com.draiven.films.common.model.Film;
import com.draiven.films.modules.listing.view.activity.FilmActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Lisandro Gómez on 11/7/17.
 */

public class ListingAdapter extends RecyclerView.Adapter<ListingAdapter.FilmViewHolder> {
    private ArrayList<Film> films;
    private int resource;
    private Activity activity;

    public ListingAdapter(ArrayList<Film> films, int resource, Activity activity) {
        this.films = films;
        this.resource = resource;
        this.activity = activity;
    }

    @Override
    public FilmViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(resource, parent, false);
        return new FilmViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FilmViewHolder holder, int position) {
        Film film = films.get(position);
        holder.name.setText(film.getName());
        holder.genre.setText(film.getGenre());
        Picasso.with(activity).load(film.getUrlImgSmall()).into(holder.image);

        int stars = film.getRating().intValue();


        for (int i = 0; i < stars; i++ ) {
            ImageView star = new ImageView(activity);
            star.setImageResource(R.drawable.ic_star_black_24dp);
            holder.rating.addView(star);
        }
        int emptyStars = 5 - stars;
        if (stars != film.getRating()){
            ImageView star = new ImageView(activity);
            star.setImageResource(R.drawable.ic_star_half_black_24dp);
            holder.rating.addView(star);
            emptyStars--;
        }
        for (int i = 0; i < emptyStars; i++ ) {
            ImageView star = new ImageView(activity);
            star.setImageResource(R.drawable.ic_star_border_black_24dp);
            holder.rating.addView(star);
        }

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity.getApplicationContext(), FilmActivity.class);
                activity.startActivity(intent);
            }
        });





    }

    @Override
    public int getItemCount() {
        return films.size();
    }


    class FilmViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView name;
        private TextView genre;
        private LinearLayout rating;
        private CardView card;


        FilmViewHolder(View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.listing_item_image);
            name = itemView.findViewById(R.id.listing_item_name);
            genre = itemView.findViewById(R.id.listing_item_genre);
            rating = itemView.findViewById(R.id.listing_item_rating);
            card = itemView.findViewById(R.id.list_item_cardview);
        }
    }
}
