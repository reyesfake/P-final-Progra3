//ESTA CLASE INTENTA ORDENAR REGISTRO VALIDAR SU FUNCIONAMIENTO
package pfp3;

import pfp3.addRegistro;

public class ordenarRegistro{
   addRegistro agg;
   
    public void ordenarRegistro() {
        String num = agg.getNumeroSeguimientoAR();
        String rem = agg.getRemitenteAR();
        String des = agg.getDestinatarioAR();
        String depRes = agg.getDepartamentoRecepcionAR();
        String depDes = agg.getDepartamentoDestinoAR();
        String descpaq = agg.getDescripcionPaqueteAR();
        double pes = agg.getPesoAR();
        String est = agg.getEstadoAR();
        String clas = agg.getClasificacionAR();
        
        System.out.println(num);
        
    }
    
}