/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plataformadestreaming;

import Models.RegistroAuxiliar;
import java.util.Scanner;

        
/**
 *
 * @author Cetecom
 */
public class PlataformaDeStreaming {
     static RegistroAuxiliar  registro = new RegistroAuxiliar();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int opcion = 0;
        while (opcion != 6) { // Cambiado para que se salga con la opción 6
            System.out.println("1.- Agregar contenido");
            System.out.println("2.- Validar un contenido");
            System.out.println("3.- Listar contenido");
            System.out.println("4.- Agregar usuario");
            System.out.println("5.- Mostrar usuario");
            System.out.println("6.- Salir");
            System.out.print("Seleccione una opcion: ");

            if (scanner.hasNextInt()) { // Comprobar si la entrada es un entero
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        registro.agregarContenido(scanner);
                        break;
                    case 2:
                        registro.validarContenido(scanner);
                        break;
                    case 3:
                        registro.listarContenido();
                        break;
                    case 4:
                        registro.agregarUsuario(scanner);
                        break;
                    case 5:
                        registro.mostrarUsuario();
                        break;
                    case 6:
                        System.out.println("Saliendo del sistema!!");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.next(); // Limpiar el buffer
            }
        }

        scanner.close(); // Cerrar el Scanner
    }
}
    
