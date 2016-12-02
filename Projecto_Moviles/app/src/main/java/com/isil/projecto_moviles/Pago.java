package com.isil.projecto_moviles;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class Pago extends Activity {

    public Button btnOperacion;
    public EditText etTarjeta,etMes, etAio,etCvc , etPass, etConPass, etToken;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_pago);
        validarDatos();
    }

    public void validarDatos(){
        etTarjeta = (EditText)findViewById(R.id.etNumeroTarjeta);
        etPass = (EditText)findViewById(R.id.etPassword);
        etConPass = (EditText)findViewById(R.id.etConfirmarPassword);
        etToken = (EditText)findViewById(R.id.etNumeroToken);
        etMes = (EditText)findViewById(R.id.etMes);
        etAio = (EditText)findViewById(R.id.etMes);
        etCvc = (EditText)findViewById(R.id.etCvc);
        btnOperacion = (Button)findViewById(R.id.btnConfirmarOperacion);

    }

    public void confirmarOperacion (View view){

        Toast.makeText(this, "El pago fue realizado con exito", Toast.LENGTH_SHORT).show();
    }
}
