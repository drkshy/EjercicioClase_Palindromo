package com.pperezm;

import java.util.*;

/*
@author Pablo Arturo Pérez Mata
@email pablo.arturo.perez@gmail.com
@description Clase evaludadora de palindromos
*/

public class Main {
    public static void main(String[] args) {
        String cadena ="somos";
        ArrayDeque <Character> pila = new ArrayDeque<>();
        boolean esPalindromo = true;
	// write your code here
        for(int i=0; i< cadena.length();i++){
            pila.push(cadena.charAt(i));
           //System.out.println(cadena.charAt(i));

        }

        for(int j=0; j< cadena.length();j++) {
            cadena.charAt(j);
            //System.out.println("");
            //System.out.println(cadena.charAt(j));
            //System.out.println(j);

            if (cadena.charAt(j) == pila.pop()) {
                continue;

            } else {
                esPalindromo = false;
                break;
            }

        }

        String mensaje = esPalindromo?"Si es palindromo":"No es palindromo";
        System.out.println(cadena);
            System.out.println(mensaje);

        }
    }


