package com.egastos.modelo.ec;
// Generated 20/06/2017 21:43:07 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UsuarioAcceso generated by hbm2java
 */
public class UsuarioAcceso  implements java.io.Serializable {


     private Integer idUsuario;
     private Perfil perfil;
     private String identificacionUsuario;
     private String nombreUsuarioAcceso;
     private String claveUsuarioAcceso;
     private String nombreUsuario;
     private String apellidoUsuario;
     private String telefonoPrincipalUsuario;
     private String telefonoAdicionalUsuario;
     private String correoPrincipalUsuario;
     private String correoAdicionalUsuario;
     private Date fechaRegistroUsuario;
     private String estadoUsuario;
     private String detalleInformacionUsuario;
     private Integer visitas;
     private String mensajeOpcional;
     private Set pagoses = new HashSet(0);
     private Set auditorias = new HashSet(0);

    public UsuarioAcceso() {
    }

	
    public UsuarioAcceso(Perfil perfil) {
        this.perfil = perfil;
    }
    public UsuarioAcceso(Perfil perfil, String identificacionUsuario, String nombreUsuarioAcceso, String claveUsuarioAcceso, String nombreUsuario, String apellidoUsuario, String telefonoPrincipalUsuario, String telefonoAdicionalUsuario, String correoPrincipalUsuario, String correoAdicionalUsuario, Date fechaRegistroUsuario, String estadoUsuario, String detalleInformacionUsuario, Integer visitas, String mensajeOpcional, Set pagoses, Set auditorias) {
       this.perfil = perfil;
       this.identificacionUsuario = identificacionUsuario;
       this.nombreUsuarioAcceso = nombreUsuarioAcceso;
       this.claveUsuarioAcceso = claveUsuarioAcceso;
       this.nombreUsuario = nombreUsuario;
       this.apellidoUsuario = apellidoUsuario;
       this.telefonoPrincipalUsuario = telefonoPrincipalUsuario;
       this.telefonoAdicionalUsuario = telefonoAdicionalUsuario;
       this.correoPrincipalUsuario = correoPrincipalUsuario;
       this.correoAdicionalUsuario = correoAdicionalUsuario;
       this.fechaRegistroUsuario = fechaRegistroUsuario;
       this.estadoUsuario = estadoUsuario;
       this.detalleInformacionUsuario = detalleInformacionUsuario;
       this.visitas = visitas;
       this.mensajeOpcional = mensajeOpcional;
       this.pagoses = pagoses;
       this.auditorias = auditorias;
    }
   
    public Integer getIdUsuario() {
        return this.idUsuario;
    }
    
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public String getIdentificacionUsuario() {
        return this.identificacionUsuario;
    }
    
    public void setIdentificacionUsuario(String identificacionUsuario) {
        this.identificacionUsuario = identificacionUsuario;
    }
    public String getNombreUsuarioAcceso() {
        return this.nombreUsuarioAcceso;
    }
    
    public void setNombreUsuarioAcceso(String nombreUsuarioAcceso) {
        this.nombreUsuarioAcceso = nombreUsuarioAcceso;
    }
    public String getClaveUsuarioAcceso() {
        return this.claveUsuarioAcceso;
    }
    
    public void setClaveUsuarioAcceso(String claveUsuarioAcceso) {
        this.claveUsuarioAcceso = claveUsuarioAcceso;
    }
    public String getNombreUsuario() {
        return this.nombreUsuario;
    }
    
    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }
    public String getApellidoUsuario() {
        return this.apellidoUsuario;
    }
    
    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }
    public String getTelefonoPrincipalUsuario() {
        return this.telefonoPrincipalUsuario;
    }
    
    public void setTelefonoPrincipalUsuario(String telefonoPrincipalUsuario) {
        this.telefonoPrincipalUsuario = telefonoPrincipalUsuario;
    }
    public String getTelefonoAdicionalUsuario() {
        return this.telefonoAdicionalUsuario;
    }
    
    public void setTelefonoAdicionalUsuario(String telefonoAdicionalUsuario) {
        this.telefonoAdicionalUsuario = telefonoAdicionalUsuario;
    }
    public String getCorreoPrincipalUsuario() {
        return this.correoPrincipalUsuario;
    }
    
    public void setCorreoPrincipalUsuario(String correoPrincipalUsuario) {
        this.correoPrincipalUsuario = correoPrincipalUsuario;
    }
    public String getCorreoAdicionalUsuario() {
        return this.correoAdicionalUsuario;
    }
    
    public void setCorreoAdicionalUsuario(String correoAdicionalUsuario) {
        this.correoAdicionalUsuario = correoAdicionalUsuario;
    }
    public Date getFechaRegistroUsuario() {
        return this.fechaRegistroUsuario;
    }
    
    public void setFechaRegistroUsuario(Date fechaRegistroUsuario) {
        this.fechaRegistroUsuario = fechaRegistroUsuario;
    }
    public String getEstadoUsuario() {
        return this.estadoUsuario;
    }
    
    public void setEstadoUsuario(String estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }
    public String getDetalleInformacionUsuario() {
        return this.detalleInformacionUsuario;
    }
    
    public void setDetalleInformacionUsuario(String detalleInformacionUsuario) {
        this.detalleInformacionUsuario = detalleInformacionUsuario;
    }
    public Integer getVisitas() {
        return this.visitas;
    }
    
    public void setVisitas(Integer visitas) {
        this.visitas = visitas;
    }
    public String getMensajeOpcional() {
        return this.mensajeOpcional;
    }
    
    public void setMensajeOpcional(String mensajeOpcional) {
        this.mensajeOpcional = mensajeOpcional;
    }
    public Set getPagoses() {
        return this.pagoses;
    }
    
    public void setPagoses(Set pagoses) {
        this.pagoses = pagoses;
    }
    public Set getAuditorias() {
        return this.auditorias;
    }
    
    public void setAuditorias(Set auditorias) {
        this.auditorias = auditorias;
    }




}


