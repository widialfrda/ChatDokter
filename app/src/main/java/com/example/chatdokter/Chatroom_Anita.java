package com.example.chatdokter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chatroom_Anita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom__anita);
    }

    public void back3(View view) {
        Intent intent16 = new Intent(Chatroom_Anita.this, MainActivity.class);
        startActivity(intent16);
        finish();
    }
}