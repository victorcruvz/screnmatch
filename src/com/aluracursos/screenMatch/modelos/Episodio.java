package com.aluracursos.screenMatch.modelos;

import com.aluracursos.screenMatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisualizacions;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }
    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalVisualizacions() {
        return totalVisualizacions;
    }
    public void setTotalVisualizacions(int totalVisualizacions) {
        this.totalVisualizacions = totalVisualizacions;
    }

    @Override
    public int getClasificacion() {
        if (totalVisualizacions>100){
            return 4;
        }else{
            return 2;
        }
    }
}
