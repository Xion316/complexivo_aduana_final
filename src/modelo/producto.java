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
public class producto implements Serializable{
    private boolean is_plastico; // caso contrario es metal
    private double indice_riesgo;

    public producto(boolean is_plastico, double indice_riesgo) {
        this.is_plastico = is_plastico;
        this.indice_riesgo = indice_riesgo;
    }

    public boolean isIs_plastico() {
        return is_plastico;
    }

    public void setIs_plastico(boolean is_plastico) {
        this.is_plastico = is_plastico;
    }

    public double getIndice_riesgo() {
        return indice_riesgo;
    }

    public void setIndice_riesgo(double indice_riesgo) {
        this.indice_riesgo = indice_riesgo;
    }
    
    
    public String get_nivel_riesgo() throws excepcion_custom{
        String nivel_riesgo="";
        double ir=this.getIndice_riesgo();
         if(ir<0){
             throw new excepcion_custom("Indice de riesgo menor que cero imposible calcular");
         }else if(ir>=0 && ir <=0.45){
             nivel_riesgo="Bajo Riesgo";
         }else if(ir>=0.46 && ir <=0.78){
             nivel_riesgo="Medio Riesgo";
         }else if(ir>=0.79 && ir <=1.0){
             nivel_riesgo="Alto Riesgo";
         }else{
            throw new excepcion_custom("Indice de riesgo mayor que uno Riesgo sumamente alto no contemplato en la tabla");
         }
        return nivel_riesgo;
    }
    
    
}
