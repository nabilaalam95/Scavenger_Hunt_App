package com.example.user1.nfctagapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class WinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
    }

    //method for the restart game button
    public void restartGame(View view) {
        Intent intent=new Intent(this, StartDescriptionActivity.class);
        startActivity(intent);
    }
}
