package com.isil.projecto_moviles;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.view.View;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class Adoptar extends Activity {

    Spinner spnMascotas;
    EditText etNumeroMascota;
    String numeroMascota, mascotas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_adoptar);
        asignarReferencias();
    }

    public void asignarReferencias(){
        spnMascotas = (Spinner)findViewById(R.id.spnMascotas);
        etNumeroMascota = (EditText)findViewById(R.id.etNumeroMascota);
    }

    public void adoptar(View view){
        Toast.makeText(this, "Has adoptado una mascota. Felicidades", Toast.LENGTH_SHORT).show();
    }

    private boolean validateFormError()
    {
        numeroMascota = etNumeroMascota.getText().toString().trim();
        mascotas = spnMascotas.getSelectedItem().toString().trim();

        if(numeroMascota.isEmpty()) {
            etNumeroMascota.setError("Campo inválido");
            return false;
        }

        if(numeroMascota==null) {
            return false;
        }

        if (mascotas==null){
            return false;
        }

        return true;
    }
}
