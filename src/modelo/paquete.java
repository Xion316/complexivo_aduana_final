/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author hack2
 */
public class paquete implements Serializable{
    private double peso,volumen;
    private boolean isFraguil;
    private LinkedList<producto> conjunto_productos_entregar;

    public paquete(double peso, double volumen, boolean isFraguil, LinkedList<producto> conjunto_productos_entregar) {
        this.peso = peso;
        this.volumen = volumen;
        this.isFraguil = isFraguil;
        this.conjunto_productos_entregar = conjunto_productos_entregar;
    }

    public LinkedList<producto> getConjunto_productos_entregar() {
        return conjunto_productos_entregar;
    }

    public void setConjunto_productos_entregar(LinkedList<producto> conjunto_productos_entregar) {
        this.conjunto_productos_entregar = conjunto_productos_entregar;
    }

 
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public boolean isIsFraguil() {
        return isFraguil;
    }

    public void setIsFraguil(boolean isFraguil) {
        this.isFraguil = isFraguil;
    }
    
    // si encuentro algun paquete con indice de riesgo mayor que 0.46 ya todo el paquete se decomisa
    /// PREGUNTAR SI ESTA CORRECTA IMPLEMENTACION EN HIJOS
    public boolean paquete_debe_ser_decomisado(){
        for(producto object : conjunto_productos_entregar) {
            if(object.getIndice_riesgo()>0.46){
                return true;
            }
        }
        return false;
    }
    
    
    
}
