/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio07;

/**
 *
 * @author SALAA
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("-------Solución a problema------------------");
       
        
        int var1 = 81;
        int var2 = 9;
        int var3 = 3;
        int var4 = 10;
        int var5 = 1;
        int var6 = 100;
        int var7 = 25;
        
        boolean resultado = ((Math.sqrt(var1) + var2) / var3) == var2 ||
                (var4 > var5) && var6 / var7 > Math.sqrt (var4);
        
        
        System.out.println(resultado);
        
        
                

        
    }
    
}
