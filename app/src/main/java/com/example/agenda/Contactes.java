package com.example.agenda;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class Contactes extends ArrayAdapter<Contacte> {
    public Contactes(Activity context, List<Contacte> contactos) {
        super(context, R.layout.contacte_detail, contactos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View item = convertView != null
                ? convertView
                : LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);

        Contacte contacte = getItem(position);
        ((TextView) item.findViewById(R.id.nom)).setText("Nombre: " + contacte.getNom());
        ((TextView) item.findViewById(R.id.telefon)).setText("Telefon: " + String.valueOf(contacte.getTelefon()));
        return item;
    }
}
