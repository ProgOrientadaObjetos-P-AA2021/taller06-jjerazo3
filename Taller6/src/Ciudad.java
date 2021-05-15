/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO 2020
 */
public class Ciudad {
    private String nombreCiudad, provinciaCiudad;

    public Ciudad(String ciudad, String provincia) {
        nombreCiudad = ciudad;
        provinciaCiudad = provincia;
    }

    public void setNombreCiudad(String ciudad) {
        nombreCiudad = ciudad;
    }

    public void setNombreProvincia(String provincia) {
        provinciaCiudad = provincia;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getNombreProvincia() {
        return provinciaCiudad;
    }
}
