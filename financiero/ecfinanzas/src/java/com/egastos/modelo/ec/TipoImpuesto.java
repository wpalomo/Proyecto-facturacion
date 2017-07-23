package com.egastos.modelo.ec;
// Generated 20/06/2017 21:43:07 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * TipoImpuesto generated by hbm2java
 */
public class TipoImpuesto  implements java.io.Serializable {


     private Integer idTipoImpuesto;
     private String impuesto;
     private Set tarifasImpuestos = new HashSet(0);

    public TipoImpuesto() {
    }

	
    public TipoImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }
    public TipoImpuesto(String impuesto, Set tarifasImpuestos) {
       this.impuesto = impuesto;
       this.tarifasImpuestos = tarifasImpuestos;
    }
   
    public Integer getIdTipoImpuesto() {
        return this.idTipoImpuesto;
    }
    
    public void setIdTipoImpuesto(Integer idTipoImpuesto) {
        this.idTipoImpuesto = idTipoImpuesto;
    }
    public String getImpuesto() {
        return this.impuesto;
    }
    
    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }
    public Set getTarifasImpuestos() {
        return this.tarifasImpuestos;
    }
    
    public void setTarifasImpuestos(Set tarifasImpuestos) {
        this.tarifasImpuestos = tarifasImpuestos;
    }




}


