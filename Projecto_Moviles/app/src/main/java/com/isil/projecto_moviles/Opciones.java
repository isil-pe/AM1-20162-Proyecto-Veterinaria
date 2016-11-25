package com.isil.projecto_moviles;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alumno-J on 20/10/2016.
 */
public class Opciones extends Activity{

    private Button btnGuarderia,btnAdoption,btnVeterinaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opciones);

        btnGuarderia = (Button)findViewById(R.id.btnGuarderia);
        btnAdoption = (Button)findViewById(R.id.btnAdoption);
        btnVeterinaria = (Button)findViewById(R.id.btnVeterinaria);

        btnGuarderia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoGuarderia();
            }
        });

        btnAdoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoAdoption();
            }
        });

       btnVeterinaria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoVeterinaria();
            }
        });

    }

    private void gotoGuarderia(){
        Intent intent = new Intent(Opciones.this, Guarderia.class);
        startActivity(intent);
        //finish();
    }

    private void gotoAdoption(){
        Intent intent = new Intent(Opciones.this, Adopcion.class);
        startActivity(intent);
        //finish();
    }

    private void gotoVeterinaria(){
        Intent intent = new Intent(Opciones.this, Veterinaria.class);
        startActivity(intent);
        //finish();
    }
}