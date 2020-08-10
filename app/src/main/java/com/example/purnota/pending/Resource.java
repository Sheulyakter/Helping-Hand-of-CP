package com.example.purnota.pending;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Resource extends AppCompatActivity {
    Button bangla,english;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resource);

        bangla = (Button)findViewById(R.id.bangla);
        english = (Button)findViewById(R.id.english);

       bangla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent= new Intent(Resource.this,Bangla.class);
                startActivity(ltnintent);
            }
        });

        english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent= new Intent(Resource.this,English.class);
                startActivity(ltnintent);
            }
        });
    }
}
