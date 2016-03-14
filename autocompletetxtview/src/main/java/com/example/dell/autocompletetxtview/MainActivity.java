package com.example.dell.autocompletetxtview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ArrayAdapter adapt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String livres[] = {"roman","thriller","math","rocher","android","radio","web","java","sql","cuisine"};

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_dropdown_item_1line,livres);

        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setAdapter(adapter);
        autoCompleteTextView.setThreshold(1);

        ListView listView = (ListView) findViewById(R.id.listView);
        adapt = new ArrayAdapter(this,android.R.layout.simple_list_item_1,livres);
        listView.setAdapter(adapt);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String txt = adapt.getItem(position).toString();
                Toast.makeText(getApplicationContext(), txt, Toast.LENGTH_SHORT).show();

            }
        });

        EditText edittext = (EditText) findViewById(R.id.edittext);
        edittext.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                    adapt.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });




    }
}
