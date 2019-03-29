/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.pruebas;

import ec.edu.ups.clases.RedSocial;
import ec.edu.ups.clases.Seccion;
import ec.edu.ups.clases.Multimedia;
import ec.edu.ups.clases.EstructuraPeriodica;
import ec.edu.ups.clases.Noticia;
import java.util.Date;

/**
 *
 * @author 59398
 */
public class Prueba {

    public static void main(String[] args) {
        RedSocial facebook = new RedSocial();
        facebook.setCodigo(1);
        facebook.setNombre("FACEBOOK");
        facebook.setUrl("www.facebook.com");

        int cod = facebook.getCodigo();
        System.out.println("codigo: " + cod);
        System.out.println("Prueba Colaborador Piña");
        String nom = facebook.getNombre();
        System.out.println("nombre: " + nom);

        String ur = facebook.getUrl();
        System.out.println("url: " + ur);

        System.out.println("----------------------");

        Seccion deportes = new Seccion();
        deportes.setNombre("DEPORTES");
        deportes.setTituloDeporte("bmx free style");

        String nomb = deportes.getNombre();
        System.out.println("seccion: " + nomb);

        String titdep = deportes.getTituloDeporte();
        System.out.println("deporte: " + titdep);

        System.out.println("----------------------");

        Multimedia audio = new Multimedia();
        audio.setTipoMultimedia("AUDIO");
       

        String tipMul = audio.getTipoMultimedia();
        System.out.println("tipo multimedia: " + tipMul);

        double form = audio.getFormato();
        System.out.println("formato: " + form);

        int tamByt = audio.getTamanoBytes();
        System.out.println("tamano Bytes: " + tamByt);

        System.out.println("----------------------");

        EstructuraPeriodica portada = new EstructuraPeriodica();
        portada.setNombrePeriodico("EL EXTRA");
        portada.setUbicacion("Parque Industrial");
        
        String nombPer = portada.getNombrePeriodico();
        System.out.println("nombre periodico: " + nombPer);
        
        String ubi = portada.getUbicacion();
        System.out.println("ubicacion: "+ ubi);
        
        Date fec = portada.getFecha();
        System.out.println("fecha: " + fec);

        System.out.println("----------------------");

        Noticia noticial = new Noticia();
        noticial.setTitulo("Ecuador se impulso en el open de BMX");
        noticial.setAutor("Wilson Goyes");
        noticial.setContenido("");

        String titul = noticial.getTitulo();
        System.out.println("titulo de la noticia: " + titul);

        String aut = noticial.getAutor();
        System.out.println("autor: " + aut);

        String cont = noticial.getContenido();
        System.out.println("contenido: " + cont);

        System.out.println("----------------------");
    }
}
