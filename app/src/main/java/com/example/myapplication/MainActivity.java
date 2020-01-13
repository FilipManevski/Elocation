package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.Connection;


public class MainActivity extends AppCompatActivity {



    EditText sifraKorisnik,sifraPatrola;
     Button okButton;
     DatabaseElocation db;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseElocation(this);


        sifraPatrola = (EditText)findViewById(R.id.sifraPatrola);

        sifraKorisnik =(EditText)findViewById(R.id.sifraKorisnik);
        okButton = (Button)findViewById(R.id.okButton);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });


    }
}
