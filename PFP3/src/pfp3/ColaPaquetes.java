//VALIDAR SI TIENE UNA FUNCION
package pfp3;

import java.util.HashMap;
import java.util.Map;

public class ColaPaquetes {
    
//    Paquete pack;    
    
    public static Map<Integer, Paquete> ordenarRegistro = new HashMap<>();
    
    public ColaPaquetes(Paquete pack) {
        
//        this.pack = pack;
        
        
        
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

Paquete addOrden = new Paquete();
        
    }
    
    public static void guardarHashMap (){
        
        //Paquete orden = new Paquete();
    }
  
}
