/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q04_SSN;

import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class SSN {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    private static Scanner scan = new Scanner(System.in);
    private static String SSN;

    public static void main(String[] Args) {

        System.out.print("Enter a SSN: ");//asking the user to enter the ssn
        SSN = scan.next();

        boolean isValid = true;//here we  checking whether input is valid or not

        for (int i = 0; i < SSN.length(); i++) {
            //
            if (i == 3 || i == 6) {
                if (SSN.charAt(i) != '-') {
                    isValid = false;
                }
            } else {
                if (i > 3 && i<6){
                   if (!Character.isDigit(SSN.charAt(i))) {
                    isValid = false;
                }
            }
                else if (i > 6) {
                    if (!Character.isDigit(SSN.charAt(i))) {
                    isValid = false;
                }
        }
            }
        }
        if((SSN.length()!=11) || (SSN.charAt(3)!='-') ||((SSN.charAt(6)) != '-')) {
            System.out.println(SSN + " is a invalid social security number");
        } else {
            if(isValid)
            System.out.println(SSN + " is an valid social security number");
        }
    
    }}
