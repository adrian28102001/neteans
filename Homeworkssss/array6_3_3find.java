/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeworkssss;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.util.Scanner;

/**
 *
 * @author gherm
 */
public class array6_3_3find {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many raws do you want ?");
        int cols = sc.nextInt();
        System.out.println("How many cols do you want ?");
        int raws = sc.nextInt();

        int matrix[][] = new int[raws][cols];
        for (int i = 0; i < raws; i++) {
            System.out.println(i + 1 + "raws");
            for (int j = 0; j < cols; j++) {
                System.out.println(j + 1 + "cols");
                matrix[i][j] = sc.nextInt();
               System.out.println(matrix[i][j]);
            }
        }
         
        
        System.out.println("introduceti elementul pe care il cautati");
        int n = sc.nextInt();
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {
                int rezultat = 0;
                if (matrix[i][j] == n) {
                    rezultat = rezultat - 1;
                     System.out.println("Element at index " + i +rezultat + ": " + matrix[i]);
                   
                    
                }
            }
        }
        System.out.println("elementul este="+n);
    }
}
