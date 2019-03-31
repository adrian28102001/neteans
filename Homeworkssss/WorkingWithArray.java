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
public class WorkingWithArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int array[];
        array=new int[3];
        
     for (int i=0;i<array.length;i++){
         array[i] =sc.nextInt();
        
     }
        
       System.out.println(Arrays.toString(array));
        System.out.println("al doilea tablou");
        int[] aray= new int[3];
      
        for (int n=0;n<array.length;n++){ 
            aray[n] =sc.nextInt();
            
       
        }
         System.out.println(Arrays.toString(aray));
    }
}
