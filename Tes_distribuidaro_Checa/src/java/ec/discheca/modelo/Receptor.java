package ec.discheca.modelo;
// Generated May 8, 2016 10:10:06 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Receptor generated by hbm2java
 */
public class Receptor  implements java.io.Serializable {


     private Integer idReceptor;
     private String rucReceptor;
     private String razonSocialReceptor;
     private String telefono;
     private String direccion;
     private String correo;
     private String correoAdicional;
     private String estado;
     private Set asignacionComprobanteElectronicos = new HashSet(0);

    public Receptor() {
    }

	
    public Receptor(String rucReceptor, String razonSocialReceptor) {
        this.rucReceptor = rucReceptor;
        this.razonSocialReceptor = razonSocialReceptor;
    }
    public Receptor(String rucReceptor, String razonSocialReceptor, String telefono, String direccion, String correo, String correoAdicional, String estado, Set asignacionComprobanteElectronicos) {
       this.rucReceptor = rucReceptor;
       this.razonSocialReceptor = razonSocialReceptor;
       this.telefono = telefono;
       this.direccion = direccion;
       this.correo = correo;
       this.correoAdicional = correoAdicional;
       this.estado = estado;
       this.asignacionComprobanteElectronicos = asignacionComprobanteElectronicos;
    }
   
    public Integer getIdReceptor() {
        return this.idReceptor;
    }
    
    public void setIdReceptor(Integer idReceptor) {
        this.idReceptor = idReceptor;
    }
    public String getRucReceptor() {
        return this.rucReceptor;
    }
    
    public void setRucReceptor(String rucReceptor) {
        this.rucReceptor = rucReceptor;
    }
    public String getRazonSocialReceptor() {
        return this.razonSocialReceptor;
    }
    
    public void setRazonSocialReceptor(String razonSocialReceptor) {
        this.razonSocialReceptor = razonSocialReceptor;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreoAdicional() {
        return this.correoAdicional;
    }
    
    public void setCorreoAdicional(String correoAdicional) {
        this.correoAdicional = correoAdicional;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getAsignacionComprobanteElectronicos() {
        return this.asignacionComprobanteElectronicos;
    }
    
    public void setAsignacionComprobanteElectronicos(Set asignacionComprobanteElectronicos) {
        this.asignacionComprobanteElectronicos = asignacionComprobanteElectronicos;
    }




}


