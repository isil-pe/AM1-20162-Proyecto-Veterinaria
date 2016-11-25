package com.isil.projecto_moviles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Alumno-J on 20/10/2016.
 */
public class Guarderia extends Activity{

    private Button btnHacerPedido;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_guarderia);

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
}
