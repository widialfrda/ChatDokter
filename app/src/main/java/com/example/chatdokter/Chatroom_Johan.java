package com.example.chatdokter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chatroom_Johan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom__johan);
    }

    public void back2(View view) {
        Intent intent14 = new Intent(Chatroom_Johan.this, MainActivity.class);
        startActivity(intent14);
        finish();
    }
}