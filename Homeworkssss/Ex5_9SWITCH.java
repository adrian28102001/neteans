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
public class Ex5_9SWITCH {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your mark");
        int mark = sc.nextInt();
        if (mark < 0) {
            System.out.println("Error"); } else{  
            switch (mark) {
                case (10):
                    System.out.println("I am proud of you");
                    break;
                case (9):
                    System.out.println("I am proud of you");
                    break;
                case (8):
                    System.out.println("Very good");
                    break;
                case (7):
                    System.out.println("Very good");
                    break;
                case (6):
                    System.out.println("Good");
                    break;
                case (5):
                    System.out.println("Aproved");
                    break;
                case (4):
                    System.out.println("Fail");
                    break;
                case (3):
                    System.out.println("Fail");
                    break;
                case (2):
                    System.out.println("Fail");
                    break;
                case (1):
                    System.out.println("Fail");
                    break;
                default:
                    System.out.println("Fail");

            }
        }

    }
}
