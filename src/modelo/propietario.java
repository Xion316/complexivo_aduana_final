/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import controlador.excepcion_custom;
import java.io.Serializable;
/**
 *
 * @author hack2
 */
public class propietario implements Serializable{
    private String ci;
    private boolean is_extranjero;
    private int cantidad_paquetes_en_aduana;

    public propietario(String ci, boolean is_extranjero, int cantidad_paquetes_en_aduana) {
        this.ci = ci;
        this.is_extranjero = is_extranjero;
        this.cantidad_paquetes_en_aduana = cantidad_paquetes_en_aduana;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public boolean isIs_extranjero() {
        return is_extranjero;
    }

    public void setIs_extranjero(boolean is_extranjero) {
        this.is_extranjero = is_extranjero;
    }

    public int getCantidad_paquetes_en_aduana() {
        return cantidad_paquetes_en_aduana;
    }

    public void setCantidad_paquetes_en_aduana(int cantidad_paquetes_en_aduana) {
        this.cantidad_paquetes_en_aduana = cantidad_paquetes_en_aduana;
    }
    
    
    public String get_clasificacionPropietario() throws excepcion_custom{
        String clasificacion="";
            int cantp=this.getCantidad_paquetes_en_aduana();
            
            if(cantp<10){
                throw new excepcion_custom("Propietario Menor.");
            }else if(cantp>=10 && cantp<=20){
                clasificacion="Normal";
            }else if(cantp>=21 && cantp<=50){
                clasificacion="Importador";
            }else{
                clasificacion="Importador Estrella";
            }
        return clasificacion;
    }
    
}
