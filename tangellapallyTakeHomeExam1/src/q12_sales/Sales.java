/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12_sales;

/**
 *
 * @author Shivani tangellapally
 */
public class Sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double totalSales = 30000;
        double SalesAmount = 0.0;

        double CommisionRate = 0.0;

        do {
            if (SalesAmount <= 5000 && SalesAmount > 0) {
                CommisionRate = SalesAmount * 0.08;
            } else if (SalesAmount >= 5000.01 && SalesAmount <= 10000) {
                CommisionRate = 5000 * 0.08 + (SalesAmount - 5000) * 0.1;
            } else {
                CommisionRate = (5000 * 0.08) + (5000 * 0.1) + (SalesAmount - 10000) * 0.12;

            }
            SalesAmount++;
        } while (CommisionRate < totalSales);

        System.out.println(" the minimum sales you have to generate in order to make $30,000 is : "+SalesAmount);

    }
}
