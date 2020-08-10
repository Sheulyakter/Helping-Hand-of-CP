package com.example.purnota.pending;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Pdf extends AppCompatActivity {
    PDFView pd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        pd= (PDFView) findViewById(R.id.pdfread);


        pd.fromAsset("guideLine.pdf").load();

    }
}
