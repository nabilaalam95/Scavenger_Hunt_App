package com.example.user1.nfctagapp.DataObjects;

/**
 * Created by User1 on 6/11/2016. By Tasin and Nabila :D
 */
public class Clue {

    private String mClue;
    private int mId;

    public Clue(String mClue, int mId){
        this.mClue = mClue;
        this.mId = mId;
    }

    public String getmClue(){
        return mClue;
    }

    public int getmId(){
        return mId;
    }

}
