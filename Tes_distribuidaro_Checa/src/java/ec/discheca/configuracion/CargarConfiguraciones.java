/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.discheca.configuracion;

import ec.discheca.dao.DAOConfiguracion;



public class CargarConfiguraciones {

    public void cargarConfiguraciones() throws Exception {
        HibernateSessionHandler hsh = new HibernateSessionHandler();
        DAOConfiguracion dao_configuracion = new DAOConfiguracion();

        Valores.VALOR_DIRECTORIO_CREACION_XMLS = dao_configuracion.obtenerConfiguracionPorNombre(Valores.NOMBRE_DIRECTORIO_CREACION_XMLS, Valores.AMBIENTE).getValorConfiguracion();
//        Valores.VALOR_RUC_EMISOR = dao_configuracion.obtenerConfiguracionPorNombre(Valores.NOMBRE_RUC_EMISOR, Valores.AMBIENTE).getValorConfiguracion();
        Valores.VALOR_DIRECTORIO_TEMPORAL_ARCHIVOS=dao_configuracion.obtenerConfiguracionPorNombre(Valores.NOMBRE_DIRECTORIO_TEMPORAL_ARCHIVOS, Valores.AMBIENTE).getValorConfiguracion();
        Valores.VALOR_RUC_EMISOR="1704206174001";
        hsh.close();
    }
}
