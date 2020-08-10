package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_game);

        TextView game= (TextView) findViewById(R.id.game);
        game.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
