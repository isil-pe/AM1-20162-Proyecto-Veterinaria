package com.isil.projecto_moviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.isil.projecto_moviles.model.VetEntity;

/**
 * Created by Alumno-J on 28/11/2016.
 */
public class VeterinariaActivity extends AppCompatActivity {

    private TextView tviNom;
    private TextView tviApe;
    private TextView tviEmail;
    private TextView tviTelefono;
    private TextView tviDireccion;
    private TextView tviVet;
    private TextView tviMascota;
    private VetEntity veterinaria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reserva);
        extras();
        ui();
        populate();
    }

    private void populate() {
        if(veterinaria==null)return;


        tviNom.setText(veterinaria.getNombre());
        tviApe.setText(veterinaria.getApellido());
        tviEmail.setText(veterinaria.getEmail());
        tviTelefono.setText(veterinaria.getTelefono());
        tviDireccion.setText(veterinaria.getDireccion());
        tviVet.setText(veterinaria.getVeterinaria());
        tviMascota.setText(veterinaria.getMascota());

    }

    private void ui() {
        tviNom= (TextView) findViewById(R.id.tviNom);
        tviApe= (TextView) findViewById(R.id.tviApe);
        tviEmail= (TextView) findViewById(R.id.tviEmail);
        tviTelefono= (TextView) findViewById(R.id.tviTelefono);
        tviDireccion=  (TextView) findViewById(R.id.tviDireccion);
        tviVet=  (TextView) findViewById(R.id.tviVet);
        tviMascota=  (TextView) findViewById(R.id.tviMascota);
    }

    private void extras() {
        if (getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                veterinaria = (VetEntity) bundle.getSerializable("VETERINARIA");
            }
        }
    }

}
