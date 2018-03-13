/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniminuto.arqSw.ejercicioServlets.TallerCuatro.vos;

/**
 *
 * @author KAICES
 */
public class FormularioPersonaVo {
    
    String nombre ;
    int edad;
    int genero;

    public FormularioPersonaVo(String nNombre, int nedad, int ngenero) {
        this.nombre = nNombre;
        this.edad = nedad;
        this.genero = ngenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }
    
    
            
    
}
