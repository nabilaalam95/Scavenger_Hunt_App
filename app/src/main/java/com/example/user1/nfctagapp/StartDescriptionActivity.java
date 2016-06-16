package com.example.user1.nfctagapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartDescriptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_description);
    }

    public void gotoCurrentClueActivity(View view){
        Intent intent=new Intent(this, CurrentClueActivity.class);
        startActivity(intent);
    }
}
