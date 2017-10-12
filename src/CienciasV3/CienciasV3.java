/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CienciasV3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class CienciasV3 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList list = new ArrayList<>();
    static HashMap<Integer, Long> memo = new HashMap<>();

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        //Se ingresa el numero a permutar
        System.out.println("ingrese numero");
        String numero = read.next();
       
        long startTime = System.nanoTime();
        System.out.println("_________");
        
        //Calcula Cantidad de permutaciones
        long cantPer= cantidadPermutaciones(numero.length());
        System.out.println("Cantidad de Permutaciones: "+cantPer);
        
        //Calcula Permutaciones y valida permutaciones aceptadas
        //las permutaciones aceptadas las agrega al ArrayList lista
        permutation("", numero);

        System.out.println("________");
        
        //Imprime cantidad de soluciones
        System.out.println("Soluciones: " + list.size());

        long endTime = System.nanoTime() - startTime;
        System.out.println("_________");
        System.out.println("Tiempo de Ejecucion: " + endTime / 1e6 + " ms");
    }

     public static long cantidadPermutaciones(int n) {

        if (n < 2) {
            return 1;
        }
        
        if (memo.containsKey(n)) {
            return memo.get(n);
        } else {
            
            long a = n * cantidadPermutaciones(n - 1);
            memo.put(n, a);
            return a;
        }
    }
     
    public static void permutation(String prefix, String str) {
        int n = str.length();

        if (n == 0) {
           
            if (Long.parseLong(prefix) % 11 == 0) {
                if (prefix.charAt(0) != '0') {
                    if (!list.contains(String.valueOf(prefix))) {
                        list.add(prefix);
                    }
                }
            }

        } else {
            for (int i = 0; i < n; i++) {
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }

        }

    }
    
    

}
