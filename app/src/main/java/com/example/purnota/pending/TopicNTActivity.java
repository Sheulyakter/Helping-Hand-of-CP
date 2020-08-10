package com.example.purnota.pending;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class TopicNTActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic_nt);


        TextView ntintro = (TextView) findViewById(R.id.ntintro);
        ntintro.setMovementMethod(LinkMovementMethod.getInstance());

        TextView primeLinks = (TextView) findViewById(R.id.primeLinks);
        primeLinks.setMovementMethod(LinkMovementMethod.getInstance());

        TextView divisor = (TextView) findViewById(R.id.divisor);
        divisor.setMovementMethod(LinkMovementMethod.getInstance());

        TextView modular = (TextView) findViewById(R.id.modular);
        modular.setMovementMethod(LinkMovementMethod.getInstance());

        TextView combinatorics = (TextView) findViewById(R.id.combinatorics);
        combinatorics.setMovementMethod(LinkMovementMethod.getInstance());

        TextView Euclid = (TextView) findViewById(R.id.Euclid);
        Euclid.setMovementMethod(LinkMovementMethod.getInstance());

        TextView prob = (TextView) findViewById(R.id.prob);
        prob.setMovementMethod(LinkMovementMethod.getInstance());

        TextView nt_other = (TextView) findViewById(R.id.nt_other);
        nt_other.setMovementMethod(LinkMovementMethod.getInstance());




    }
}
