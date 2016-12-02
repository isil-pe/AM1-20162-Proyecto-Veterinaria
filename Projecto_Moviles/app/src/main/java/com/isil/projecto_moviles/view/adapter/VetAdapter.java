package com.isil.projecto_moviles.view.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.isil.projecto_moviles.R;
import com.isil.projecto_moviles.model.VetEntity;

import java.util.List;
/**
 * Created by Alumno-J on 24/11/2016.
 */
public class VetAdapter extends BaseAdapter {

    private Context context;
    private List<VetEntity> veterinarias;


    public VetAdapter(Context context, List<VetEntity> veterinarias) {
        this.context = context;;
        this.veterinarias = veterinarias;
    }

    @Override
    public int getCount() {
        return veterinarias.size();
    }

    @Override
    public Object getItem(int i) {
        return veterinarias.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        if(v == null)
        {
            LayoutInflater inflater = LayoutInflater.from(context);
            v = inflater.inflate(R.layout.row_vet, null);
            ViewHolder holder = new ViewHolder();
            holder.iviVet = (ImageView) v.findViewById(R.id.iviVet);
            holder.tviNom = (TextView) v.findViewById(R.id.tviNom);
            holder.tviApe = (TextView) v.findViewById(R.id.tviApe);
            holder.tviVet = (TextView) v.findViewById(R.id.tviVet);
            v.setTag(holder);
        }
        VetEntity entry = veterinarias.get(position);
        if(entry != null)
        {
            ViewHolder holder = (ViewHolder)v.getTag();
            String nombre=entry.getNombre();
            String veterinaria= entry.getApellido();
            if(nombre.length()>=0) nombre= nombre.substring(0,1);
            holder.tviNom.setText(nombre);
            holder.tviApe.setText(entry.getApellido());
            holder.tviVet.setText(entry.getVeterinaria());
            holder.iviVet.setImageResource(entry.getPhoto());
        }

        return v;
    }


    static class ViewHolder
    {
        ImageView iviVet;
        TextView tviNom;
        TextView tviApe;
        TextView tviVet;
    }
}
