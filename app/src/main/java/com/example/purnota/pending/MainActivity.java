package com.example.purnota.pending;

import android.app.DownloadManager;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import static com.example.purnota.pending.R.string.about;

public class MainActivity extends AppCompatActivity  {
    Button LNT,oni,Res,cs,AB,guide,dev;
    DownloadManager downloadManagerOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LNT = (Button) findViewById(R.id.btn1);
        guide = (Button) findViewById(R.id.btn2);
        oni = (Button) findViewById(R.id.btn3);
        Res = (Button) findViewById(R.id.btn4);
        cs = (Button) findViewById(R.id.btn5);
        AB = (Button) findViewById(R.id.btn6);
        dev = (Button) findViewById(R.id.btn7);

        LNT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, LearnNewTopic.class);
                startActivity(ltnintent);
            }
        });

        guide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, ViewNDnload.class);
                startActivity(ltnintent);
            }
        });

        oni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, About.class);
                startActivity(ltnintent);
            }
        });

        Res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, Resource.class);
                startActivity(ltnintent);
            }
        });

        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, ContestSite.class);
                startActivity(ltnintent);
            }
        });

        AB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, About.class);
                startActivity(ltnintent);
            }
        });

        dev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ltnintent = new Intent(MainActivity.this, Developer.class);
                startActivity(ltnintent);
            }
        });
    }









    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.exit);
        builder.setMessage(R.string.exitmessage);

        builder.setPositiveButton("EXIT", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                finish();
            }
        });

        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });

        AlertDialog dialog = builder.show();
    }









}
