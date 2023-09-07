/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.LinkedList;

/**
 *
 * @author hack2
 */
public class paquete_decomisado extends paquete{
    private String razon_demcomiso;
    private propietario propietario_paquete;

    public paquete_decomisado(String razon_demcomiso, propietario propietario_paquete, double peso, double volumen, boolean isFraguil, LinkedList<producto> conjunto_productos_entregar) {
        super(peso, volumen, isFraguil, conjunto_productos_entregar);
        this.razon_demcomiso = razon_demcomiso;
        this.propietario_paquete = propietario_paquete;
    }

    
    public String getRazon_demcomiso() {
        return razon_demcomiso;
    }

    public void setRazon_demcomiso(String razon_demcomiso) {
        this.razon_demcomiso = razon_demcomiso;
    }

    public propietario getPropietario_paquete() {
        return propietario_paquete;
    }

    public void setPropietario_paquete(propietario propietario_paquete) {
        this.propietario_paquete = propietario_paquete;
    }

    @Override
    public boolean paquete_debe_ser_decomisado() {
        return true;
    }
    
    
    
    

  
    
    
}
