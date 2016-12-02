package com.isil.projecto_moviles;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class DarAdoption extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_daradopcion);

    }

    public void darAdopcion(View view){
        Toast.makeText(this, "Tú mascota fue dada en adopcion", Toast.LENGTH_SHORT).show();
    }
}
