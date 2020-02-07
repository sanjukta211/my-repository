package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    EditText to, sub, body;
    ImageButton img,next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        to = (EditText) findViewById(R.id.editText);

        sub = (EditText) findViewById(R.id.editText2);

        body = (EditText) findViewById(R.id.editText3);

        img = (ImageButton) findViewById(R.id.imageButton);

        next = (ImageButton)findViewById(R.id.imageButton2);

        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gmail = new Intent(Intent.ACTION_SEND);
                gmail.putExtra(Intent.EXTRA_EMAIL,new String[]{(to.getText().toString())});

                gmail.putExtra(Intent.EXTRA_SUBJECT,sub.getText().toString());

                gmail.putExtra(Intent.EXTRA_TEXT,body.getText().toString());

                gmail.setType("message/rfc822");

                startActivity(Intent.createChooser(gmail,"Your choice please"));


            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(getApplicationContext(),Implicit.class);
                startActivity(next);
            }
        });


    }
}
