package com.example.guuglekids;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.muddzdev.styleabletoastlibrary.StyleableToast;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);;

        getSupportActionBar().setTitle("Select Branch");
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
    }

    public void nursury(View view) {
        Intent intent = new Intent(dashboard.this, Nursury.class);
        startActivity(intent);
    }

    public void play(View view) {

        StyleableToast.makeText(dashboard.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void jr(View view) {

        StyleableToast.makeText(dashboard.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void sr(View view) {

        StyleableToast.makeText(dashboard.this, "Updating soon", Toast.LENGTH_LONG, R.style.mytoast).show();
    }

    public void aboutus(View view) {

        Intent intent = new Intent(dashboard.this, aboutus.class);
        startActivity(intent);
    }
}
