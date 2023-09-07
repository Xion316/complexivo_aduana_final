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
public class paquete_entrega extends paquete{
    private String direccion_entregar;
    private propietario propietario_paquete;

    public paquete_entrega(String direccion_entregar, propietario propietario_paquete, double peso, double volumen, boolean isFraguil, LinkedList<producto> conjunto_productos_entregar) {
        super(peso, volumen, isFraguil, conjunto_productos_entregar);
        this.direccion_entregar = direccion_entregar;
        this.propietario_paquete = propietario_paquete;
    }
    
    public String getDireccion_entregar() {
        return direccion_entregar;
    }

    public void setDireccion_entregar(String direccion_entregar) {
        this.direccion_entregar = direccion_entregar;
    }

    public propietario getPropietario_paquete() {
        return propietario_paquete;
    }

    public void setPropietario_paquete(propietario propietario_paquete) {
        this.propietario_paquete = propietario_paquete;
    }

 
    
    
    
}
