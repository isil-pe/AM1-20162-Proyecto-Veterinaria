package com.isil.projecto_moviles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by Alumno-J on 20/10/2016.
 */
public class Guarderia extends Activity{

    private Button btnHacerPedido;
    private EditText edtNom,edtApe, edtTel, edtNomMasc, edtNumHoras;
    private ListView lstMont;
    private RadioButton rdbHoras,rdbDias;


    String nom,ape,tel, nomMas;
    int numDias,numHor,numHoras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_guarderia);
        asignarReferenciasGuarderia();

        btnHacerPedido = (Button)findViewById(R.id.btnHacerPedido);

        btnHacerPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gotoHacerPedido();
            }
        });
    }

    private void gotoHacerPedido(){
        Intent intent = new Intent(Guarderia.this, Pago.class);
        startActivity(intent);
        //finish();
    }

    public void asignarReferenciasGuarderia(){
        edtNom = (EditText)findViewById(R.id.edtNombre);
        edtApe = (EditText)findViewById(R.id.edtApellido);
        edtTel = (EditText)findViewById(R.id.edtTelefono);
        edtNomMasc = (EditText)findViewById(R.id.edtNombreMascota);
        edtNumHoras = (EditText)findViewById(R.id.edtNumeroDiasHoras);
        lstMont = (ListView)findViewById(R.id.lsvMonto);
        rdbDias=(RadioButton) findViewById(R.id.rdbDias);
        rdbHoras=(RadioButton) findViewById(R.id.rdbHoras);
    }

    public void capturarDatosGuarderia(){
        nom = edtNom.getText() + "";
        ape = edtApe.getText() + "";
        tel = edtTel.getText() + "";
        nomMas = edtNomMasc.getText() + "";
        numHoras = Integer.parseInt(edtNumHoras.getText()+"");

    }

    public void montoPagar(View view){
        capturarDatosGuarderia();
        if(rdbDias.isChecked()){

            numDias = 100 * numHoras;

        }else if(rdbHoras.isChecked()){

            numHor = 15 * numHoras;
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1);
        lstMont.setAdapter(adapter);
    }


    public int getNumDias() {
        return numDias;
    }

    public void setNumDias(int numDias) {
        this.numDias = numDias;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public int getNumHor() {
        return numHor;
    }

    public void setNumHor(int numHor) {
        this.numHor = numHor;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getNomMas() {
        return nomMas;
    }

    public void setNomMas(String nomMas) {
        this.nomMas = nomMas;
    }
}
