package com.example.fragmentszadacha3;

import java.util.ArrayList;

public class Contact {
    private String mName;
    private String mAddress;
    // private String mPicture;

    public Contact(String name,String address){
        this.mName = name;
        this.mAddress = address;
        //this.mPicture = picture;
    }

    public String getmName(){
        return mName;
    }

    public String getmAddress(){
        return mAddress;
    }

   // public String getmPicture(){ return mPicture; }

}
