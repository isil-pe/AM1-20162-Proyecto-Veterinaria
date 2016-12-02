package com.isil.projecto_moviles;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.isil.projecto_moviles.model.VetEntity;
import com.isil.projecto_moviles.view.adapter.VetAdapter;

import java.util.List;

/**
 * Created by Alumno-J on 03/11/2016.
 */
public class Reserva extends Activity {

    private ListView lvReservas;
    private List<VetEntity> veterinarias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acty_reservas);
        loadData();
        app();
    }

    private void app() {
        ui();
        events();
    }

    @Override
    protected void onResume() {
        super.onResume();
        populate();
    }

    private void populate() {
        VetAdapter vetAdapter= new VetAdapter(this,veterinarias );
        lvReservas.setAdapter(vetAdapter);
    }

    private void loadData() {

        VetApp application= (VetApp) getApplication();
        this.veterinarias= application.getVetRepository().allVeterinarias();
    }

    private void ui() {
        lvReservas= (ListView)findViewById(R.id.lvReservas);
    }

    private void events() {

        lvReservas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                VetEntity veterinaria= (VetEntity) adapterView.getAdapter().getItem(position);
                gotoVetDetail(veterinaria);

            }
        });
    }

    private void gotoVetDetail(VetEntity veterinaria) {
        Bundle bundle= new Bundle();
        bundle.putSerializable("VETERINARIA",veterinaria);

        Intent intent = new Intent(Reserva.this, VeterinariaActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
