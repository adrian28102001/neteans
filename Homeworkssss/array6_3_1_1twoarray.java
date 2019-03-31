/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeworkssss;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author gherm
 */
public class array6_3_1_1twoarray{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        array = new int[5];
        int suma = 0;
  
        System.out.println("Dati valori pentru primul tabel");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
           suma=suma+array[i];
        }
    
        
         System.out.println(Arrays.toString(array));
        System.out.println("al doilea tablou");
        
        int sumaa = 0;
        int[] aray= new int[]{1,2,3,4,5};
        for (int n=0;n<array.length;n++){
            aray[n] = sc.nextInt();
           
          sumaa=sumaa+aray[n];
       
        
        } System.out.println(Arrays.toString(aray));
        System.out.println("Suma primului ="+ suma);
 System.out.println("Suma celui de al doilea tabel ="+ sumaa);
    
    }
}
