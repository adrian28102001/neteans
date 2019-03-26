/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homeworkssss;

/**
 *
 * @author gherm
 */
public class test {
   public static void main(String[] args) {
       int a=10;
       int sum1,sum2,sum3,sum4;
   
    sum1 = a++ + a + a-- - a-- + ++a; // 10+11+11-10+10=32
    sum2 =a = ++a + a + --a - --a + a++; //11+11+10-10+10c=31
    sum3 = a-- + a + a++ - a++ + --a; //10+9+9-10+10 =28
    sum4 = --a + a + ++a - ++a + a--;// 9+9+10-10+10 =28
    
      
    
    
    
   
                System.out.println(sum4);
         }

  
    }
  

