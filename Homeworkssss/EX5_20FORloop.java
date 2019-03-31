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
public class EX5_20FORloop {
     public static void main(String[] args){
         System.out.println("Insert a number");
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        
        for (; number>1;--number){
        System.out.println(number-1);
    }
}
}
