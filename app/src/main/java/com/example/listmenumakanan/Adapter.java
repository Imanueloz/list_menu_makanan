package com.example.listmenumakanan;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends ArrayAdapter {
    String[] nama_makanan;
    String[] harga_makanan;
    int[] img_gambar;
    Activity activity;

    public Adapter(String[] nama_makanan, String[] harga_makanan, int[] img_gambar, Activity activity) {
        super(activity, R.layout.list_item, nama_makanan);
        this.nama_makanan = nama_makanan;
        this.harga_makanan = harga_makanan;
        this.img_gambar = img_gambar;
        this.activity = activity;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = activity.getLayoutInflater();
        @SuppressLint({"ViewHolder", "InflateParams"}) View v = inflater.inflate(R.layout.list_item, null);

        ImageView gambar;
        TextView nm_makanan;
        TextView price_makanan;

        gambar = v.findViewById(R.id.img_makanan);
        nm_makanan = v.findViewById(R.id.nama_makanan);
        price_makanan = v.findViewById(R.id.harga_makanan);

        gambar.setImageResource(img_gambar[position]);
        nm_makanan.setText(nama_makanan[position]);
        price_makanan.setText(harga_makanan[position]);

        return v;
    }
}
