package com.isil.projecto_moviles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.view.View;
import android.widget.Toast;
import android.widget.AdapterView;
import android.util.Log;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Veterinaria extends Activity {

        private EditText txtNombre, txtApellido, txtEmail, txtTelefono, txtDireccion;
        private Spinner spVeterinaria, spMascota;
        private Button btnReserva, btnVerReserva;

        private String nombre, apellido, email, telefono, direccion;

        private String veterinaria = null, mascota = null;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.acty_veterinaria);
            app();

            btnVerReserva = (Button)findViewById(R.id.btnVerReservas);

            btnVerReserva.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    gotoVerReserva();
                }
            });
        }

    private void gotoVerReserva(){
        Intent intent = new Intent(Veterinaria.this, Reserva.class);
        startActivity(intent);
        //finish();
    }

        private void app() {
            // TODO Auto-generated method stub
            txtNombre = (EditText) findViewById(R.id.txtNombre);
            txtApellido = (EditText) findViewById(R.id.txtApellido);
            txtTelefono = (EditText) findViewById(R.id.txtTelefono);
            txtEmail = (EditText) findViewById(R.id.txtEmail);
            txtDireccion = (EditText) findViewById(R.id.txtDireccion);

            spVeterinaria = (Spinner) findViewById(R.id.spVeterinaria);
            spMascota = (Spinner) findViewById(R.id.spMascota);

            btnReserva = (Button) findViewById(R.id.btnHacerReserva);

            events();
        }

        private void events() {
            // TODO Auto-generated method stub

            btnReserva.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (validateFormError()) {
                        Toast.makeText(Veterinaria.this, "Enviando reserva",
                                Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(Veterinaria.this, "Revisar campos",
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });

            spVeterinaria.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Log.v("CONSOLE", "spVeterinaria" + adapterView.getAdapter().getItem(i));
                    veterinaria = adapterView.getAdapter().getItem(i).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });

            spMascota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    Log.v("CONSOLE", "spMascota" + adapterView.getAdapter().getItem(i));
                    mascota = adapterView.getAdapter().getItem(i).toString();
                }

                @Override
                public void onNothingSelected(AdapterView<?> adapterView) {

                }
            });
        }

        private boolean validateForm() {
            nombre = txtNombre.getText().toString().trim();
            apellido = txtApellido.getText().toString().trim();
            telefono = txtTelefono.getText().toString().trim();
            email = txtEmail.getText().toString().trim();
            direccion = txtDireccion.getText().toString().trim();

            if (nombre.isEmpty()) return false;
            if (apellido.isEmpty()) return false;
            if (telefono.isEmpty()) return false;
            if (email.isEmpty()) return false;
            if (direccion.isEmpty()) return false;


            if (veterinaria == null) return false;
            if (mascota == null) return false;

            return true;
        }

        private boolean validateFormError()
        {
            nombre = txtNombre.getText().toString().trim();
            apellido = txtApellido.getText().toString().trim();
            telefono = txtTelefono.getText().toString().trim();
            email = txtEmail.getText().toString().trim();
            direccion = txtDireccion.getText().toString().trim();

            if(nombre.isEmpty())
            {
                txtNombre.setError("Campo inválido");
                return false;
            }
            if(apellido.isEmpty())
            {
                txtApellido.setError("Campo inválido");
                return false;
            }
            if(telefono.isEmpty())
            {
                txtTelefono.setError("Campo inválido");
                return false;
            }

            if(!isEmailValid(email)){
                txtEmail.setError("E-mail inválido");
                return false;
            }


            if(veterinaria==null) {
                return false;
            }

            if (mascota==null){
                return false;
            }

            return true;
        }

        public boolean isEmailValid(String email) {
            String regExpn =
                    "^(([\\w-]+\\.)+[\\w-]+|([a-zA-Z]{1}|[\\w-]{2,}))@"
                            + "((([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\."
                            + "([0-1]?[0-9]{1,2}|25[0-5]|2[0-4][0-9])\\.([0-1]?"
                            + "[0-9]{1,2}|25[0-5]|2[0-4][0-9])){1}|"
                            + "([a-zA-Z]+[\\w-]+\\.)+[a-zA-Z]{2,4})$";

            CharSequence inputStr = email;

            Pattern pattern = Pattern.compile(regExpn, Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(inputStr);

            if (matcher.matches())
                return true;
            else
                return false;
        }

}
