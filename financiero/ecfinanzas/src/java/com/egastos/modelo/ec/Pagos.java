package com.egastos.modelo.ec;
// Generated 20/06/2017 21:43:07 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Pagos generated by hbm2java
 */
public class Pagos  implements java.io.Serializable {


     private Integer idpagos;
     private Planespago planespago;
     private UsuarioAcceso usuarioAcceso;
     private Double valorPago;
     private String numeroCuenta;
     private String estadopago;
     private Date fechaPago;
     private Date fechaValidacion;
     private String imagenTransferencia;
     private String numeroAdicional;
     private String correoAdicional;
     private Date fechacaduca;
     private String numeroCuentaOrigen;
     private String numeroTransferencia;
     private Set codigosverificacions = new HashSet(0);

    public Pagos() {
    }

	
    public Pagos(Planespago planespago, UsuarioAcceso usuarioAcceso) {
        this.planespago = planespago;
        this.usuarioAcceso = usuarioAcceso;
    }
    public Pagos(Planespago planespago, UsuarioAcceso usuarioAcceso, Double valorPago, String numeroCuenta, String estadopago, Date fechaPago, Date fechaValidacion, String imagenTransferencia, String numeroAdicional, String correoAdicional, Date fechacaduca, String numeroCuentaOrigen, String numeroTransferencia, Set codigosverificacions) {
       this.planespago = planespago;
       this.usuarioAcceso = usuarioAcceso;
       this.valorPago = valorPago;
       this.numeroCuenta = numeroCuenta;
       this.estadopago = estadopago;
       this.fechaPago = fechaPago;
       this.fechaValidacion = fechaValidacion;
       this.imagenTransferencia = imagenTransferencia;
       this.numeroAdicional = numeroAdicional;
       this.correoAdicional = correoAdicional;
       this.fechacaduca = fechacaduca;
       this.numeroCuentaOrigen = numeroCuentaOrigen;
       this.numeroTransferencia = numeroTransferencia;
       this.codigosverificacions = codigosverificacions;
    }
   
    public Integer getIdpagos() {
        return this.idpagos;
    }
    
    public void setIdpagos(Integer idpagos) {
        this.idpagos = idpagos;
    }
    public Planespago getPlanespago() {
        return this.planespago;
    }
    
    public void setPlanespago(Planespago planespago) {
        this.planespago = planespago;
    }
    public UsuarioAcceso getUsuarioAcceso() {
        return this.usuarioAcceso;
    }
    
    public void setUsuarioAcceso(UsuarioAcceso usuarioAcceso) {
        this.usuarioAcceso = usuarioAcceso;
    }
    public Double getValorPago() {
        return this.valorPago;
    }
    
    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getEstadopago() {
        return this.estadopago;
    }
    
    public void setEstadopago(String estadopago) {
        this.estadopago = estadopago;
    }
    public Date getFechaPago() {
        return this.fechaPago;
    }
    
    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }
    public Date getFechaValidacion() {
        return this.fechaValidacion;
    }
    
    public void setFechaValidacion(Date fechaValidacion) {
        this.fechaValidacion = fechaValidacion;
    }
    public String getImagenTransferencia() {
        return this.imagenTransferencia;
    }
    
    public void setImagenTransferencia(String imagenTransferencia) {
        this.imagenTransferencia = imagenTransferencia;
    }
    public String getNumeroAdicional() {
        return this.numeroAdicional;
    }
    
    public void setNumeroAdicional(String numeroAdicional) {
        this.numeroAdicional = numeroAdicional;
    }
    public String getCorreoAdicional() {
        return this.correoAdicional;
    }
    
    public void setCorreoAdicional(String correoAdicional) {
        this.correoAdicional = correoAdicional;
    }
    public Date getFechacaduca() {
        return this.fechacaduca;
    }
    
    public void setFechacaduca(Date fechacaduca) {
        this.fechacaduca = fechacaduca;
    }
    public String getNumeroCuentaOrigen() {
        return this.numeroCuentaOrigen;
    }
    
    public void setNumeroCuentaOrigen(String numeroCuentaOrigen) {
        this.numeroCuentaOrigen = numeroCuentaOrigen;
    }
    public String getNumeroTransferencia() {
        return this.numeroTransferencia;
    }
    
    public void setNumeroTransferencia(String numeroTransferencia) {
        this.numeroTransferencia = numeroTransferencia;
    }
    public Set getCodigosverificacions() {
        return this.codigosverificacions;
    }
    
    public void setCodigosverificacions(Set codigosverificacions) {
        this.codigosverificacions = codigosverificacions;
    }




}


