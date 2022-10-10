/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buque.notas;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class BuqueNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int n;
        int suma = 0;
        System.out.println("Digite el fin del buque:");
        n = entrada.nextInt();
        for(int i = 2; i < n; i++){
            if(i % 2 == 0){
                System.out.println(suma = suma + i);
            }
        }
    }
    
}
