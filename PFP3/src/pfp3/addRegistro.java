//ESTA CLASE ESTA DE PRUEBA
package pfp3;

public class addRegistro {
    
        String numeroSeguimientoAR;
        String remitenteAR;
        String destinatarioAR;
        String departamentoRecepcionAR;
        String departamentoDestinoAR;
        String descripcionPaqueteAR;
        double pesoAR;
        String estadoAR;
        String clasificacionAR;

    //SE USA EL CONSTRUCTOR PARA LEER Y ASIGNAR DATOS
    public addRegistro(String numeroSeguimientoAR, String remitenteAR, String destinatarioAR, String departamentoRecepcionAR, String departamentoDestinoAR, String descripcionPaqueteAR, double pesoAR, String estadoAR, String clasificacionAR) {
        this.numeroSeguimientoAR = numeroSeguimientoAR;
        this.remitenteAR = remitenteAR;
        this.destinatarioAR = destinatarioAR;
        this.departamentoRecepcionAR = departamentoRecepcionAR;
        this.departamentoDestinoAR = departamentoDestinoAR;
        this.descripcionPaqueteAR = descripcionPaqueteAR;
        this.pesoAR = pesoAR;
        this.estadoAR = estadoAR;
        this.clasificacionAR = clasificacionAR;
    }

//    addRegistro() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
 
    //se usan los metodos get y set para los atributos

    public String getNumeroSeguimientoAR() {
        return numeroSeguimientoAR;
    }

    public void setNumeroSeguimientoAR(String numeroSeguimientoAR) {
        this.numeroSeguimientoAR = numeroSeguimientoAR;
    }

    public String getRemitenteAR() {
        return remitenteAR;
    }

    public void setRemitenteAR(String remitenteAR) {
        this.remitenteAR = remitenteAR;
    }

    public String getDestinatarioAR() {
        return destinatarioAR;
    }

    public void setDestinatarioAR(String destinatarioAR) {
        this.destinatarioAR = destinatarioAR;
    }

    public String getDepartamentoRecepcionAR() {
        return departamentoRecepcionAR;
    }

    public void setDepartamentoRecepcionAR(String departamentoRecepcionAR) {
        this.departamentoRecepcionAR = departamentoRecepcionAR;
    }

    public String getDepartamentoDestinoAR() {
        return departamentoDestinoAR;
    }

    public void setDepartamentoDestinoAR(String departamentoDestinoAR) {
        this.departamentoDestinoAR = departamentoDestinoAR;
    }

    public String getDescripcionPaqueteAR() {
        return descripcionPaqueteAR;
    }

    public void setDescripcionPaqueteAR(String descripcionPaqueteAR) {
        this.descripcionPaqueteAR = descripcionPaqueteAR;
    }

    public double getPesoAR() {
        return pesoAR;
    }

    public void setPesoAR(double pesoAR) {
        this.pesoAR = pesoAR;
    }

    public String getEstadoAR() {
        return estadoAR;
    }

    public void setEstadoAR(String estadoAR) {
        this.estadoAR = estadoAR;
    }

    public String getClasificacionAR() {
        return clasificacionAR;
    }

    public void setClasificacionAR(String clasificacionAR) {
        this.clasificacionAR = clasificacionAR;
    }  
    
}
