package com.example.android.MuhammadSatriaWibawa_1202154224_Modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    //Deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        //Membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        //Menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        //Memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            //Memberi dan memanggil nama untuk data yang akan ditampilkan
            foods.add("Chiken Nugget");
            foods.add("Gule");
            foods.add("Ayam Bakar");
            foods.add("Iga Bakar");
            foods.add("Nasi Goreng");

            //Memanggil harga
            priceses.add(7000);
            priceses.add(18000);
            priceses.add(14000);
            priceses.add(20000);
            priceses.add(11000);

            //Memanggil foto yang ada di drawable
            photos.add(R.drawable.chikennuget);
            photos.add(R.drawable.gule);
            photos.add(R.drawable.ayambakar);
            photos.add(R.drawable.igabakar);
            photos.add(R.drawable.nasigoreng);
        }
    }
}
