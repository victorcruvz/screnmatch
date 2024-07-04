package com.aluracursos.screenMatch.calculos;

import com.aluracursos.screenMatch.modelos.Pelicula;
import com.aluracursos.screenMatch.modelos.Serie;
import com.aluracursos.screenMatch.modelos.Titulo;

public class CalculadoraDeTiempo {

    private  int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

}
