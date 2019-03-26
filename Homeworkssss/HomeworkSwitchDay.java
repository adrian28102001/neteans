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
public class HomeworkSwitchDay {

    public static void main(String[] args) {

        System.out.println("Insert a week day");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        switch (day) {

            case ("Monday"):
                System.out.println("Monday we had lesson");
                break;
            case "Tuesday":
                System.out.println("Monday we had lesson");
                break;
            case "Wednesday":
                System.out.println("Monday and Wednesday we had lessons");
                break;
            case "Thursday":
                System.out.println("Monday and Wednesday we had lessons");
                break;
            case "Friday":
                System.out.println("Monday,Wednesday and Friday we had lessons");
                break;
                case "Saturday":
                System.out.println("Monday,Wednesday and Friday we had lessons");
                break;
                case "Sunday":
                System.out.println("Monday,Wednesday and Friday we had lessons");
                break;
            default:
                System.out.println("Alte zile");
        }
    }
}
