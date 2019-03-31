/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeworkssss;

import java.util.Scanner;

public class Ex5_1FORELSE {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give first number");
        int x = sc.nextInt();
        System.out.println("Give second number");
        int y = sc.nextInt();

        if (x > y) {
            System.out.println("First numer is bigger =" + x);
        } else {
            System.out.println("Secound number is bigger =" + y);
        }
    }

}
