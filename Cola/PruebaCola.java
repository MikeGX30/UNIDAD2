/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class PruebaCola {
    public static void main(String[] args) {
        // Crear un objeto cola
        Cola<String> colaTareas = new Cola<>();
        
        System.out.println("=== AGREGANDO TAREAS ===");
        // Agregar las tareas
        colaTareas.insertar("Preparar café");
        colaTareas.insertar("Revisar emails");
        colaTareas.insertar("Iniciar proyecto");
        
        System.out.println("\n=== CONSULTAS ===");
        // Solicitar el tamaño
        System.out.println("Tamaño de la cola: " + colaTareas.getTamano());
        
        // Consultar Frente
        System.out.println("Frente de la cola: " + colaTareas.frente());
        
        System.out.println("\n=== EJECUTANDO TAREAS ===");
        // Quitar tarea 1 y despliega tarea ejecutada
        String tarea1 = colaTareas.quitar();
        System.out.println("Tarea ejecutada: " + tarea1);
        
        // Quitar tarea 2 y despliega tarea ejecutada
        String tarea2 = colaTareas.quitar();
        System.out.println("Tarea ejecutada: " + tarea2);
        
        System.out.println("\n=== ESTADO FINAL ===");
        // Muestra el estado final de la Cola
        System.out.println("Tamaño final: " + colaTareas.getTamano());
        System.out.println("Frente final: " + colaTareas.frente());
        System.out.println("¿Cola vacía? " + colaTareas.colaVacia());
    }
}
