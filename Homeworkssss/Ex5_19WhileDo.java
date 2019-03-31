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
public class Ex5_19WhileDo {
      public static void main(String[] args) {
       System.out.println("exercitiu 5.19");
        
        Scanner sc = new Scanner(System.in);
       int numere = 0;
       int suma = 0;
       boolean egalzero=false;
  while (!egalzero){
          System.out.println("Introduceti numarele");
          int number=sc.nextInt();
          suma= suma+number;
          int numeree=numere++;
          if(number==0){
              egalzero=true;
              System.out.println("ati introdus"+ numere);
              System.out.println("suma acestor numere este="+suma);
    
    
    
      }
  
   
    
    }
      }
}