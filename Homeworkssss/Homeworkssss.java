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
public class Homeworkssss{
    
    public static void main(String[] args) {
    System.out.println("Introduceti nr de minute");
    
    Scanner sc = new Scanner(System.in);
    int minute= sc.nextInt();
    int luni= minute*1000/10080/4345;
    int ani=luni/12;
    System.out.println(" in  "+ minute +" minute se contin  "+luni+ " luni si " +ani+ "ani");
    
}
}