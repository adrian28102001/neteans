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
public class Ex4_8OPERATIONS {
    
    
    public static void main(String[] args) {
      System.out.println("Introduceti doua valorili");
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      int suma = num1 + num2;
      int dif = num1 - num2;
      int produs = num1 * num2;
      int avarage=(num1+num2)/2;
      int reminder = num1 % num2;
      System.out.println("Suma ="+suma);
      System.out.println("Diferenta="+dif);
      System.out.println("Produsul="+produs);
      System.out.println("Avarage="+avarage);
      System.out.println("Reminder"+reminder);
        
    }
    
}
