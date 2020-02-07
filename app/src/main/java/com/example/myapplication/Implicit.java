package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Implicit extends AppCompatActivity {
    ImageButton s,c,m,next;
    EditText e;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);
        s = (ImageButton)findViewById(R.id.imageButton);

        c = (ImageButton)findViewById(R.id.imageButton3);

        m = (ImageButton)findViewById(R.id.imageButton4);

        e = (EditText)findViewById(R.id.editText);

        next = (ImageButton)findViewById(R.id.imageButton5);

        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent search = new Intent(Intent.ACTION_VIEW, Uri.parse("https:\\www.google.com\\search?query="+e.getText().toString()));
                startActivity(search);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:"+e.getText().toString()));
                startActivity(call);
            }
        });

        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent map = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q="+e.getText().toString()));
                startActivity(map);
            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(getApplicationContext(),a.class);
                startActivity(next);
            }
        });
    }
}
