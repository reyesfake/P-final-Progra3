/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfp3;

import java.util.HashSet;
import java.util.Set;




/**
 *
 * @author ProcesosE
 */
public class ColaPaquetes {
    
private final Set<Reg> cccp = new HashSet<>();
    
    Paquete pack;    
    Fardo fr;
    
    
        String numeroSeguimiento;
        String remitente;
        String destinatario;
        String departamentoRecepcion;
        String departamentoDestino;
        String descripcionPaquete;
        double peso;
        String estado;
        String clasificacion;
    
    public ColaPaquetes(Paquete pack) {
        
        this.pack = pack;
        
        
         numeroSeguimiento = pack.getNumeroSeguimiento();
         remitente = pack.getRemitente() ;
         destinatario = pack.getDestinatario();
         departamentoRecepcion = pack.getDepartamentoRecepcion();
         departamentoDestino = pack.getDepartamentoDestino();
         descripcionPaquete = pack.getDescripcionPaquete();
         peso = pack.getPeso();
         estado = pack.getEstado();
         clasificacion = pack.getClasificacion();
        
        
        imprimirDatos();
        agregarDatos();
        mostrarDatos();
        
 
    }

    
    private void imprimirDatos(){
        System.out.println(numeroSeguimiento);
        System.out.println(remitente);
        System.out.println(destinatario);
        System.out.println(departamentoRecepcion);
        System.out.println(departamentoDestino);
        System.out.println(descripcionPaquete);
        System.out.println(peso);
        System.out.println(estado);
        System.out.println(clasificacion); 
    }
    
    private void agregarDatos(){
        System.out.println("a ver");
     Reg reg = new Reg(numeroSeguimiento, remitente, destinatario, departamentoRecepcion, departamentoDestino, descripcionPaquete, peso, estado, clasificacion);
     System.out.println("Agregadukys");    
        
        
            cccp.add(reg);
        
        
        System.out.println("k pasa");
    }
    
    public void mostrarDatos(){
            System.out.println("Los datos almacenados son:");
            for (Reg reg : cccp) {
            System.out.println(reg.getNumeroSeguimiento() + " - " + reg.getRemitente() + " - " + reg.getDestinatario() + " - " + reg.getDepartamentoRecepcion()+ " - " + reg.getDepartamentoDestino() + " - " + reg.getDescripcion() + " - " + reg.getPeso() + " - " + reg.getEstado() + " - " + reg.getClasificacion());
        }
        }
    
    public void shucada(){
        imprimirDatos();
        agregarDatos();
        mostrarDatos();
    }
    
    
  
}
