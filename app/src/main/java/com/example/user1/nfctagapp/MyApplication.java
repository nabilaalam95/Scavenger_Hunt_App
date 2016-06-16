package com.example.user1.nfctagapp;

import android.app.Application;
import android.widget.TextView;

import com.example.user1.nfctagapp.DataObjects.Clue;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * Created by User1 on 6/11/2016.
 */

public class MyApplication extends Application {
    Clue[] clues;


    //TextView mClueTextView;

    @Override
    public void onCreate(){
        super.onCreate();
        String[] clues_string = getResources().getStringArray(R.array.clues);
        clues=new Clue[clues_string.length];

        for( int i=0;i<clues_string.length; i++) {
            clues[i] = new Clue(clues_string[i], i);
        }

    }

    public Clue[] getCLUES(){
            return clues;
    }
}
