package ec.discheca.modelo;
// Generated May 8, 2016 10:10:06 PM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * ComprobanteElectronico generated by hbm2java
 */
public class ComprobanteElectronico  implements java.io.Serializable {


     private Integer idComprobanteElectronico;
     private TipoComprobanteElectronico tipoComprobanteElectronico;
     private String claveAccesoComprobanteElectronico;
     private String codigoEstablecimientoComprobanteElectronico;
     private String puntoEmisionComprobanteElectronico;
     private String secuencialComprobanteElectronico;
     private String numeroAutorizacionComprobanteElectronico;
     private String rucEmisorComprobanteElectronico;
     private String nombreComercialEmisorComprobanteElectronico;
     private String razonSocialEmisorComprobanteElectronico;
     private String ambienteComprobanteElectronico;
     private String estadoComprobanteElectronico;
     private String mensajeComprobanteElectronico;
     private Date fechaEmisionComprobanteElectronico;
     private Date fechaAutorizacionComprobanteElectronico;
     private String valorTotalFacturaComprobanteElectronico;
     private byte[] archivoRespuestaSricomprobanteElectronico;
     private byte[] comprobanteFirmadoComprobanteElectronico;
     private Boolean notificadoCorreo;
     private Boolean vistoEmisorComprobanteElectronico;
     private String tipoPagoComprobanteElectronico;
     private String numeroDocumentoTransferencia;
     private Set comprobanteElectronicoPendientes = new HashSet(0);
     private Set detalles = new HashSet(0);
     private Set asignacionComprobanteElectronicos = new HashSet(0);

    public ComprobanteElectronico() {
    }

	
    public ComprobanteElectronico(TipoComprobanteElectronico tipoComprobanteElectronico, String claveAccesoComprobanteElectronico, String codigoEstablecimientoComprobanteElectronico, String puntoEmisionComprobanteElectronico, String secuencialComprobanteElectronico, String rucEmisorComprobanteElectronico, String nombreComercialEmisorComprobanteElectronico, String razonSocialEmisorComprobanteElectronico, String ambienteComprobanteElectronico, String estadoComprobanteElectronico, String mensajeComprobanteElectronico, Date fechaEmisionComprobanteElectronico) {
        this.tipoComprobanteElectronico = tipoComprobanteElectronico;
        this.claveAccesoComprobanteElectronico = claveAccesoComprobanteElectronico;
        this.codigoEstablecimientoComprobanteElectronico = codigoEstablecimientoComprobanteElectronico;
        this.puntoEmisionComprobanteElectronico = puntoEmisionComprobanteElectronico;
        this.secuencialComprobanteElectronico = secuencialComprobanteElectronico;
        this.rucEmisorComprobanteElectronico = rucEmisorComprobanteElectronico;
        this.nombreComercialEmisorComprobanteElectronico = nombreComercialEmisorComprobanteElectronico;
        this.razonSocialEmisorComprobanteElectronico = razonSocialEmisorComprobanteElectronico;
        this.ambienteComprobanteElectronico = ambienteComprobanteElectronico;
        this.estadoComprobanteElectronico = estadoComprobanteElectronico;
        this.mensajeComprobanteElectronico = mensajeComprobanteElectronico;
        this.fechaEmisionComprobanteElectronico = fechaEmisionComprobanteElectronico;
    }
    public ComprobanteElectronico(TipoComprobanteElectronico tipoComprobanteElectronico, String claveAccesoComprobanteElectronico, String codigoEstablecimientoComprobanteElectronico, String puntoEmisionComprobanteElectronico, String secuencialComprobanteElectronico, String numeroAutorizacionComprobanteElectronico, String rucEmisorComprobanteElectronico, String nombreComercialEmisorComprobanteElectronico, String razonSocialEmisorComprobanteElectronico, String ambienteComprobanteElectronico, String estadoComprobanteElectronico, String mensajeComprobanteElectronico, Date fechaEmisionComprobanteElectronico, Date fechaAutorizacionComprobanteElectronico, String valorTotalFacturaComprobanteElectronico, byte[] archivoRespuestaSricomprobanteElectronico, byte[] comprobanteFirmadoComprobanteElectronico, Boolean notificadoCorreo, Boolean vistoEmisorComprobanteElectronico, String tipoPagoComprobanteElectronico, String numeroDocumentoTransferencia, Set comprobanteElectronicoPendientes, Set detalles, Set asignacionComprobanteElectronicos) {
       this.tipoComprobanteElectronico = tipoComprobanteElectronico;
       this.claveAccesoComprobanteElectronico = claveAccesoComprobanteElectronico;
       this.codigoEstablecimientoComprobanteElectronico = codigoEstablecimientoComprobanteElectronico;
       this.puntoEmisionComprobanteElectronico = puntoEmisionComprobanteElectronico;
       this.secuencialComprobanteElectronico = secuencialComprobanteElectronico;
       this.numeroAutorizacionComprobanteElectronico = numeroAutorizacionComprobanteElectronico;
       this.rucEmisorComprobanteElectronico = rucEmisorComprobanteElectronico;
       this.nombreComercialEmisorComprobanteElectronico = nombreComercialEmisorComprobanteElectronico;
       this.razonSocialEmisorComprobanteElectronico = razonSocialEmisorComprobanteElectronico;
       this.ambienteComprobanteElectronico = ambienteComprobanteElectronico;
       this.estadoComprobanteElectronico = estadoComprobanteElectronico;
       this.mensajeComprobanteElectronico = mensajeComprobanteElectronico;
       this.fechaEmisionComprobanteElectronico = fechaEmisionComprobanteElectronico;
       this.fechaAutorizacionComprobanteElectronico = fechaAutorizacionComprobanteElectronico;
       this.valorTotalFacturaComprobanteElectronico = valorTotalFacturaComprobanteElectronico;
       this.archivoRespuestaSricomprobanteElectronico = archivoRespuestaSricomprobanteElectronico;
       this.comprobanteFirmadoComprobanteElectronico = comprobanteFirmadoComprobanteElectronico;
       this.notificadoCorreo = notificadoCorreo;
       this.vistoEmisorComprobanteElectronico = vistoEmisorComprobanteElectronico;
       this.tipoPagoComprobanteElectronico = tipoPagoComprobanteElectronico;
       this.numeroDocumentoTransferencia = numeroDocumentoTransferencia;
       this.comprobanteElectronicoPendientes = comprobanteElectronicoPendientes;
       this.detalles = detalles;
       this.asignacionComprobanteElectronicos = asignacionComprobanteElectronicos;
    }
   
    public Integer getIdComprobanteElectronico() {
        return this.idComprobanteElectronico;
    }
    
    public void setIdComprobanteElectronico(Integer idComprobanteElectronico) {
        this.idComprobanteElectronico = idComprobanteElectronico;
    }
    public TipoComprobanteElectronico getTipoComprobanteElectronico() {
        return this.tipoComprobanteElectronico;
    }
    
    public void setTipoComprobanteElectronico(TipoComprobanteElectronico tipoComprobanteElectronico) {
        this.tipoComprobanteElectronico = tipoComprobanteElectronico;
    }
    public String getClaveAccesoComprobanteElectronico() {
        return this.claveAccesoComprobanteElectronico;
    }
    
    public void setClaveAccesoComprobanteElectronico(String claveAccesoComprobanteElectronico) {
        this.claveAccesoComprobanteElectronico = claveAccesoComprobanteElectronico;
    }
    public String getCodigoEstablecimientoComprobanteElectronico() {
        return this.codigoEstablecimientoComprobanteElectronico;
    }
    
    public void setCodigoEstablecimientoComprobanteElectronico(String codigoEstablecimientoComprobanteElectronico) {
        this.codigoEstablecimientoComprobanteElectronico = codigoEstablecimientoComprobanteElectronico;
    }
    public String getPuntoEmisionComprobanteElectronico() {
        return this.puntoEmisionComprobanteElectronico;
    }
    
    public void setPuntoEmisionComprobanteElectronico(String puntoEmisionComprobanteElectronico) {
        this.puntoEmisionComprobanteElectronico = puntoEmisionComprobanteElectronico;
    }
    public String getSecuencialComprobanteElectronico() {
        return this.secuencialComprobanteElectronico;
    }
    
    public void setSecuencialComprobanteElectronico(String secuencialComprobanteElectronico) {
        this.secuencialComprobanteElectronico = secuencialComprobanteElectronico;
    }
    public String getNumeroAutorizacionComprobanteElectronico() {
        return this.numeroAutorizacionComprobanteElectronico;
    }
    
    public void setNumeroAutorizacionComprobanteElectronico(String numeroAutorizacionComprobanteElectronico) {
        this.numeroAutorizacionComprobanteElectronico = numeroAutorizacionComprobanteElectronico;
    }
    public String getRucEmisorComprobanteElectronico() {
        return this.rucEmisorComprobanteElectronico;
    }
    
    public void setRucEmisorComprobanteElectronico(String rucEmisorComprobanteElectronico) {
        this.rucEmisorComprobanteElectronico = rucEmisorComprobanteElectronico;
    }
    public String getNombreComercialEmisorComprobanteElectronico() {
        return this.nombreComercialEmisorComprobanteElectronico;
    }
    
    public void setNombreComercialEmisorComprobanteElectronico(String nombreComercialEmisorComprobanteElectronico) {
        this.nombreComercialEmisorComprobanteElectronico = nombreComercialEmisorComprobanteElectronico;
    }
    public String getRazonSocialEmisorComprobanteElectronico() {
        return this.razonSocialEmisorComprobanteElectronico;
    }
    
    public void setRazonSocialEmisorComprobanteElectronico(String razonSocialEmisorComprobanteElectronico) {
        this.razonSocialEmisorComprobanteElectronico = razonSocialEmisorComprobanteElectronico;
    }
    public String getAmbienteComprobanteElectronico() {
        return this.ambienteComprobanteElectronico;
    }
    
    public void setAmbienteComprobanteElectronico(String ambienteComprobanteElectronico) {
        this.ambienteComprobanteElectronico = ambienteComprobanteElectronico;
    }
    public String getEstadoComprobanteElectronico() {
        return this.estadoComprobanteElectronico;
    }
    
    public void setEstadoComprobanteElectronico(String estadoComprobanteElectronico) {
        this.estadoComprobanteElectronico = estadoComprobanteElectronico;
    }
    public String getMensajeComprobanteElectronico() {
        return this.mensajeComprobanteElectronico;
    }
    
    public void setMensajeComprobanteElectronico(String mensajeComprobanteElectronico) {
        this.mensajeComprobanteElectronico = mensajeComprobanteElectronico;
    }
    public Date getFechaEmisionComprobanteElectronico() {
        return this.fechaEmisionComprobanteElectronico;
    }
    
    public void setFechaEmisionComprobanteElectronico(Date fechaEmisionComprobanteElectronico) {
        this.fechaEmisionComprobanteElectronico = fechaEmisionComprobanteElectronico;
    }
    public Date getFechaAutorizacionComprobanteElectronico() {
        return this.fechaAutorizacionComprobanteElectronico;
    }
    
    public void setFechaAutorizacionComprobanteElectronico(Date fechaAutorizacionComprobanteElectronico) {
        this.fechaAutorizacionComprobanteElectronico = fechaAutorizacionComprobanteElectronico;
    }
    public String getValorTotalFacturaComprobanteElectronico() {
        return this.valorTotalFacturaComprobanteElectronico;
    }
    
    public void setValorTotalFacturaComprobanteElectronico(String valorTotalFacturaComprobanteElectronico) {
        this.valorTotalFacturaComprobanteElectronico = valorTotalFacturaComprobanteElectronico;
    }
    public byte[] getArchivoRespuestaSricomprobanteElectronico() {
        return this.archivoRespuestaSricomprobanteElectronico;
    }
    
    public void setArchivoRespuestaSricomprobanteElectronico(byte[] archivoRespuestaSricomprobanteElectronico) {
        this.archivoRespuestaSricomprobanteElectronico = archivoRespuestaSricomprobanteElectronico;
    }
    public byte[] getComprobanteFirmadoComprobanteElectronico() {
        return this.comprobanteFirmadoComprobanteElectronico;
    }
    
    public void setComprobanteFirmadoComprobanteElectronico(byte[] comprobanteFirmadoComprobanteElectronico) {
        this.comprobanteFirmadoComprobanteElectronico = comprobanteFirmadoComprobanteElectronico;
    }
    public Boolean getNotificadoCorreo() {
        return this.notificadoCorreo;
    }
    
    public void setNotificadoCorreo(Boolean notificadoCorreo) {
        this.notificadoCorreo = notificadoCorreo;
    }
    public Boolean getVistoEmisorComprobanteElectronico() {
        return this.vistoEmisorComprobanteElectronico;
    }
    
    public void setVistoEmisorComprobanteElectronico(Boolean vistoEmisorComprobanteElectronico) {
        this.vistoEmisorComprobanteElectronico = vistoEmisorComprobanteElectronico;
    }
    public String getTipoPagoComprobanteElectronico() {
        return this.tipoPagoComprobanteElectronico;
    }
    
    public void setTipoPagoComprobanteElectronico(String tipoPagoComprobanteElectronico) {
        this.tipoPagoComprobanteElectronico = tipoPagoComprobanteElectronico;
    }
    public String getNumeroDocumentoTransferencia() {
        return this.numeroDocumentoTransferencia;
    }
    
    public void setNumeroDocumentoTransferencia(String numeroDocumentoTransferencia) {
        this.numeroDocumentoTransferencia = numeroDocumentoTransferencia;
    }
    public Set getComprobanteElectronicoPendientes() {
        return this.comprobanteElectronicoPendientes;
    }
    
    public void setComprobanteElectronicoPendientes(Set comprobanteElectronicoPendientes) {
        this.comprobanteElectronicoPendientes = comprobanteElectronicoPendientes;
    }
    public Set getDetalles() {
        return this.detalles;
    }
    
    public void setDetalles(Set detalles) {
        this.detalles = detalles;
    }
    public Set getAsignacionComprobanteElectronicos() {
        return this.asignacionComprobanteElectronicos;
    }
    
    public void setAsignacionComprobanteElectronicos(Set asignacionComprobanteElectronicos) {
        this.asignacionComprobanteElectronicos = asignacionComprobanteElectronicos;
    }




}


