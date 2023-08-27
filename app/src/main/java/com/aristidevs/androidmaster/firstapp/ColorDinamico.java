package com.aristidevs.androidmaster.firstapp;

import android.app.Application;

import com.google.android.material.color.DynamicColors;

public class ColorDinamico extends Application {


    /**
     *  dentro de la función onCreate se establecen los colores dinámicos
      */
    @Override
    public void onCreate() {
        super.onCreate();
        // aquí se comprueba si el dispositivo es compatible con Material You
        // en caso de serlo se aplicará en todas las actividades, componentes, etc...
        DynamicColors.applyToActivitiesIfAvailable(this);
    }
}
