/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author hack2
 */
public class importacion {
    private String nombres,apellidos,id,pais_procedencia,fecha_realiza;
    private double valor_paquete;
    private paquete paquete_importacion; // puede un paquete traer varios productos

    public importacion(String nombres, String apellidos, String id, String pais_procedencia, String fecha_realiza, double valor_paquete, paquete paquete_importacion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.pais_procedencia = pais_procedencia;
        this.fecha_realiza = fecha_realiza;
        this.valor_paquete = valor_paquete;
        this.paquete_importacion = paquete_importacion;
    }

    public paquete getPaquete_importacion() {
        return paquete_importacion;
    }

    public void setPaquete_importacion(paquete paquete_importacion) {
        this.paquete_importacion = paquete_importacion;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPais_procedencia() {
        return pais_procedencia;
    }

    public void setPais_procedencia(String pais_procedencia) {
        this.pais_procedencia = pais_procedencia;
    }

    public String getFecha_realiza() {
        return fecha_realiza;
    }

    public void setFecha_realiza(String fecha_realiza) {
        this.fecha_realiza = fecha_realiza;
    }

    public double getValor_paquete() {
        return valor_paquete;
    }

    public void setValor_paquete(double valor_paquete) {
        this.valor_paquete = valor_paquete;
    }
    
    
}
