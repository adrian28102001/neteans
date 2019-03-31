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
 *///sum array and avarage bidimensional
public class array6_3_2_3 {

    
 

    public static void main(String[] args) {
        int sum = 0;
        double avarage=0;
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

            }
        }
        System.out.println(Arrays.toString(matrix));
        for (int i = 0; i < raws; i++) {
            for (int j = 0; j < cols; j++) {

                sum = sum + matrix[i][j];
                avarage=sum/matrix.length;
            }

            System.out.println("Suma este egala cu =" + sum);
             System.out.println("Avarage este egala cu =" + avarage);

        }

    }

}
