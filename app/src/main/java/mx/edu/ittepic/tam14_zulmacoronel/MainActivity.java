package mx.edu.ittepic.tam14_zulmacoronel;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;

import java.util.ArrayList;

public class MainActivity  extends AppCompatActivity {

        ArrayList<Alumnos> listaAlumnos;
        RecyclerView listaObjetos;

private RecyclerView.LayoutManager mLayoutManager;
        Adaptador adapter;

        String[] nombre = {"Carolina Mondragon", "Arturo Escalante", "Carlos Zambrano", "Mayte Serrano","Jonathan Zavala", "Iris Lopez"};

        String[] numeroControl = {"14401038 \n ITIC", "14401028 \n ITIC","14401019 \n ITIC", "14401049 \n ITIC","14401059 \n ITIC", "14401035 \n ITIC"};

        //String[] carrera = {"ITIC", "ITIC","ITIC","ITIC","ITIC","ITIC"};

        int[] ColorArreglo = {Color.rgb(154, 133, 239),
        Color.rgb(47,186,126),
        Color.rgb(79,199,218),
        Color.rgb(45,136,229),
        Color.rgb(85,156,129),
        Color.rgb(154, 133, 239)};

@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaObjetos = (RecyclerView) findViewById(R.id.caview);
        listaObjetos.setLayoutManager(new LinearLayoutManager(this));
        listaAlumnos= new ArrayList<>();
        obtenerAlumnos();

        adapter = new Adaptador(listaAlumnos, getApplicationContext());
        adapter.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {

        }
        });

        listaObjetos.setAdapter(adapter);
        }

public void obtenerAlumnos() {
        for (int i = 0; i < nombre.length; i++) {
        listaAlumnos.add(new Alumnos(1, nombre[i], numeroControl[i],"@drawable/p", ColorArreglo[i]));
        }

        }
        }
