/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
import java.util.Scanner;


public class MenuCola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cola<String> cola = new Cola<>();
        int opcion;
        
        do {
            System.out.println("\n=== MENU COLA ===");
            System.out.println("1. Insertar tarea");
            System.out.println("2. Quitar tarea");
            System.out.println("3. Ver frente");
            System.out.println("4. Ver tamano");
            System.out.println("5. Ver si está vacia");
            System.out.println("6. Salir");
            System.out.print("Seleccione opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch(opcion) {
                case 1:
                    System.out.print("Ingrese tarea: ");
                    String tarea = scanner.nextLine();
                    cola.insertar(tarea);
                    break;
                    
                case 2:
                    String tareaEjecutada = cola.quitar();
                    if (tareaEjecutada != null) {
                        System.out.println("Tarea ejecutada: " + tareaEjecutada);
                    }
                    break;
                    
                case 3:
                    String frente = cola.frente();
                    if (frente != null) {
                        System.out.println("Frente: " + frente);
                    }
                    break;
                    
                case 4:
                    System.out.println("Tamano: " + cola.getTamano());
                    break;
                    
                case 5:
                    System.out.println("¿Vacia? " + cola.colaVacia());
                    break;
                    
                case 6:
                    System.out.println("Saliendo...");
                    break;
                    
                default:
                    System.out.println("Opcion invalida");
            }
            
        } while(opcion != 6);
        
        scanner.close();
    }
}