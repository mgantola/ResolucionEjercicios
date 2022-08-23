package com.company;

public class Main {

    public static void main(String[] args){

        /* Primer ejercicio */
        System.out.println("La suma de los valores es: " + suma(1, 2, 3));

        /* Segundo ejercicio */
        Coche miCoche = new Coche();

        miCoche.agregarPuerta();
        System.out.println("El numero de puertas es: " + miCoche.numeroDePuertas);
    }

    public static int suma(int primerValor, int segundoValor, int tercerValor){
        return primerValor + segundoValor + tercerValor;
    }
}
