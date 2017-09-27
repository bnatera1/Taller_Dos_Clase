package com.example.android.taller4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class reporte5 extends AppCompatActivity {
    private TextView res;
    private ArrayList<Celular> celular;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte5);
        res = (TextView) findViewById(R.id.txtProm);
        int s=0, c=0, prom=0;
        celular = Datos.obtener();
        for (int i = 0; i <celular.size(); i++){
            if(celular.get(i).getMarca().equalsIgnoreCase("nokia")){
                s=s+Integer.parseInt(celular.get(i).getPrecio());
                c++;
            }
        }
        prom=s/c;
        String result=String.valueOf(prom);
        res.setText("$"+result);
    }
}
