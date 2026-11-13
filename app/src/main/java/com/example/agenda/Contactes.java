package com.example.agenda;

import android.app.Activity;
import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;


public class Contactes extends ArrayAdapter<Contacte>{
    Activity context;
    public Contactes(Activity context, List<Contacte> contactos) {
        super(context, R.layout.contacte_detail, contactos);
        this.context = (Activity) context;
    }
}
