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
public class ComparingNumbers {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int x = sc.nextInt();
        System.out.println("Number one=" +x);
        int y = sc.nextInt();
        System.out.println("Number two=" +y);
        int z = sc.nextInt();
        System.out.println("Number three=" +z);
      
        if ((x<y) && (x<z)) {
            System.out.println("Number one is smaller than number two and three=" +x);
            
        }else if ((y<x) && (y<z)){
            System.out.println("Number two is smaller than number one and three=" +y);
        }else if ((z<x) && (z<y)){
            System.out.println("Number three is smaller than number one and two =" +z);
        }
   
        
    
    }
    }
