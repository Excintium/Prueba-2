/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Cetecom
 */
public abstract class Contenidos {
    String idContenido;
    String recomendado;

    public Contenidos() {
    }

    
    public Contenidos(String idContenido, String recomendado) {
        this.idContenido = idContenido;
        this.recomendado = recomendado;
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
        return "Contenidos{" + "idContenido=" + idContenido + ", recomendado=" + recomendado + '}';
    }
    
    public abstract double costoDeSuscripcion();
    
    
}
