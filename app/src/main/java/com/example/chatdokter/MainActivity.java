package com.example.chatdokter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
    }

    public void chatdeasy(View view) {
        Intent intent1 = new Intent(MainActivity.this, Chatroom_deasy.class);
        startActivity(intent1);
        finish();
    }

    public void chatjohan(View view) {
        Intent intent2 = new Intent(MainActivity.this, Chatroom_Johan.class);
        startActivity(intent2);
        finish();
    }

    public void chatanita(View view) {
        Intent intent3 = new Intent(MainActivity.this, Chatroom_Anita.class);
        startActivity(intent3);
        finish();
    }

    public void chatdicky(View view) {
        Intent intent4 = new Intent(MainActivity.this, Chatroom_Dicky.class);
        startActivity(intent4);
        finish();
    }

    public void chatastrid(View view) {
        Intent intent5 = new Intent(MainActivity.this, Chatroom_Astrid.class);
        startActivity(intent5);
        finish();
    }

    public void chatlydia(View view) {
        Intent intent6 = new Intent(MainActivity.this, Chatroom_Lydiawati.class);
        startActivity(intent6);
        finish();
    }
}