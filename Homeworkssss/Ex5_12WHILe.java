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
public class Ex5_12WHILe {
    
     public static void main(String[] args) {
       System.out.println("exercitiu 5.12");
        System.out.println("Introduceti numarul ");
        Scanner sc = new Scanner(System.in);
       int counter = 0;
       int sum = 0;
       int userInput=-1;
       
       
       
       
       do{
       System.out.println("Enter a number");
           userInput = sc.nextInt();
        sum += userInput;
       counter++; }
       while(userInput >0);
        
         
           
               System.out.println("Amount of entered numbers:" + counter);
               System.out.println("Sum is: " +sum);
       }
       }


       
       
    
