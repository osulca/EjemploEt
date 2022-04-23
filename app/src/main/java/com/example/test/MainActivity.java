package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, PAISES);
        AutoCompleteTextView auto =  findViewById(R.id.atPaises);
        auto.setAdapter(adapter);
    }

    private static final String[] PAISES = new String[] {
            "Perú", "Francia", "Dinamarca", "Tunez", "Australia"
    };
}