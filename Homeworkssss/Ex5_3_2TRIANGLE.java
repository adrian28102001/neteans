package Homeworkssss;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author gherm
 */
public class Ex5_3_2TRIANGLE {
    public static void main(String[] args){
        
        
       Scanner sc =new Scanner(System.in);
        
        System.out.println("Give the lengh of first cathetus");
        int x = sc.nextInt();
        System.out.println("Give the lengh of the secound cathetus");
        int y = sc.nextInt();
        System.out.println("Give the lengh of the hypotenuse");
        int z = sc.nextInt();
        
       
       
         if ((x == y) && (x == z) && (y == z)){
        System.out.println("triangle is equilateral ");
        } else if  ((x != y) && (x != z) && (y != z)){
        System.out.println("triangle is scalen");
        } else if ((x==y) && (x != z) && (y != z)){
            System.out.println("triangle is isoscel");

        
        }
    }
}
     
    
    
