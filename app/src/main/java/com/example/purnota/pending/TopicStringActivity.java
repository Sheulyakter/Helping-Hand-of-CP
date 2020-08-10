package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicStringActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_string);

        TextView str= (TextView) findViewById(R.id.str);
        str.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
