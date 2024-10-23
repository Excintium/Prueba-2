/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cetecom
 */
public class Usuarios implements ICostosMensualesStreamFlex{
    private String idusuario;
    private String nombre;
    private String contenidoConsumido;

    public Usuarios() {
    }

    public Usuarios(String idusuario, String nombre, String contenidoConsumido) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.contenidoConsumido = contenidoConsumido;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContenidoConsumido() {
        return contenidoConsumido;
    }

    public void setContenidoConsumido(String contenidoConsumido) {
        this.contenidoConsumido = contenidoConsumido;
    }
    
    private double consumoMensual(){
        double mensualidad = COSTO_BASE_SUSCRIPCION;
        if(getContenidoConsumido().equals("Peliculas")){
            mensualidad = COSTO_BASE_SUSCRIPCION * peliculas_sobre_4_5;
        }
        if(getContenidoConsumido().equals("Series")){
            mensualidad = COSTO_BASE_SUSCRIPCION * series_3_temporadas;
        }
        if(getContenidoConsumido().equals("Documentales")){
            mensualidad = COSTO_BASE_SUSCRIPCION * documentales_90_minutos;
        }
        return mensualidad;
    }   
    
}
