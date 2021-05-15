/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO 2020
 */
import java.util.ArrayList;
public class entidadHospitalaria {
    
     private String nombreHospital, direccionHospital;
    private int especialidades;
    private Ciudad ciudad;
    private double totalSueldos;
    private ArrayList<Medico> medicos = new ArrayList<>();
    private ArrayList<Enfermero> enfermeros = new ArrayList<>();

    public entidadHospitalaria(String nombre, String direccion, 
            int especialidad, Ciudad ciudadHospital) {
        nombreHospital = nombre;
        direccionHospital = direccion;
        especialidades = especialidad;
        ciudad = ciudadHospital;
    }

    public void setNombreHospital(String n) {
        nombreHospital = n;
    }

    public void setDireccionHospital(String n) {
        direccionHospital = n;
    }

    public void setEspecialidades(int n) {
        especialidades = n;
    }

    public void setCiudad(Ciudad n) {
        ciudad = n;
    }

    public void calcularTotalSueldos(double sueldoTotal) {
        medicos.forEach(i -> {
            totalSueldos += i.getSueldoMensual();
         });
        enfermeros.forEach(i -> {
            totalSueldos += i.getSueldoMensual();
         });
    }

    public void getrMedicos(ArrayList<Medico> med) {
        medicos = med;
    }

    public void getEnfermeros(ArrayList<Enfermero> enf) {
        enfermeros = enf;
    }

    public void agregarMedico(Medico med) {
        medicos.add(med);
    }

    public void agregarEnfermero(Enfermero enf) {
        enfermeros.add(enf);
    }

    public String getNombreHospital() {
        return nombreHospital;
    }

    public String getDireccionHospital() {
        return direccionHospital;
    }

    public int getEspecialidades() {
        return especialidades;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public double getTotalSueldo() {
        return totalSueldos;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public ArrayList<Enfermero> getEnfermeros() {
        return enfermeros;
    }

    public String getListaMedicos() {
        String inf = "";
        inf = medicos.stream().map(i -> i.toString()).reduce(inf, 
                String::concat);
        return inf;
    }

    public String getListaEnfermeros() {
        String inf = "";
        inf = enfermeros.stream().map(i -> i.toString()).reduce(inf, 
                String::concat);
        return inf;
    }
    
    @Override
    public String toString() {
        return String.format("HOSPITAL %s\nDireccion: %s\nCiudad: "
                + "%s\nProvincia: %s\nNumero especialidades: %s\nListado de "
                + "médicos: \n%s\nListado de enferemeros/as: \n%s\n\n"
                + "Total de sueldos a pagar por mes: %s \n",
                getNombreHospital(), getDireccionHospital(),
                ciudad.getNombreCiudad(), ciudad.getNombreProvincia(),
                especialidades, getListaMedicos(), getListaEnfermeros(),
                getTotalSueldo());
    }
}
