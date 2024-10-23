/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cetecom
 */
public class Series extends Contenidos implements ICostosMensualesStreamFlex{
    private int numeroDeTemporadas;
    private boolean finalizado;

    public Series() {
    }

    public Series(int numeroDeTemporadas, boolean finalizado, String idContenido, String recomendado) {
        super(idContenido, recomendado);
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.finalizado = finalizado;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
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
        return "Series{" + "numeroDeTemporadas=" + numeroDeTemporadas + ", finalizado=" + finalizado + '}';
    }
    
    

  
    public double costoDeSuscripcion(){
        double costoMensual = COSTO_BASE_SUSCRIPCION;
        if(getNumeroDeTemporadas()> 3 ){
            costoMensual = series_3_temporadas * costoMensual;
        }
        return costoMensual;
    };

    
}
