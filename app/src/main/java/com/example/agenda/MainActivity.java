package com.example.agenda;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
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

        listContactes.setOnItemClickListener((parent, view, position, id) -> {
            Contacte c = contactes.get(position);

            Intent intent = new Intent(MainActivity.this, DetallContacte.class);
            intent.putExtra("nom", c.getNom());
            intent.putExtra("telefon", c.getTelefon());
            startActivity(intent);
        });
    }
}