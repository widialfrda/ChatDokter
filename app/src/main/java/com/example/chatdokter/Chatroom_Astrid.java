package com.example.chatdokter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Chatroom_Astrid extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatroom__astrid);
    }

    public void back5(View view) {
        Intent intent11 = new Intent(Chatroom_Astrid.this, MainActivity.class);
        startActivity(intent11);
        finish();
    }
}