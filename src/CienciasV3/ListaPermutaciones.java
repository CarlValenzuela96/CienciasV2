/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CienciasV3;

import java.util.ArrayList;

/**
 *
 * @author Carlos
 */
public class ListaPermutaciones {

    private ArrayList list = new ArrayList<>();
    private String numero;
   
    public ListaPermutaciones(String numero){
        this.numero= numero;
    }
    
    
    public void cantidadPermutaciones(){
       long nPer=1;
        for (int i = 1; i <= this.numero.length(); i++) {
            nPer*=i;
        }
        System.out.println("Numero Permutaciones: "+nPer);
    }
   
    
    public void permutation(String prefix, String str) {
        int n = str.length();
        
        if (n == 0) {
            System.out.println(prefix);
            
            if (Long.parseLong(prefix) % 11 == 0) {
                if (prefix.charAt(0) != '0') {
                    if (!this.list.contains(String.valueOf(prefix))) {
                        this.list.add(prefix);
                    }
                }
            }

        } else {
            for (int i = 0; i < n; i++) {
               // System.out.println(prefix +" "+ str.charAt(i)+"\t"+str.substring(0, i) +" "+ str.substring(i + 1, n));
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
            }

        }

    }

    public ArrayList getList() {
        return this.list;
    }

    public void setList(ArrayList list) {
        this.list = list;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
}
