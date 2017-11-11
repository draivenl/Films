package com.draiven.films.modules.listing.repository;

import com.draiven.films.common.repository.BaseRepository;
import com.draiven.films.common.model.Film;

import java.util.ArrayList;

/**
 * Created by Lisandro Gómez on 11/6/17.
 */

public class ListingRepository extends BaseRepository {
    public ArrayList<Film> getFilms() {
        ArrayList<Film> films = new ArrayList<>();
        films.add(new Film("Movie1", "Action", 3.0, "http://is1.mzstatic.com/image/thumb/Video128/v4/85/08/b4/8508b445-2b09-d4a9-e77c-c55200bca425/source/100x100bb.jpg"));
        films.add(new Film("Movie2", "Drama", 5.0, "http://is1.mzstatic.com/image/thumb/Video128/v4/85/08/b4/8508b445-2b09-d4a9-e77c-c55200bca425/source/100x100bb.jpg"));
        films.add(new Film("Movie3", "Comedy", 4.5, "http://is1.mzstatic.com/image/thumb/Video128/v4/85/08/b4/8508b445-2b09-d4a9-e77c-c55200bca425/source/100x100bb.jpg"));
        films.add(new Film("Movie4", "Fiction", 1.3, "http://is1.mzstatic.com/image/thumb/Video128/v4/85/08/b4/8508b445-2b09-d4a9-e77c-c55200bca425/source/100x100bb.jpg"));
        films.add(new Film("Movie5", "Fiction", 2.3, "http://is1.mzstatic.com/image/thumb/Video128/v4/85/08/b4/8508b445-2b09-d4a9-e77c-c55200bca425/source/100x100bb.jpg"));
        films.add(new Film("Movie6", "Fiction", 4.0, "http://is1.mzstatic.com/image/thumb/Video128/v4/85/08/b4/8508b445-2b09-d4a9-e77c-c55200bca425/source/100x100bb.jpg"));


        return films;
    }
}
