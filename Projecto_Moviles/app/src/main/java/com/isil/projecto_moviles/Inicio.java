package com.isil.projecto_moviles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Inicio extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_inicio);
        ui();
    }

    private void ui() {

        findViewById(R.id.btnInicio).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoOpciones();
            }
        });
    }

    private void gotoOpciones(){
        startActivity(new Intent(this, Opciones.class));
    }

}
