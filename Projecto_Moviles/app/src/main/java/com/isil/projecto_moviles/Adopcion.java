package com.isil.projecto_moviles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class Adopcion extends Activity {

    private Button btnDarAdoption,btnAdoptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_adoption);

        btnAdoptar = (Button)findViewById(R.id.btnDarAdoption);
        btnDarAdoption = (Button)findViewById(R.id.btnAdoptar);

        btnAdoptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoDarAdoption();
            }
        });

        btnDarAdoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoAdoptar();
            }
        });
    }

    private void gotoDarAdoption(){
        Intent intent = new Intent(Adopcion.this, DarAdoption.class);
        startActivity(intent);
        //finish();
    }

    private void gotoAdoptar
            (){
        Intent intent = new Intent(Adopcion.this, Adoptar.class);
        startActivity(intent);
        //finish();
    }
}
