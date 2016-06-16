package com.example.user1.nfctagapp;



import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


import com.example.user1.nfctagapp.DataObjects.Clue;


public class FoundClueActivity extends AppCompatActivity {
    SharedPreferences mSharedPref;
    String lastPath;
    int clueNum;
    int clueValue;
    TextView t;
    Clue[] clues1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_found_clue);
        mSharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        Intent intent = getIntent();
        Uri uri = intent.getData();                 // retrieves a Uri object or instance
        lastPath = uri.getLastPathSegment();  // retrieves the string representation of the URI
        t = (TextView) findViewById(R.id.clueNum);
        clueNum=Integer.parseInt(lastPath);
        clueValue = mSharedPref.getInt("userCurrentClue",0);
        if(clueNum==clueValue){


            if(clueNum==clueValue){
                t.setText("Found the correct Clue");
            }
            else {
                t.setText("You have already tapped it");
            }
        }
        else if(clueNum>clueValue){
            t.setText("Found the clue too early");     //condition that checks if the clue is found too early
        }
        else{
            t.setText("This clue has already been found");
        }

    }

    public void toWinActivity(View v){
        String[] clues = getResources().getStringArray(R.array.clues);
        int n=clues.length;
        if (clueNum==2 && clueValue==2){
            Intent i = new Intent(this,WinActivity.class);
            startActivity(i);                                           //When the last clue is found, it goes to winActivity
        }
        else if(clueNum==clueValue){
            Intent i = new Intent(this,CurrentClueActivity.class);
            SharedPreferences.Editor editor = mSharedPref.edit();
            editor.putInt("userCurrentClue", clueValue+1);
            editor.commit();
            startActivity(i);
        }
        else{
            Intent i = new Intent(this,CurrentClueActivity.class);
            startActivity(i);
        }
    }
}