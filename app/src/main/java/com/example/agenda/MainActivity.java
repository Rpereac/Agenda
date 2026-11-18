package com.example.agenda;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class MainActivity extends AppCompatActivity {

    static final List<Contacte> contactes = List.of(
            new Contacte("sdfsd", 392847365),
            new Contacte("dfghdfgh", 173827465),
            new Contacte("rptoyirtpyo", 495847364),
            new Contacte("fgñhfghg", 384837245),
            new Contacte("cbcvbv",394857689));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Contactes agenda = new Contactes(this, contactes);
        ListView listContactes = findViewById(R.id.listContactes);
        listContactes.setAdapter(agenda);

        listContactes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), contactes.get(position).getNom(), Toast.LENGTH_SHORT).show();
            }
        });
    }
 class Contactes extends ArrayAdapter<Contacte> {
    Activity context;
    public Contactes(Activity context, List<Contacte> contactos) {
        super(context, R.layout.contacte_detail, contactos);
        this.context = (Activity) context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // TODO Auto-generated method stub
        // return super.getView(position, convertView, parent);
        Log.i("Niko","1");
        // Inflem el Lauoyt
        LayoutInflater inflater = context.getLayoutInflater();
        // Sobre el layout crear (inflat) dupliquem el layour creat amb els objectes, view personals.
        View item = inflater.inflate(R.layout.contacte_detail, null);
        // OJOOOO!!!!! hemos de hacer el findViewById del item que tenemos inflado.
        TextView nomContacte = (TextView) item.findViewById(R.id.nom);

        nomContacte.setText(MainActivity.contactes.get(position).getNom());
        TextView telefonContacte = (TextView) item.findViewById(R.id.telefon);
            Log.i("Niko","3->"+datosE[position].getSubtitulo().toString() );
        telefonContacte.setText(MainActivity.contactes.get(position).getTelefon());
     Log.i("Niko","4");
        return (item);
    }
}
}