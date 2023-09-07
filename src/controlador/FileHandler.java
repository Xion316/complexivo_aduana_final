/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;
import modelo.Aduana;
import modelo.paquete;



/**
 *
 * @author hack2
 */
public class FileHandler {
    

    /*public void Save(Terminal EmpresaTerminal) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("contenedores_salvados.dat"));
        LinkedList<contenedor> componentes = EmpresaTerminal.getContenedores();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
   
    public Terminal Load() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("contenedores_salvados.dat"));
        LinkedList<contenedor> componentes_cargados=(LinkedList<contenedor>)load.readObject();
        load.close();
        Terminal EmpresaTerminal;
        EmpresaTerminal=new Terminal(componentes_cargados,new LinkedList<>()); 
        System.out.println("Componentes cargados");
        return EmpresaTerminal;
    }*/
    
    
    /* salvo y cargo paquete marcado */
     public void SavePaquetesMarcado(Aduana EmpresaAduana) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("paquetes_marcado.dat"));
        LinkedList<paquete> componentes = EmpresaAduana.getPaquetesMarcado();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
     
     public LinkedList<paquete> LoadPaquetesMarcado() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("paquetes_marcado.dat"));
        LinkedList<paquete> componentes_cargados=(LinkedList<paquete>)load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }
     
      /* salvo y cargo paquete decomisado */
      public void SavePaquetesDecomisado(Aduana EmpresaAduana) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("paquetes_decomisado.dat"));
        LinkedList<paquete> componentes = EmpresaAduana.getPaquetesDecomisado();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
     
     public LinkedList<paquete> LoadPaquetesDecomisado() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("paquetes_decomisado.dat"));
        LinkedList<paquete> componentes_cargados=(LinkedList<paquete>)load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }
     
      /* salvo y cargo paquetes entrega*/
     public void SavePaquetesEntrega(Aduana EmpresaAduana) throws FileNotFoundException, IOException{
        ObjectOutputStream sv=new ObjectOutputStream(new FileOutputStream("paquetes_entrega.dat"));
        LinkedList<paquete> componentes = EmpresaAduana.getPaquetesEntrega();
        sv.writeObject(componentes);
        sv.close();
        System.out.println("Componentes salvados");
    }
    
     
     public LinkedList<paquete> LoadPaquetesEntrega() throws FileNotFoundException, IOException, ClassNotFoundException{
        ObjectInputStream load=new ObjectInputStream(new FileInputStream("paquetes_entrega.dat"));
        LinkedList<paquete> componentes_cargados=(LinkedList<paquete>)load.readObject();
        load.close();
        System.out.println("Componentes cargados");
        return componentes_cargados;
    }
  
     
    
}
