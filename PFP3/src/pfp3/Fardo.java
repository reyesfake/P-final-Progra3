/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfp3;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author ProcesosE
 */
public class Fardo {
        
       
        private final Set<Reg> cccp = new HashSet<Reg>();
        
        public void agregarRegs(Reg reg){
            cccp.add(reg);
        }
        
        public void mostrarRegs(){
            System.out.println("Los datos almacenados son:");
            for (Reg reg : cccp) {
            System.out.println(reg.getNumeroSeguimiento() + " - " + reg.getRemitente() + " - " + reg.getDestinatario() + " - " + reg.getDepartamentoRecepcion()+ " - " + reg.getDepartamentoDestino() + " - " + reg.getDescripcion() + " - " + reg.getPeso() + " - " + reg.getEstado() + " - " + reg.getClasificacion());
        }
        }

    
    }
