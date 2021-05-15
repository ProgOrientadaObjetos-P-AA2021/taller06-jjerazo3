/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO 2020
 */
public class Medico {
    private String nombreMedico, especialidad;
    private double sueldoMensual;

    public Medico(String nombre, String especialidades, double sueldo) {
        nombreMedico = nombre;
        especialidad = especialidades;
        sueldoMensual = sueldo;
    }

    public void setNombreMedico(String nombre) {
        nombreMedico = nombre;
    }

    public void setEspecialidad(String especialidades) {
        especialidad = especialidades;
    }

    public void setSueldoMensual(double sueldo) {
        sueldoMensual = sueldo;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSueldoMensual() {
        return sueldoMensual;
    }

    @Override
    public String toString() {
        return String.format("- %s - sueldo: %s - %s\n", getNombreMedico(),
                getSueldoMensual(), getEspecialidad());
    }
}
