package com.kevinmay.android.geoapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class GeoActivity extends AppCompatActivity {
    private Button mBotonCierto;
    private Button mBotonFalso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geo);

        mBotonCierto =(Button) findViewById(R.id.boton_cierto);
        mBotonFalso =(Button) findViewById(R.id.boton_falso);

        mBotonCierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoActivity.this, R.string.texto_correcto, Toast.LENGTH_SHORT)
                        .show();
            }
        });
        mBotonFalso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(GeoActivity.this, R.string.texto_incorrecto, Toast.LENGTH_SHORT)
                        .show();
            }
        });

    }
}