package com.example.android.taller4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Celular extends AppCompatActivity {
    private String precio;
    private String marca;
    private String color;
    private String ram;
    private String Soperativo;

    public Celular(String precio, String marca, String color, String ram,  String Sopetativo) {
        this.precio = precio;
        this.marca = marca;
        this.color = color;
        this.ram = ram;
        this.Soperativo = Sopetativo;

    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSoperativo() {
        return Soperativo;
    }

    public void setSoperativo(String soperativo) {
        Soperativo = soperativo;
    }

    public void guardar(){
        Datos.guardar(this);
    }



}
