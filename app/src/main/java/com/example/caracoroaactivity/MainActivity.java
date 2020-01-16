package com.example.caracoroaactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;


public class MainActivity extends Activity {

    private ImageView jogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.jogar = findViewById(R.id.btn_id_jogar);

        Random rando = new Random();

        final Intent intent = new Intent(MainActivity.this, DetailActivity.class);

        intent.putExtra("num", rando.nextInt(2));

        this.jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });

    }
}
