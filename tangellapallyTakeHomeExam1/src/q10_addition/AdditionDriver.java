/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_addition;

/**
 *
 * @author Shivani tangellapally
 */
public class AdditionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Addition A = new Addition();

        A.AddVar(5, 6);
        System.out.println(A);

        A.AddVar(5, 6, 9);
        System.out.println(A);

        A.AddVar(5.0, 6.0);
        System.out.println(A);

        A.AddVar(5.0, 6.0, 7.0);
        System.out.println(A); 

        A.AddVar("First", "Last");
        System.out.println(A);

        A.AddVar("First", "Middle", "Last");
        System.out.println(A);
        
        //here in this program we can see that we have a method called 'AddVar' but the number of parameters or datatypes are getting changed
        //A.AddVar(5, 6) here two int numbers are given
        //A.AddVar(5, 6, 9) here three int numbers are given
        // A.AddVar(5.0, 6.0); here two double numbers are given
        //A.AddVar(5.0, 6.0, 7.0) here two double numbers are given
        //A.AddVar("First", "Last"); here two strings are given
        //A.AddVar("First", "Middle", "Last"); here three strings are given
    }

}
