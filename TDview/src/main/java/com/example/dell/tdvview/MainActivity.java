package com.example.dell.tdvview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void affichage(View v)
    {
        if(v.getId() == R.id.checkBox)
        {


            CheckBox cb = (CheckBox) v;
            if (cb.isChecked()) {
                Toast.makeText(this, "checked", Toast.LENGTH_SHORT).show();
            }
        }

        if(v.getId() == R.id.button)
        {
            Button bt = (Button) v;

            Toast.makeText(this,"ceci un message",Toast.LENGTH_SHORT).show();
        }
    }
}
