package com.isil.projecto_moviles.storage;

import com.isil.projecto_moviles.Veterinaria;
import com.isil.projecto_moviles.model.VetEntity;
import com.isil.projecto_moviles.R;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Alumno-J on 24/11/2016.
 */
public class VetRepository {

    private List<VetEntity> veterinarias;

    public VetRepository() {
        veterinarias = new ArrayList<VetEntity>();
    }

    public void mock() {

        Calendar calendar = Calendar.getInstance();
        String ndate = "" + calendar.getTime();

        VetEntity veterinaria1 = new VetEntity(1, "Juan", "Carrillo", "juan@hotmail.com", "132145", "av. salaverry 324", "Patitas", "Perro",R.mipmap.ic_perro);

        veterinarias.add(veterinaria1);
    }

    public void addVeterinaria(VetEntity veterinaria) {
        veterinarias.add(veterinaria);
    }

    public void removeVeterinaria(VetEntity veterinaria) {
        this.veterinarias.remove(veterinaria);
    }

    public void removeVeterinariaById(int veterinariaId) {
        int position = -1;
        VetEntity note;
        for (int i = 0; i < this.veterinarias.size(); i++) {
            note = veterinarias.get(i);
            if (note.getId() == veterinariaId) {
                position = i;
                break;
            }
        }
        if (position >= 0 && position < veterinarias.size()) {
            this.veterinarias.remove(position);
        }
    }

    public void updateVeterinaria(int position, VetEntity veterinaria) {
        if (position < veterinarias.size()) {
            veterinarias.set(position, veterinaria);
        }
    }

    public void updateVeterinariaById(int noteId, VetEntity veterinaria) {
        int position = -1;
        VetEntity note;
        for (int i = 0; i < this.veterinarias.size(); i++) {
            note = veterinarias.get(i);
            if (note.getId() == noteId) {
                position = i;
                break;
            }
        }
        if (position >= 0 && position < veterinarias.size()) {
            this.veterinarias.set(position, veterinaria);
        }
    }


    public List<VetEntity> allVeterinarias() {
        return this.veterinarias;
    }

    public int countVeterinarias() {
        return this.veterinarias.size();
    }

    public VetEntity lastVeterinaria() {
        if (this.veterinarias.size() > 0) {
            return this.veterinarias.get(this.veterinarias.size() - 1);
        }
        return null;
    }
}

