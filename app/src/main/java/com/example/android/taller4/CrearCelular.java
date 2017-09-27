package com.example.android.taller4;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCelular extends AppCompatActivity {
    private EditText precio,marca,color,Soperativo,Ram;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celular);

        precio = (EditText)findViewById(R.id.txtPrecio);
        marca = (EditText)findViewById(R.id.txtMarca);
        color = (EditText)findViewById(R.id.txtColor);
        Soperativo = (EditText)findViewById(R.id.txtSoperativo);
        Ram = (EditText)findViewById(R.id.txtRam);

        resources = this.getResources();
    }

    public void guardar(View view){
        String pre,mar,col,Soper,ram;
        pre = precio.getText().toString();
        mar = marca.getText().toString();
        col = color.getText().toString();
        Soper = Soperativo.getText().toString();
        ram = Ram.getText().toString();

        Celular c = new Celular(pre,mar,col,Soper,ram);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
    }

    public void Limpiar(View v){
        precio.setText("");
        marca.setText("");
        color.setText("");
        Soperativo.setText("");
        Ram.setText("");
        precio.requestFocus();
    }

}
