package com.isil.projecto_moviles;

import android.app.Application;

import com.isil.projecto_moviles.storage.VetRepository;

/**
 * Created by Alumno-J on 28/11/2016.
 */
public class VetApp extends Application {
    private VetRepository vetRepository;

    @Override
    public void onCreate() {
        super.onCreate();
        vetRepository= new VetRepository();
        vetRepository.mock();
    }
    public VetRepository getVetRepository() {
        return vetRepository;
    }
}
