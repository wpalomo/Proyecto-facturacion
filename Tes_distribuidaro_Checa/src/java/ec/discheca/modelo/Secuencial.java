package ec.discheca.modelo;
// Generated May 8, 2016 10:10:06 PM by Hibernate Tools 3.6.0



/**
 * Secuencial generated by hbm2java
 */
public class Secuencial  implements java.io.Serializable {


     private Integer idSecuencial;
     private Empresa empresa;
     private String secuencialFacturaSecuencial;
     private String secuencialNotaCreditoSecuencial;
     private String secuencialNotaDebitoSecuencial;
     private String secuencialGuiaRemisionSecuencial;
     private String secuencialRetencionSecuencial;
     private String puntoEmisionSecuencial;
     private String codigoEstablecimientoSecuencial;
     private String direccionSecuencial;
     private Boolean estadoSecuencial;
     private String ambienteSecuencial;

    public Secuencial() {
    }

	
    public Secuencial(Empresa empresa) {
        this.empresa = empresa;
    }
    public Secuencial(Empresa empresa, String secuencialFacturaSecuencial, String secuencialNotaCreditoSecuencial, String secuencialNotaDebitoSecuencial, String secuencialGuiaRemisionSecuencial, String secuencialRetencionSecuencial, String puntoEmisionSecuencial, String codigoEstablecimientoSecuencial, String direccionSecuencial, Boolean estadoSecuencial, String ambienteSecuencial) {
       this.empresa = empresa;
       this.secuencialFacturaSecuencial = secuencialFacturaSecuencial;
       this.secuencialNotaCreditoSecuencial = secuencialNotaCreditoSecuencial;
       this.secuencialNotaDebitoSecuencial = secuencialNotaDebitoSecuencial;
       this.secuencialGuiaRemisionSecuencial = secuencialGuiaRemisionSecuencial;
       this.secuencialRetencionSecuencial = secuencialRetencionSecuencial;
       this.puntoEmisionSecuencial = puntoEmisionSecuencial;
       this.codigoEstablecimientoSecuencial = codigoEstablecimientoSecuencial;
       this.direccionSecuencial = direccionSecuencial;
       this.estadoSecuencial = estadoSecuencial;
       this.ambienteSecuencial = ambienteSecuencial;
    }
   
    public Integer getIdSecuencial() {
        return this.idSecuencial;
    }
    
    public void setIdSecuencial(Integer idSecuencial) {
        this.idSecuencial = idSecuencial;
    }
    public Empresa getEmpresa() {
        return this.empresa;
    }
    
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public String getSecuencialFacturaSecuencial() {
        return this.secuencialFacturaSecuencial;
    }
    
    public void setSecuencialFacturaSecuencial(String secuencialFacturaSecuencial) {
        this.secuencialFacturaSecuencial = secuencialFacturaSecuencial;
    }
    public String getSecuencialNotaCreditoSecuencial() {
        return this.secuencialNotaCreditoSecuencial;
    }
    
    public void setSecuencialNotaCreditoSecuencial(String secuencialNotaCreditoSecuencial) {
        this.secuencialNotaCreditoSecuencial = secuencialNotaCreditoSecuencial;
    }
    public String getSecuencialNotaDebitoSecuencial() {
        return this.secuencialNotaDebitoSecuencial;
    }
    
    public void setSecuencialNotaDebitoSecuencial(String secuencialNotaDebitoSecuencial) {
        this.secuencialNotaDebitoSecuencial = secuencialNotaDebitoSecuencial;
    }
    public String getSecuencialGuiaRemisionSecuencial() {
        return this.secuencialGuiaRemisionSecuencial;
    }
    
    public void setSecuencialGuiaRemisionSecuencial(String secuencialGuiaRemisionSecuencial) {
        this.secuencialGuiaRemisionSecuencial = secuencialGuiaRemisionSecuencial;
    }
    public String getSecuencialRetencionSecuencial() {
        return this.secuencialRetencionSecuencial;
    }
    
    public void setSecuencialRetencionSecuencial(String secuencialRetencionSecuencial) {
        this.secuencialRetencionSecuencial = secuencialRetencionSecuencial;
    }
    public String getPuntoEmisionSecuencial() {
        return this.puntoEmisionSecuencial;
    }
    
    public void setPuntoEmisionSecuencial(String puntoEmisionSecuencial) {
        this.puntoEmisionSecuencial = puntoEmisionSecuencial;
    }
    public String getCodigoEstablecimientoSecuencial() {
        return this.codigoEstablecimientoSecuencial;
    }
    
    public void setCodigoEstablecimientoSecuencial(String codigoEstablecimientoSecuencial) {
        this.codigoEstablecimientoSecuencial = codigoEstablecimientoSecuencial;
    }
    public String getDireccionSecuencial() {
        return this.direccionSecuencial;
    }
    
    public void setDireccionSecuencial(String direccionSecuencial) {
        this.direccionSecuencial = direccionSecuencial;
    }
    public Boolean getEstadoSecuencial() {
        return this.estadoSecuencial;
    }
    
    public void setEstadoSecuencial(Boolean estadoSecuencial) {
        this.estadoSecuencial = estadoSecuencial;
    }
    public String getAmbienteSecuencial() {
        return this.ambienteSecuencial;
    }
    
    public void setAmbienteSecuencial(String ambienteSecuencial) {
        this.ambienteSecuencial = ambienteSecuencial;
    }




}


