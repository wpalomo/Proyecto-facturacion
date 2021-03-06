package com.egastos.modelo.ec;
// Generated 20/06/2017 21:43:07 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Auditoria generated by hbm2java
 */
public class Auditoria  implements java.io.Serializable {


     private Integer idauditoria;
     private UsuarioAcceso usuarioAcceso;
     private String mensajeTransaccion;
     private Date fecha;
     private Date fechaHora;

    public Auditoria() {
    }

	
    public Auditoria(UsuarioAcceso usuarioAcceso) {
        this.usuarioAcceso = usuarioAcceso;
    }
    public Auditoria(UsuarioAcceso usuarioAcceso, String mensajeTransaccion, Date fecha, Date fechaHora) {
       this.usuarioAcceso = usuarioAcceso;
       this.mensajeTransaccion = mensajeTransaccion;
       this.fecha = fecha;
       this.fechaHora = fechaHora;
    }
   
    public Integer getIdauditoria() {
        return this.idauditoria;
    }
    
    public void setIdauditoria(Integer idauditoria) {
        this.idauditoria = idauditoria;
    }
    public UsuarioAcceso getUsuarioAcceso() {
        return this.usuarioAcceso;
    }
    
    public void setUsuarioAcceso(UsuarioAcceso usuarioAcceso) {
        this.usuarioAcceso = usuarioAcceso;
    }
    public String getMensajeTransaccion() {
        return this.mensajeTransaccion;
    }
    
    public void setMensajeTransaccion(String mensajeTransaccion) {
        this.mensajeTransaccion = mensajeTransaccion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getFechaHora() {
        return this.fechaHora;
    }
    
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }




}


