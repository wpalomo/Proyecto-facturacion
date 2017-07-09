package ec.discheca.modelo;
// Generated May 8, 2016 10:10:06 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * TipoComprobanteElectronico generated by hbm2java
 */
public class TipoComprobanteElectronico  implements java.io.Serializable {


     private Integer idTipoComprobanteElectronico;
     private String codigoTipoComprobanteElectronico;
     private String nombreTipoComprobanteElectronico;
     private Set comprobanteElectronicos = new HashSet(0);

    public TipoComprobanteElectronico() {
    }

	
    public TipoComprobanteElectronico(String codigoTipoComprobanteElectronico, String nombreTipoComprobanteElectronico) {
        this.codigoTipoComprobanteElectronico = codigoTipoComprobanteElectronico;
        this.nombreTipoComprobanteElectronico = nombreTipoComprobanteElectronico;
    }
    public TipoComprobanteElectronico(String codigoTipoComprobanteElectronico, String nombreTipoComprobanteElectronico, Set comprobanteElectronicos) {
       this.codigoTipoComprobanteElectronico = codigoTipoComprobanteElectronico;
       this.nombreTipoComprobanteElectronico = nombreTipoComprobanteElectronico;
       this.comprobanteElectronicos = comprobanteElectronicos;
    }
   
    public Integer getIdTipoComprobanteElectronico() {
        return this.idTipoComprobanteElectronico;
    }
    
    public void setIdTipoComprobanteElectronico(Integer idTipoComprobanteElectronico) {
        this.idTipoComprobanteElectronico = idTipoComprobanteElectronico;
    }
    public String getCodigoTipoComprobanteElectronico() {
        return this.codigoTipoComprobanteElectronico;
    }
    
    public void setCodigoTipoComprobanteElectronico(String codigoTipoComprobanteElectronico) {
        this.codigoTipoComprobanteElectronico = codigoTipoComprobanteElectronico;
    }
    public String getNombreTipoComprobanteElectronico() {
        return this.nombreTipoComprobanteElectronico;
    }
    
    public void setNombreTipoComprobanteElectronico(String nombreTipoComprobanteElectronico) {
        this.nombreTipoComprobanteElectronico = nombreTipoComprobanteElectronico;
    }
    public Set getComprobanteElectronicos() {
        return this.comprobanteElectronicos;
    }
    
    public void setComprobanteElectronicos(Set comprobanteElectronicos) {
        this.comprobanteElectronicos = comprobanteElectronicos;
    }




}

