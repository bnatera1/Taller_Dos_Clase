package com.example.android.taller4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class reporte1 extends AppCompatActivity {
    private TableLayout tabla;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte1);
        tabla = (TableLayout) findViewById(R.id.tabla);
        celular = Datos.obtener();

        double menor = 999999999;
        int pos=0;



        for (int i = 0; i < celular.size(); i++) {
            if ((celular.get(i).getColor().equalsIgnoreCase("blanco") && celular.get(i).getMarca().equalsIgnoreCase("huawei") && celular.get(i).getSoperativo().equalsIgnoreCase("Android"))) {

                if (Integer.parseInt(celular.get(i).getPrecio())<menor) {
                    menor = Integer.parseInt(celular.get(i).getPrecio());
                    pos=i;
                }
            }
         }
        TableRow fila = new TableRow(this);
        TextView c1 = new TextView(this);
        TextView c2 = new TextView(this);
        TextView c3 = new TextView(this);
        TextView c4 = new TextView(this);
        TextView c5 = new TextView(this);
        TextView c6 = new TextView(this);

        c1.setText("" + (1));
        c2.setText(celular.get(pos).getPrecio());
        c3.setText(celular.get(pos).getMarca());
        c4.setText(celular.get(pos).getColor());
        c5.setText(celular.get(pos).getSoperativo());
        c6.setText(celular.get(pos).getRam());
        fila.addView(c1);
        fila.addView(c2);
        fila.addView(c3);
        fila.addView(c4);
        fila.addView(c5);
        fila.addView(c6);
        tabla.addView(fila);

    }
}

