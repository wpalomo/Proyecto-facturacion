package ec.discheca.modelo;
// Generated May 8, 2016 10:10:06 PM by Hibernate Tools 3.6.0



/**
 * Configuracion generated by hbm2java
 */
public class Configuracion  implements java.io.Serializable {


     private Integer idConfiguracion;
     private String nombreConfiguracion;
     private String valorConfiguracion;
     private String ambienteConfiguracion;

    public Configuracion() {
    }

    public Configuracion(String nombreConfiguracion, String valorConfiguracion, String ambienteConfiguracion) {
       this.nombreConfiguracion = nombreConfiguracion;
       this.valorConfiguracion = valorConfiguracion;
       this.ambienteConfiguracion = ambienteConfiguracion;
    }
   
    public Integer getIdConfiguracion() {
        return this.idConfiguracion;
    }
    
    public void setIdConfiguracion(Integer idConfiguracion) {
        this.idConfiguracion = idConfiguracion;
    }
    public String getNombreConfiguracion() {
        return this.nombreConfiguracion;
    }
    
    public void setNombreConfiguracion(String nombreConfiguracion) {
        this.nombreConfiguracion = nombreConfiguracion;
    }
    public String getValorConfiguracion() {
        return this.valorConfiguracion;
    }
    
    public void setValorConfiguracion(String valorConfiguracion) {
        this.valorConfiguracion = valorConfiguracion;
    }
    public String getAmbienteConfiguracion() {
        return this.ambienteConfiguracion;
    }
    
    public void setAmbienteConfiguracion(String ambienteConfiguracion) {
        this.ambienteConfiguracion = ambienteConfiguracion;
    }




}


