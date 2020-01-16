package com.example.caracoroaactivity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.core.content.ContextCompat;


public class DetailActivity extends Activity {

    private ImageView moeda;
    private ImageView voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        this.moeda = findViewById(R.id.id_moeda);
        this.voltar = findViewById(R.id.btn_id_voltar);

        Bundle extra = getIntent().getExtras();

        int num = extra.getInt("num", -1);

        if(num == 0){
            this.moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
        }else{
            this.moeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
        }

        this.voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetailActivity.this, MainActivity.class));
            }
        });
    }
}
