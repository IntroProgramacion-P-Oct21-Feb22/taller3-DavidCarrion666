/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio08;

/**
 *
 * @author Usuario
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("-------Solución a problema------------------");
        
         
        int val1 = 10;
        int val2 = 9;
        int val3 = 20;
        int val4 = 500;
        int val5 = 2;
        int val6 = 3;
        int val7 = 200;
        int val8 = 50;
        int val9 = 51;
        
        boolean resultado = (val1 * val2) + val3 - (val4 / val5) + 
                (Math.pow (val6, val5)) >= val7 || 
                (val8 >= (val8 - val8 + val9));
       
        System.out.println(resultado);

    }
    
}
