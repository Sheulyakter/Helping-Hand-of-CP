package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicSrcNSortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_src_nsort);

        TextView sort = (TextView) findViewById(R.id.sort);
        sort.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
