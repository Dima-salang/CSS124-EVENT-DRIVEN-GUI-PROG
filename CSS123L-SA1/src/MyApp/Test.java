/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;
import MyLibs.*;
/**
 *
 * @author Luis
 */
public class Test {
    public static void main(String[] args) {
        // OBJECT CREATION
        Product cannedProduct1 = new Product("Corned Beef", "CB1", new Date("December", 21, 2020));
        Product cannedProduct2 = new Product("Tuna", "TU1", new Date("September", 30, 2017));
        Product cannedProduct3 = new Product("Luncheon Meat", "LM1", new Date("March", 15, 2021));
        
        // GETTING VALUES

        // cannedProduct1
        String cannedProd1Name = cannedProduct1.getName();
        String cannedProd1Code = cannedProduct1.getCode();
        String cannedProd1ManDate = cannedProduct1.getManufacturingDate().getMonth() + " " + cannedProduct1.getManufacturingDate().getYear();
        String cannedProd1Condition;
        if (cannedProduct1.CheckDate()) {cannedProd1Condition = "good";} else {cannedProd1Condition = "expired";}

        // cannedProduct2
        String cannedProd2Name = cannedProduct2.getName();
        String cannedProd2Code = cannedProduct2.getCode();
        String cannedProd2ManDate = cannedProduct2.getManufacturingDate().getMonth() + " " + cannedProduct2.getManufacturingDate().getYear();
        String cannedProd2Condition;
        if (cannedProduct2.CheckDate()) {cannedProd2Condition = "good";} else {cannedProd2Condition = "expired";}


        // cannedProduct3
        String cannedProd3Name = cannedProduct3.getName();
        String cannedProd3Code = cannedProduct3.getCode();
        String cannedProd3ManDate = cannedProduct3.getManufacturingDate().getMonth() + " " + cannedProduct3.getManufacturingDate().getYear();
        String cannedProd3Condition;
        if (cannedProduct3.CheckDate()) {cannedProd3Condition = "good";} else {cannedProd3Condition = "expired";}
        

        // DISPLAYING OUTPUT

        // We use formatting flags to format the output into specific widths
        System.out.println(String.format("%-20s %-20s %-20s %-20s", "Product Name", "Product Code", "Manufacturing Date", "Condition"));
        System.out.println("---------------------------------------------------------------------------");

        // cannedPRODUCT1
        System.out.println(String.format("%-20s %-20s %-20s %-20s", cannedProd1Name, cannedProd1Code, cannedProd1ManDate, cannedProd1Condition));

        // cannedPRODUCT2
        System.out.println(String.format("%-20s %-20s %-20s %-20s", cannedProd2Name, cannedProd2Code, cannedProd2ManDate, cannedProd2Condition));
        
        // cannedPRODUCT3
        System.out.println(String.format("%-20s %-20s %-20s %-20s", cannedProd3Name, cannedProd3Code, cannedProd3ManDate, cannedProd3Condition));

    }
}
