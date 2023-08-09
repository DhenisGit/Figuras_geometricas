package com.dhenis.polomorfismo.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

public class BrowseActivities {
    // Método estático para cambiar de una actividad a otra
    public static void cambiarActividad(Context context, Class<? extends Activity> targetActivity) {
        Intent intent = new Intent(context, targetActivity);
        context.startActivity(intent);
    }
}
