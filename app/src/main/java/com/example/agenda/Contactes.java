package com.example.agenda;

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

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        View item = convertView != null
                ? convertView
                : LayoutInflater.from(getContext()).inflate(R.layout.contacte_detail, parent, false);

        Contacte contacte = getItem(position);
        ((TextView) item.findViewById(R.id.nom)).setText(contacte.getNom());
        ((TextView) item.findViewById(R.id.telefon)).setText(String.valueOf(contacte.getTelefon()));
        return item;
    }
}
