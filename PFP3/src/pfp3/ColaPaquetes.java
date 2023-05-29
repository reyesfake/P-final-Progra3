/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pfp3;



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
    
    
  
}
