/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO 2020
 */
public class Enfermero {
    
    private String nombreEnfermero, tipoContrato;
    private double sueldoMensual;

    public Enfermero(String nombre, String tipo, double sueldo) {
        nombreEnfermero = nombre;
        tipoContrato = tipo;
        sueldoMensual = sueldo;
    }

    public void setNombreEnfermero(String nombre) {
        nombreEnfermero = nombre;
    }

    public void setTipoContrato(String tipo) {
        tipoContrato = tipo;
    }

    public void setSueldoMensual(double sueldo) {
        sueldoMensual = sueldo;
    }

    public String getNombreEnfermero() {
        return nombreEnfermero;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return String.format("- %s - sueldo: %s - %s\n", getNombreEnfermero(),
                getSueldoMensual(), getTipoContrato());
    }
}
