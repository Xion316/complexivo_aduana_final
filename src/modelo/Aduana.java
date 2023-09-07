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
public class Aduana {
    private LinkedList<importacion> importaciones;
    private LinkedList<paquete> paquetes; // usado unicamente para cargar y descargar del fichero

    public Aduana(LinkedList<importacion> importaciones, LinkedList<paquete> paquetes) {
        this.importaciones = importaciones;
        this.paquetes = paquetes;
    }

    public Aduana() {
        this.importaciones = new LinkedList<>();
        this.paquetes = new LinkedList<>();
    }

    public LinkedList<importacion> getImportaciones() {
        return importaciones;
    }

    public void setImportaciones(LinkedList<importacion> importaciones) {
        this.importaciones = importaciones;
    }

    public LinkedList<paquete> getPaquetes() {
        return paquetes;
    }
    
    public LinkedList<paquete> getPaquetesMarcado(){
        LinkedList<paquete> paquetesMarcadoTemp=new LinkedList<>();
        for(paquete p : paquetes) {
            if(p.getClass().getSimpleName().toLowerCase().trim().equals("paquete_marcado")){
                paquetesMarcadoTemp.add(p);
            }
        }
        return paquetesMarcadoTemp;
    }
    
    public LinkedList<paquete> getPaquetesDecomisado(){
        LinkedList<paquete> paquetesMarcadoTemp=new LinkedList<>();
        for(paquete p : paquetes) {
            if(p.getClass().getSimpleName().toLowerCase().trim().equals("paquete_decomisado")){
                paquetesMarcadoTemp.add(p);
            }
        }
        return paquetesMarcadoTemp;
    }
    
    public LinkedList<paquete> getPaquetesEntrega(){
        LinkedList<paquete> paquetesMarcadoTemp=new LinkedList<>();
        for(paquete p : paquetes) {
            if(p.getClass().getSimpleName().toLowerCase().trim().equals("paquete_entrega")){
                paquetesMarcadoTemp.add(p);
            }
        }
        return paquetesMarcadoTemp;
    }

    public void setPaquetes(LinkedList<paquete> paquetes) {
        this.paquetes = paquetes;
    }

     public void pushContenedores(LinkedList<paquete> LoadPaquetesMarcado) {
         for(paquete object : LoadPaquetesMarcado) {
             this.addPaquete(object);
         }
    }
    
    
    
    /* -- cruds --*/
    
    
    public void addImportacion(importacion i){
        importaciones.add(i);
    }
    
    public void removeImportacion(importacion i){
        importaciones.remove(i);
    }
    
    public importacion findImportacion(importacion i){
        for (importacion object : importaciones) {
            if(object.equals(i)){
                return object;
            }
        }
        return null;
    }
    
    public int getSizeImportacion(){
       return importaciones.size();
    }
    
    
    public void addPaquete(paquete p){
        paquetes.add(p);
    }
    
    public void removePaquete(paquete p){
        paquetes.remove(p);
    }
    
    public paquete findPaquete(paquete p){
        for (paquete object : paquetes) {
            if(object.equals(p)){
                return object;
            }
        }
        return null;
    }
    
    public int getSizePaquetes(){
       return paquetes.size();
    }
    
    
    
    
    
    /// funcion de prueba
    public void ImpresionPaquetes(){
        System.out.println("---> imprimiendo paquetes --->");
        for(paquete p : paquetes) {
            System.out.println("Paquete de "+p.getPeso()+" tipo "+p.getClass().getSimpleName());
        }
    }
    
    
    public LinkedList<Double> get_valorPaquetesDecomisados(){
        double retorno=0;
        double retorno2=0;
        LinkedList<Double> retornoTotal= new LinkedList<>();
        
        for(importacion imp : importaciones) {
            if(imp.getPaquete_importacion().getClass().getSimpleName().toLowerCase().equals("paquete_decomisado")){
                retorno+=imp.getValor_paquete();
            }else if(imp.getPaquete_importacion().getClass().getSimpleName().toLowerCase().equals("paquete_entrega")){
                retorno2+=imp.getValor_paquete();
            }
        }
        retornoTotal.add(retorno); // paquete decomisado
        retornoTotal.add(retorno2); // paquete entrega
        return retornoTotal;
    }

   
    

    
}
