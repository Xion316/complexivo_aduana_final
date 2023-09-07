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
public class paquete_marcado extends paquete{
    private String razon_por_marca;
    private boolean is_decomisado;
    private boolean notificacion_propietario;

    public paquete_marcado(String razon_por_marca, boolean is_decomisado, boolean notificacion_propietario, double peso, double volumen, boolean isFraguil, LinkedList<producto> conjunto_productos_entregar) {
        super(peso, volumen, isFraguil, conjunto_productos_entregar);
        this.razon_por_marca = razon_por_marca;
        this.is_decomisado = is_decomisado;
        this.notificacion_propietario = notificacion_propietario;
    }

   

   

    public String getRazon_por_marca() {
        return razon_por_marca;
    }

    public void setRazon_por_marca(String razon_por_marca) {
        this.razon_por_marca = razon_por_marca;
    }

    public boolean isIs_decomisado() {
        return is_decomisado;
    }

    @Override
    public boolean paquete_debe_ser_decomisado() {
        return this.isIs_decomisado();
    }
    
    public void setIs_decomisado(boolean is_decomisado) {
        this.is_decomisado = is_decomisado;
    }

    public boolean isNotificacion_propietario() {
        return notificacion_propietario;
    }

    public void setNotificacion_propietario(boolean notificacion_propietario) {
        this.notificacion_propietario = notificacion_propietario;
    }
    
    
}
