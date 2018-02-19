package com.example.android.MuhammadSatriaWibawa_1202154224_Modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Toast.makeText(this, "MuhammadSatriaWibawa_1202154224_Modul2", Toast.LENGTH_SHORT).show(); //akan menampilkan pesan RIZKY ALAMSYAH_1202154185
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            // method untuk mengarahkan ke aktivitas selanjutnya
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        }, 4000L); //4000 L = 4 detik
    }
}
