/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class Nodo<T> {
    private T data;
    private Nodo<T> siguiente;

    public Nodo(T data) {
        this.data = data;
        this.siguiente = null;
    }

    public T getDato() {
        return data;
    }

    public void setDato(T data) {
        this.data = data;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}