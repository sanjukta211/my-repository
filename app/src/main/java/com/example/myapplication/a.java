package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageButton;

public class a extends AppCompatActivity {
    ImageButton b;
    EditText e;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        e = (EditText)findViewById(R.id.editText4);

        b = (ImageButton)findViewById(R.id.imageButton6);
    }
}
