package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicDSActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_ds);

        TextView ds = (TextView) findViewById(R.id.ds);
        ds.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
