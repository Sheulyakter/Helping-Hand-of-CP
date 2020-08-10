package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicGraphActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_graph);

        TextView graph= (TextView) findViewById(R.id.graph);
        graph.setMovementMethod(LinkMovementMethod.getInstance());


    }
}
