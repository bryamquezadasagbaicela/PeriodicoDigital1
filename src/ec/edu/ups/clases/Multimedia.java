/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author 59398
 */
public class Multimedia {
    private String tipoMultimedia;
    private double formato;
    private int tamanoBytes;
    private String ubicaciones;
    private byte [] archivo;
    
         
     public void setTipoMultimedia(String tipoMultimedia){
        this.tipoMultimedia = tipoMultimedia;
    }
     
    public void setFormato(double formato){
        this.formato = formato;
    }
    
     public void setTamanoBytes(int tamanoBytes){
        this.tamanoBytes = tamanoBytes;
    }
     
     public String getTipoMultimedia(){
         return this.tipoMultimedia;
     }
     
     public double getFormato(){
         return this.formato;
     }
     
     public int getTamanoBytes(){
         return this.tamanoBytes;
     }
     
     

}
