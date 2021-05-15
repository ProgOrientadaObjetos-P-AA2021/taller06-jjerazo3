/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO 2020
 */
import java.util.Scanner;
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String medicos, especialidad, enfermeros, tipoContrato, ciudad, provincia, 
                nombreHospital, direccion;
        int sueldoM, sueldoE;
        System.out.println("En que ciudad esta el Hospital?");
        ciudad = leer.next();
        System.out.println("Provincia del Hospital");
        provincia = leer.next();
        System.out.println("Nombre del Hospital");
        nombreHospital = leer.next();
        System.out.println("Direccion del Hospital");
        direccion = leer.next();
        System.out.println("Cantidad de medicos");
        int listaMedicos = leer.nextInt();
        System.out.println("Cantidad de enfermeros");
        int listaEnfermeros = leer.nextInt();
        Ciudad c1 = new Ciudad(ciudad, provincia);
        entidadHospitalaria h1 = new entidadHospitalaria(nombreHospital, direccion, 
                (listaMedicos + listaEnfermeros), c1);
        for (int i = 0; i < listaMedicos; i++) {
            System.out.println("Nombre del medico " + (i+1));
            medicos = leer.next();
            System.out.println("Especialidad del medico" + (i+1));
            especialidad = leer.next();
            System.out.println("Sueldo del medico " + (i+1));
            sueldoM = leer.nextInt();
            Medico m1 = new Medico(medicos, especialidad, sueldoM);
            h1.agregarMedico(m1);
        }
        for (int i = 0; i < listaEnfermeros; i++) {
            System.out.println("Nombre del enfermero/a " + (i+1));
            enfermeros = leer.next();
            System.out.println("Tipo de nombramiento" + (i+1));
            tipoContrato = leer.next();
            System.out.println("Sueldo del enfermero " + (i+1));
            sueldoE = leer.nextInt();
            Enfermero e1 = new Enfermero(enfermeros, tipoContrato, sueldoE);
            h1.agregarEnfermero(e1);
        }
        h1.getTotalSueldo();
        System.out.println(h1);
    }
    
}
