package com.draiven.films.common.helper;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by draiven on 9/16/17.
 */

public class ValidateInternet {

    private Context context;

    public ValidateInternet(Context context) {
        this.context = context;
    }

    public boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        return networkInfo != null && networkInfo.isConnectedOrConnecting() && networkInfo.isAvailable() && networkInfo.isConnected();
    }


}
