/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

/**
 *
 * @author usuario
 */
public class Federacion {
    
    private String nombre;
    private String pais;
    private Division[] divisiones= new Division [3];

    public Division[] getDivisiones() {
        return divisiones;
    }

    public void setDivisiones(Division[] divisiones) {
        this.divisiones = divisiones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

   
    
    
    
    
    
}
