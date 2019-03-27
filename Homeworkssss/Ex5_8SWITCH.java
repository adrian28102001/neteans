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
public class Ex5_8SWITCH {
    public static void main(String[] args) {

        System.out.println("insert your numbers");
        Scanner sc = new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        System.out.println("Select your operation");
        String semn =sc.next();
        switch(semn){
            case "+" : System.out.println(num1+num2);
            break;
            case "-" : System.out.println(num1-num2);
            break;
            case "*" : System.out.println(num1*num2);
            break;
            case "/" : System.out.println(num1/num2);
            break;
            default:System.out.println("Please try again ");
        }
}
}
