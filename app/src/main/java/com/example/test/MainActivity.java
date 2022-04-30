package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMensaje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MYAPP", "en Creación");
        Toast toast = Toast.makeText(this,"en Creación",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje = findViewById(R.id.tvMensaje);
        tvMensaje.setText("en Creación\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MYAPP", "en Inicio");
        Toast toast = Toast.makeText(this,"en Inicio",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje.append("en Inicio\n");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MYAPP", "Resumido");
        Toast toast = Toast.makeText(this,"Resumido",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje.append("Resumido\n");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MYAPP", "Pausado");
        Toast toast = Toast.makeText(this,"Pausado",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje.append("Pausado\n");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MYAPP", "en Detencion");
        Toast toast = Toast.makeText(this,"en Detencion",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje.append("en Detencion\n");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MYAPP", "en Reinicio");
        Toast toast = Toast.makeText(this,"en Reinicio",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje.append("en Reinicio\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MYAPP", "Eliminado");
        Toast toast = Toast.makeText(this,"Eliminado",Toast.LENGTH_LONG);
        toast.show();
        tvMensaje.append("Eliminado\n");
    }
}