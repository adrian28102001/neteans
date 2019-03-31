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
 *///sum array and avarage
public class array6_3_1_2_1 { public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int array[];
        array=new int[3];
        int suma=0;
       double avarage=1;
        
     for (int i=0;i<array.length;i++){
         array[i] =sc.nextInt();
         System.out.println("Element at index " + i + ": " + array[i]);
         suma=suma+array[i];
         avarage = suma/array.length;
     }
        
       System.out.println(Arrays.toString(array));
        System.out.println("Suma este= "+ suma);
            System.out.println("Impartirea este="+avarage);
          
       

          
            }
     
        }
    

