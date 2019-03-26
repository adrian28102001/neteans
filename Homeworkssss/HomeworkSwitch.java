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
public class HomeworkSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a Number");
        int x = sc.nextInt();

        switch (x) {
            case (1):
                System.out.println("It s Monday");
                break;
            case (2):
                System.out.println("It s Tuesday");
                break;
            case (3):
                System.out.println("It s Wednesday");
                break;
            case (4):
                System.out.println("It s Thursday");
                break;
            case (5):
                System.out.println("It s Friday");
                break;
            case (6):
                System.out.println("It s Saturday");
                break;
            case (7):
                System.out.println("It s Sunday");
                break;
            default:
                System.out.println("There are only 7 days in a week");

        }

    }
}
