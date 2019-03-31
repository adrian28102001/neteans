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
public class BIdiminsionalSum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[];
        array = new int[5];
        int suma = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
           suma=suma+array[i];
           
           
           
        }
 System.out.println("Suma tabelului ="+ suma);
    }
}
    

