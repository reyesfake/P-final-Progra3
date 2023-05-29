/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfp3;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ProcesosE
 */
public class ColaPaquetes {

    
    Paquete pack;    
    
    public ColaPaquetes(Paquete pack) {
        
        this.pack = pack;
        
        
        
        String numeroSeguimiento = pack.getNumeroSeguimiento();
        String remitente = pack.getRemitente() ;
        String destinatario = pack.getDestinatario();
        String departamentoRecepcion = pack.getDepartamentoRecepcion();
        String departamentoDestino = pack.getDepartamentoDestino();
        String descripcionPaquete = pack.getDescripcionPaquete();
        double peso = pack.getPeso();
        String estado = pack.getEstado();
        String clasificacion = pack.getClasificacion();
        
        
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
    
    
   /* public Queue<Paquete> colaPaquetes;

    public ColaPaquetes() {
        colaPaquetes = new LinkedList<>();
    }

    public void agregarPaquete(Paquete paquete) {
        colaPaquetes.offer(paquete);
    }

    public Paquete obtenerSiguientePaquete() {
        return colaPaquetes.peek();
    }

    public Paquete eliminarSiguientePaquete() {
        return colaPaquetes.poll();
    }

    public boolean estaVacia() {
        return colaPaquetes.isEmpty();
    }

    public int tamaño() {
        return colaPaquetes.size();
    }

    public void imprimirCola() {
        
        
        System.out.println("Contenido de la cola de paquetes:");

        for (Paquete paquete : colaPaquetes) {
            System.out.println("Número de seguimiento: " + paquete.getNumeroSeguimiento());
            System.out.println("Remitente: " + paquete.getRemitente());
            System.out.println("Destinatario: " + paquete.getDestinatario());
            System.out.println("Departamento de recepción: " + paquete.getDepartamentoRecepcion());
            System.out.println("Departamento de destino: " + paquete.getDepartamentoDestino());
            System.out.println("Descripción del paquete: " + paquete.getDescripcionPaquete());
            System.out.println("Peso: " + paquete.getPeso());
            System.out.println("Estado: " + paquete.getEstado());
            System.out.println("Clasificación: " + paquete.getClasificacion());
            System.out.println("------------------------");
        }
    }*/
}
