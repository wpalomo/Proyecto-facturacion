package com.egastos.modelo.ec;
// Generated 20/06/2017 21:43:07 by Hibernate Tools 4.3.1



/**
 * TarifasImpuesto generated by hbm2java
 */
public class TarifasImpuesto  implements java.io.Serializable {


     private Integer idtarifaImpuesto;
     private TipoImpuesto tipoImpuesto;
     private String codigoTarifaImpuesto;
     private String descripcionTarifaImpuesto;
     private String porcentajeTarifaImpuesto;
     private boolean variableTarifaImpuesto;

    public TarifasImpuesto() {
    }

    public TarifasImpuesto(TipoImpuesto tipoImpuesto, String codigoTarifaImpuesto, String descripcionTarifaImpuesto, String porcentajeTarifaImpuesto, boolean variableTarifaImpuesto) {
       this.tipoImpuesto = tipoImpuesto;
       this.codigoTarifaImpuesto = codigoTarifaImpuesto;
       this.descripcionTarifaImpuesto = descripcionTarifaImpuesto;
       this.porcentajeTarifaImpuesto = porcentajeTarifaImpuesto;
       this.variableTarifaImpuesto = variableTarifaImpuesto;
    }
   
    public Integer getIdtarifaImpuesto() {
        return this.idtarifaImpuesto;
    }
    
    public void setIdtarifaImpuesto(Integer idtarifaImpuesto) {
        this.idtarifaImpuesto = idtarifaImpuesto;
    }
    public TipoImpuesto getTipoImpuesto() {
        return this.tipoImpuesto;
    }
    
    public void setTipoImpuesto(TipoImpuesto tipoImpuesto) {
        this.tipoImpuesto = tipoImpuesto;
    }
    public String getCodigoTarifaImpuesto() {
        return this.codigoTarifaImpuesto;
    }
    
    public void setCodigoTarifaImpuesto(String codigoTarifaImpuesto) {
        this.codigoTarifaImpuesto = codigoTarifaImpuesto;
    }
    public String getDescripcionTarifaImpuesto() {
        return this.descripcionTarifaImpuesto;
    }
    
    public void setDescripcionTarifaImpuesto(String descripcionTarifaImpuesto) {
        this.descripcionTarifaImpuesto = descripcionTarifaImpuesto;
    }
    public String getPorcentajeTarifaImpuesto() {
        return this.porcentajeTarifaImpuesto;
    }
    
    public void setPorcentajeTarifaImpuesto(String porcentajeTarifaImpuesto) {
        this.porcentajeTarifaImpuesto = porcentajeTarifaImpuesto;
    }
    public boolean isVariableTarifaImpuesto() {
        return this.variableTarifaImpuesto;
    }
    
    public void setVariableTarifaImpuesto(boolean variableTarifaImpuesto) {
        this.variableTarifaImpuesto = variableTarifaImpuesto;
    }




}


