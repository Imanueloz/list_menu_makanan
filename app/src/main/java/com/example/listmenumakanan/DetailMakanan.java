package com.example.listmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambarmakanan_masuk;
    TextView namafood_masuk, ketfood_masuk;

    String name_kunci="namamakanan";
    String ket_kunci="keter";
    int gambaremakanan;

    String namamakananku;
    String ketmakananku;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);

        gambarmakanan_masuk=findViewById(R.id.gambarterima);
        namafood_masuk=findViewById(R.id.namefood);
        ketfood_masuk=findViewById(R.id.ketfood);

        Bundle bundle=getIntent().getExtras();

        gambaremakanan=bundle.getInt(String.valueOf("gambaremakanan"));
        gambarmakanan_masuk.setImageResource(gambaremakanan);
        namamakananku=bundle.getString("namamakanan");
        ketmakananku=bundle.getString("keter");
        namafood_masuk.setText(namamakananku);
        ketfood_masuk.setText(ketmakananku);


    }
}