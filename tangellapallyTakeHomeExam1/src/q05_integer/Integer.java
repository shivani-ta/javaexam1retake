/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q05_integer;

import java.util.Scanner;
/**
 *
 * @author Shivani tangellapally
 */
public class Integer {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int comb= 0;

        for(int i=1;i<=7;i++)
        {
            for(int j=i+1;j<=7;j++)
            {

                System.out.println(i+" "+j);

               comb++; 
            } 
        } 
        System.out.println("The total number of all combinations is " +comb);        
    } } 