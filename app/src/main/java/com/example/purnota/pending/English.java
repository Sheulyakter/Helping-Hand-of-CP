package com.example.purnota.pending;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);



        Button link1 = (Button) findViewById(R.id.link1);
        link1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://www.hackerearth.com/@amangoel.vsec";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link2 = (Button) findViewById(R.id.link2);
        link2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://www.codechef.com/wiki/tutorial-dynamic-programming";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link3 = (Button) findViewById(R.id.link3);
        link3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://www.topcoder.com/community/data-science/data-science-tutorials/maximum-flow-section-2/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link4 = (Button) findViewById(R.id.link4);
        link4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://www.math.ucla.edu/~tom/Game_Theory/comb.pdf";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link5 = (Button) findViewById(R.id.link5);
        link5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://www.topcoder.com/community/data-science/data-science-tutorials/introduction-to-graphs-and-their-data-structures-section-2/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link6 = (Button) findViewById(R.id.link6);
        link6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://stackoverflow.com/questions/7887487/how-to-spot-a-greedy-algorithm";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link7 = (Button) findViewById(R.id.link7);
        link7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://www.aduni.org/courses/discrete/index.php?view=cw";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link8 = (Button) findViewById(R.id.link8);
        link8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://zobayer.blogspot.in/2010/11/matrix-exponentiation.html";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link9 = (Button) findViewById(R.id.link9);
        link9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://blog.anudeep2011.com/persistent-segment-trees-explained-with-spoj-problems/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link10 = (Button) findViewById(R.id.link10);
        link10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="http://marknelson.us/1996/08/01/suffix-trees/";
                Uri webaddress= Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link11 = (Button) findViewById(R.id.link11);
        link11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://www.hackerearth.com/users/ayusha1107/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });

        Button link12 = (Button) findViewById(R.id.link12);
        link12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String lnk="https://www.hackerearth.com/notes/trees/";
                Uri webaddress=Uri.parse(lnk);
                Intent gotolnk = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotolnk.resolveActivity(getPackageManager())!=null)
                    startActivity(gotolnk);
            }
        });




    }
}
