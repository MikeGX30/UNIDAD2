/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Cola<T> {
    private Nodo<T> cabeza;
    private Nodo<T> cola;
    private int tamano;

    public Cola() {
        this.cabeza = null;
        this.cola = null;
        this.tamano = 0;
    }

    public boolean colaVacia() {
        return cabeza == null;
    }

    public void insertar(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento);

        if (colaVacia()) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
        } else {
            this.cola.setSiguiente(nuevoNodo);
            this.cola = nuevoNodo;
        }
        tamano++;
        System.out.println("-> Insertado: " + elemento);
    }

    public T quitar() {
        if (colaVacia()) {
            System.out.println("Error: La cola está vacía.");
            return null;
        }

        T datoQuitado = this.cabeza.getDato();
        this.cabeza = this.cabeza.getSiguiente();

        if (this.cabeza == null) {
            this.cola = null;
        }
        tamano--;
        return datoQuitado;
    }

    public T frente() {
        if (colaVacia()) {
            System.out.println("Error: La cola está vacía");
            return null;
        }
        return this.cabeza.getDato();
    }

    public int getTamano() {
        return tamano;
    }
}