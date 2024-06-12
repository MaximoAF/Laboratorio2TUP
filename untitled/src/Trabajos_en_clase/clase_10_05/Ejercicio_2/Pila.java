package Trabajos_en_clase.clase_10_05.Ejercicio_2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class Pila <T> {
    private ArrayList<T> elementos;

    // Método para verificar si la pila está vacía
    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    // Método para empujar un elemento a la pila
    public void push(T dato) {
        elementos.add(dato);
    }
    // Método para sacar un elemento de la pila
    public T pop() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return elementos.remove(elementos.size() - 1);
    }
    // Método para obtener el elemento en la cima de la pila
    public T peek() {
        if (estaVacia()) {
            throw new EmptyStackException();
        }
        return elementos.get(elementos.size() - 1);
    }
}
