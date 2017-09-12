/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CienciasV3;

import java.util.Scanner;

/**
 *
 * @author Carlos
 */
public class CienciasV3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
       
        
        System.out.println("ingrese numero");
        String numero= leer.next();
        System.out.println("________________");
        ListaPermutaciones a = new ListaPermutaciones(numero);
        a.cantidadPermutaciones();
        System.out.println("________________");
        long startTime = System.nanoTime();
        
        a.permutation("", numero); 
       
        System.out.println("________");
        System.out.println("Soluciones: "+a.getList().size());
        
        long endTime = System.nanoTime() - startTime;
        System.out.println("_________");
        System.out.println("Tiempo de Ejecucion: "+endTime/1e6 + " ms");
    }
    

}
