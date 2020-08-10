package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class STLActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stl);

        TextView biginnerLinks = (TextView) findViewById(R.id.biginnerLinks);
        biginnerLinks.setMovementMethod(LinkMovementMethod.getInstance());

        TextView complexityLinks = (TextView) findViewById(R.id.compxityLinks);
        complexityLinks.setMovementMethod(LinkMovementMethod.getInstance());

        TextView stlLinks = (TextView) findViewById(R.id.stlLinks);
        stlLinks.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
