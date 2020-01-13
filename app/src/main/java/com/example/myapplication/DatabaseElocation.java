package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseElocation extends SQLiteOpenHelper {
    public DatabaseElocation(@Nullable Context context) {
        super(context,  "Login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("Create table TEmployee(Grouptask int primary key,PinCode int)");


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("drop table if exists user");

    }

    public boolean insert(int sifraPatrola, int sifraKorisnik)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("sifraPatrola",sifraPatrola);
        contentValues.put("sifraKorisnik",sifraKorisnik);
        long ins = db.insert("TEmployee", null,contentValues);

        if (ins==-1) return false;
        else return true;

    }
    //Checking if user exists

    public boolean sifraPatrolasifraKorisnik(String sifraPatrola, String sifraKorisnik)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from TEmployee where GroupTask=? and PinCode=?", new String[]{sifraPatrola,sifraKorisnik});
        if (cursor.getCount()>1) return false;

        
        else return true;
    }

}
