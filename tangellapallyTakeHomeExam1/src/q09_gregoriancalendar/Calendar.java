/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q09_gregoriancalendar;

import java.util.GregorianCalendar;
import java.util.Date;

/**
 *
 * @author Shivani tangellapally
 */
public class Calendar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating a object
        
        GregorianCalendar obj = new GregorianCalendar();
        //	Display the current year, month, and day.
        { int a = obj.get(GregorianCalendar.MONTH);
        a = a + 1;
        System.out.println("Current year :" + obj.get(GregorianCalendar.YEAR) + " , month :"
                + a + " , day:" + obj.get(GregorianCalendar.DAY_OF_MONTH));}
        //Set the value to 1234567898765L 
        obj.setTimeInMillis(1234567898765L);
        System.out.println("Set the value to 1234567898765L");
        //displaying the display the year, month, and day after setTimeInMillis(long) value
        
        System.out.println("Current year :" + obj.get(GregorianCalendar.YEAR) + " , month :"
                +obj.get(GregorianCalendar.MONTH) + " , day:" + obj.get(GregorianCalendar.DAY_OF_MONTH));
        ////here we are getting wrong month because, In GregorianCalender Month will take from 0 t0 11 by default so we need to do increment by 1 for month

    }
}
