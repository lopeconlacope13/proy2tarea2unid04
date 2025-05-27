package com.ejemplos.debugger;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que proporciona ejemplos de depuración en Java.
 */
public class DebuggingExample {
	
	//Modificado por: ALP (Alvaro Lopez Perez)
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param args Argumentos de línea de comandos.
     */
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Diana");
        names.add("Juan");

        DebuggingExample example = new DebuggingExample();
        example.printNames(names);
        
        int totalLetters = example.calculateTotalLetters(names);
        System.out.println("Total de letras: " + totalLetters);

        double averageLetters = example.calculateAverageLetters(names, totalLetters);
        System.out.println("Promedio de letras por nombre: " + averageLetters);

        example.addName(names, "Edward");
        example.removeName(names, "Alice");
        example.printNames(names);
    }

    /**
     * Imprime los nombres en la lista proporcionada.
     * 
     * @param names Lista de nombres a imprimir.
     */
    public void printNames(List<String> names) {
        for (String name : names) {
            System.out.println(name); // Use Step Over here
        }
    }

    /**
     * Agrega un nombre a la lista de nombres.
     * 
     * @param names Lista de nombres.
     * @param nameToAdd Nombre a agregar.
     */
    public void addName(List<String> names, String nameToAdd) {
        names.add(nameToAdd); // Use Step Into here
        System.out.println("Added name: " + nameToAdd);
    }

    /**
     * Elimina un nombre de la lista de nombres.
     * 
     * @param names Lista de nombres.
     * @param nameToRemove Nombre a eliminar.
     * @return true si el nombre fue eliminado, false en caso contrario.
     */
    public boolean removeName(List<String> names, String nameToRemove) {
        boolean result = names.remove(nameToRemove); // Set a breakpoint and use Step Return here
        System.out.println("Removed name: " + nameToRemove);
        return result;
    }

    /**
     * Calcula el total de letras de todos los nombres en la lista.
     * 
     * @param names Lista de nombres.
     * @return Total de letras de todos los nombres.
     */
    public int calculateTotalLetters(List<String> names) {
        int total = 0;
        for (String name : names) {
            total += name.length(); // Use Step Into here and check the 'total' variable
        }
        return total;
    }

    /**
     * Calcula el promedio de letras por nombre en la lista.
     * 
     * @param names Lista de nombres.
     * @param totalLetters Total de letras de todos los nombres.
     * @return Promedio de letras por nombre.
     */
    public double calculateAverageLetters(List<String> names, int totalLetters) {
        return names.isEmpty() ? 0 : (double) totalLetters / names.size(); // Set a breakpoint and use 'Evaluate Expression' here
    }
}
