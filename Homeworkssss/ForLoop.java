/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeworkssss;

import java.util.Scanner;

/**
 *
 * @author gherm
 */
public class ForLoop {
  
     public static void main(String[] args) {
       System.out.println("exercitiu 5.12");
        System.out.println("Introduceti numarul ");
        Scanner sc = new Scanner(System.in);
          
          
     int userInput=-1;
     int counter=0;
     int sum=0;
          
     for(; userInput !=0;){
         System.out.println("Introduceti numarul ");
          userInput = sc.nextInt();
         counter++;
         sum=sum+userInput;
         System.out.println("Nr de numere introduse ="+ counter);
              
         }
     System.out.println("suma"+ sum);
     }
     
     
     }
    

