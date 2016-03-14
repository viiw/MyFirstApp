package com.example.dell.tdintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.dell.tdintent.R.*;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main2);



        TextView textView = (TextView) findViewById(id.textView2);
        Intent intent = getIntent();
        //textView.setText(intent.getStringExtra("message"));

        Book book = (Book) intent.getSerializableExtra("book");
        textView.setText(book.getTitle());



    }

    public void weli(View v)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);

    }
}
