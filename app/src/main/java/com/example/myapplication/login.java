package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class login extends AppCompatActivity implements OnClickListener {
    private Button buton_login, buton_daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        buton_login = (Button) findViewById(R.id.buton_login);
        buton_daftar = (Button) findViewById(R.id.buton_daftar);
        buton_login.setOnClickListener(this);
        buton_daftar.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buton_login:
                Intent intent1 = new Intent(this,home.class);
                startActivity(intent1);
                Toast.makeText(this, "Berhasil masuk", Toast.LENGTH_SHORT).show();
                break;
            case R.id.buton_daftar:
                Intent intent2 = new Intent(this,biodata.class);
                startActivity(intent2);
                Toast.makeText(this, "Silahkan daftar", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}