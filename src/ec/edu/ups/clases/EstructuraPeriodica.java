/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.Date;

/**
 *
 * @author 59398
 */
public class EstructuraPeriodica {

    private String nombrePeriodico;
    private String ubicacion;
    private Date fecha;
   
    public void setNombrePeriodico(String nombrePeriodico) {
        this.nombrePeriodico = nombrePeriodico;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNombrePeriodico() {
        return this.nombrePeriodico;
    }
    
    public String getUbicacion(){
        return this.ubicacion;
    }

    public Date getFecha() {
        return this.fecha;
    }
}
