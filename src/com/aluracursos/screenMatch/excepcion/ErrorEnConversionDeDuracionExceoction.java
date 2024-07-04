package com.aluracursos.screenMatch.excepcion;

public class ErrorEnConversionDeDuracionExceoction extends RuntimeException {
    private String mensaje;
    public ErrorEnConversionDeDuracionExceoction(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    public String getMessage() {
        return this.mensaje;
    }
}
