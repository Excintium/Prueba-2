/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cetecom
 */
public class Peliculas extends Contenidos implements ICostosMensualesStreamFlex {
    private int duracion;
    private double calificacion;

    public Peliculas() {
    }

    public Peliculas(int duracion, double calificacion, String idContenido, String recomendado) {
        super(idContenido, recomendado);
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getIdContenido() {
        return idContenido;
    }

    public void setIdContenido(String idContenido) {
        this.idContenido = idContenido;
    }

    public String getRecomendado() {
        return recomendado;
    }

    public void setRecomendado(String recomendado) {
        this.recomendado = recomendado;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "duracion=" + duracion + ", calificacion=" + calificacion + '}';
    }

    
    public double costoDeSuscripcion(){
        double costoMensual = COSTO_BASE_SUSCRIPCION;
        if(getCalificacion()>= 4.5){
            costoMensual = peliculas_sobre_4_5 * costoMensual;
        }
        return costoMensual;
    };

        
}
