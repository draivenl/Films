package com.draiven.films;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.draiven.films.common.presenter.BasePresenter;
import com.draiven.films.common.repository.BaseRepository;
import com.draiven.films.common.view.activity.BaseActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupMVP(new BasePresenter(), new BaseRepository());
    }

    public void test(View view) {
        if (isConnected()) {
            Toast.makeText(this, "Conectado", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Desconectado", Toast.LENGTH_SHORT).show();
        }

    }
}
