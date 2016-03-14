package com.example.dell.myapplication;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String text = String.format(getString(R.string.welcome_messages), "Mr", 2);
        String t[];
        TextView textView1 = (TextView) findViewById(R.id.textvl1);
        TextView textView2 = (TextView) findViewById(R.id.textlv2);

        textView1.setText(text);

        t = getResources().getStringArray(R.array.Jours_Semaine);

        textView1.setText(t[1]);

        String te = String.format(getString(R.string.lands));
        textView1.setText(te);
        textView2.setText(te);

    }

}
