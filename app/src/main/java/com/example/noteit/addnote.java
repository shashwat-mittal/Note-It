package com.example.noteit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toolbar;

public class addnote extends AppCompatActivity {
    Toolbar toolbar;
    EditText notetitle, notedetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnote);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        notedetails=findViewById(R.id.notedetails);
        notetitle=findViewById(R.id.notetitle);
    }

}