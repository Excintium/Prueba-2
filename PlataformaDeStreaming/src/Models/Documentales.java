/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cetecom
 */
public class Documentales extends Contenidos implements ICostosMensualesStreamFlex{
    private boolean educativo;
    private int duracion;

    public Documentales() {
    }

    public Documentales(boolean educativo, int duracion, String idContenido, String recomendado) {
        super(idContenido, recomendado);
        this.educativo = educativo;
        this.duracion = duracion;
    }

    public boolean isEducativo() {
        return educativo;
    }

    public void setEducativo(boolean educativo) {
        this.educativo = educativo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
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
        return "Documentales{" + "educativo=" + educativo + ", duracion=" + duracion + '}';
    }
    
    
    public double costoDeSuscripcion(){
                double costoMensual = COSTO_BASE_SUSCRIPCION;
        if(getDuracion()> 90){
            costoMensual = documentales_90_minutos * costoMensual;
        }
        return costoMensual;
    };

    
    
    
}
