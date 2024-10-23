/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class RegistroAuxiliar {
    private List<Usuarios> listaUsuarios = new ArrayList<>();
    private List<Contenidos> listaContenidos = new ArrayList<>();
    
    
    public void validarContenido(Scanner scanner){
        
        System.out.println("Ingresa el Id para validar si ya existe en sistema: ");
        String nuevoID = scanner.nextLine();
        for(Contenidos contenidos : listaContenidos){
            if(nuevoID .equals(contenidos.getIdContenido())){
                System.out.println("El contenido ya existe en el sistema!!!"); 
            }
            else{
                System.out.println("EL id esta disponible!");
            }
        }
    }
    
    public void listarContenido(){
        System.out.println("Lista de contenido disponible");
        for(Contenidos contenido : listaContenidos){
            System.out.println(contenido.toString());
        }
    }
    
    public void listarUsuarios(){
        System.out.println("Lista de usuarios y su consumo: ");
        for(Usuarios usuario : listaUsuarios){
            System.out.println(usuario.toString());
        }
    }
    
    public void agregarContenido(Scanner scanner){
        
        System.out.println("Ingrese el ID del contenido");
        String idNuevoContenido = scanner.nextLine();
        System.out.println("¿Es contenido recomendable?");
        String nuevoRecomendado = scanner.nextLine();
        System.out.println("que tipo de contenido es?");
        System.out.println("1.-Pelicula");
        System.out.println("2.- Serie");
        System.out.println("3.- Documental");
        System.out.println("Para volver al menu principal pulsa 9");
        int tipo = scanner.nextInt();
            if(tipo == 1){
            System.out.println("Ingrese duracion: ");
            int duracion = scanner.nextInt();
            System.out.println("Calificacion: ");
            double calificacion = scanner.nextDouble();
            Peliculas nuevaPelicula = new Peliculas(duracion, calificacion, idNuevoContenido, nuevoRecomendado);
            listaContenidos.add(nuevaPelicula);
            System.out.println("Contenido agregado!!");

        }
        if(tipo == 2){
            System.out.println("Ingrese el numero de temporadas:");
            int temporadas = scanner.nextInt();
            System.out.println("¿Esta finalizada?(true/false)");
            boolean finalizado = scanner.nextBoolean();
            Series nuevaserie = new Series(temporadas, finalizado, idNuevoContenido, nuevoRecomendado);
            listaContenidos.add(nuevaserie);
            System.out.println("Contenido agregado!!");
        }
        if(tipo == 3){
            System.out.println("¿Es contenido educativo?(true/false)");
            boolean educativo = scanner.nextBoolean();
            System.out.println("Minutos de duracion: ");
            int duracion = scanner.nextInt();
            Documentales nuevodocumental = new Documentales(educativo, duracion, idNuevoContenido, nuevoRecomendado);
            listaContenidos.add(nuevodocumental);
            System.out.println("Contenido agregado!!");
        }
            System.out.println("Volviendo al menu principal");
     
        }
       
    

    public void agregarUsuario(Scanner scanner){
        System.out.println("Ingresa el id del usuario: ");
        String idusuario = scanner.nextLine();
        System.out.println("ingresa el nombre del usuario: ");
        String nombre = scanner.nextLine();
        System.out.println("que contienido prefieres ver?: ");
        String contenidoPreferido = scanner.nextLine();
        
        Usuarios nuevoUsuario = new Usuarios(idusuario, nombre, contenidoPreferido);
        listaUsuarios.add(nuevoUsuario);
    }
    public void mostrarUsuario(){
        System.out.println("UsuariosRegistrados");
        for(Usuarios usuario : listaUsuarios){
            System.out.println(usuario.toString());
        }
    }
}   

