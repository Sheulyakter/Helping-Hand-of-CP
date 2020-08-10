package com.example.purnota.pending;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ViewNDnload extends AppCompatActivity {
    Button v,d;

    DownloadManager downloadManagerOne;
    String ss="You opened it";
    String ddd="Downloading Start";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_ndnload);


        Button v=(Button) findViewById(R.id.view) ;
        Button d=(Button) findViewById(R.id.dnld) ;



        v.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                Toast.makeText(getApplicationContext(),ss,Toast.LENGTH_LONG).show();

                Intent ltnintent= new Intent(ViewNDnload.this,Pdf.class);
                startActivity(ltnintent);
            }
        });





        d.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),ddd,Toast.LENGTH_LONG).show();

                downloadManagerOne = (DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
                Uri uri = Uri.parse("https://drive.google.com/file/d/1pH2wst-kzkesfzfRQmjUL4dQ4BC2DDbp/view?usp=sharing");
                DownloadManager.Request request = new DownloadManager.Request(uri);
                request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
                Long reference = downloadManagerOne.enqueue(request);
            }
        });





    }
}
