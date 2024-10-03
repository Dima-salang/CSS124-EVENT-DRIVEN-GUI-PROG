/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class PutanAct1 {
    public static void main(String[] args) {
        
        String orderedItem;
        orderedItem = "Hello";
        int calculatedAmount;
        calculatedAmount = 0;
        
        System.out.println(orderedItem);
        
        String c1 = "3 Pc Chicken Tenders            P255.00";
        int c1Price = 255;
        
        String c2 = "8 Pc Chicken Tenders            P500.00";
        int c2Price = 500;
        
        String s1 = "Spag Fame Fave                  P150.00";
        int s1Price = 150;
        
        String b1 = "Chicken French Quarter          P300.00";
        int b1Price = 300;
        
        String d1 = "Mac 'N' Cheese Hot Pops         P100.00";
        int d1Price = 100;
        
        Scanner item = new Scanner(System.in);
        
        
        
        
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|  |----------------------------------------------------------------------|  |");
        System.out.println("|  |                           Pop Eye's Menu                             |  |");
        System.out.println("|  |                                                                      |  |");
        System.out.println("|  | Code      Description                        Price                   |  |");
        System.out.println("|  | C1:       " + c1 + "                    |  |");
        System.out.println("|  | C2:       " + c2 + "                    |  |");
        System.out.println("|  | S1:       " + s1 + "                    |  |");
        System.out.println("|  | B1:       " + b1 + "                    |  |");
        System.out.println("|  | D1:       " + d1 + "                    |  |");
        System.out.println("|  |                                                                      |  |");
        System.out.println("|  |                  Love That Chicken From Pop Eye's                    |  |");
        System.out.println("|  |----------------------------------------------------------------------|  |");
        System.out.println("------------------------------------------------------------------------------");
        
       
        
        System.out.print("Enter your order: ");
        String order = item.nextLine();
        
        System.out.print("Enter the amount of your order: ");
        int orderAmount = item.nextInt();
        
        
        if (order.equals("C1")) {
            orderedItem = "3 Pc Chicken Tenders";
            calculatedAmount = c1Price * orderAmount;
            
        } else if (order.equals("C2")) {
            orderedItem = "8 Pc Chicken Tenders";
            calculatedAmount = c2Price * orderAmount;
        } else if (order.equals("S1")) {
            orderedItem = "Spag Fame Fave";
            calculatedAmount = s1Price * orderAmount;
        } else if (order.equals("B1")){
            orderedItem = "Chicken French Quarters";
            calculatedAmount = b1Price * orderAmount;   
        } else if (order.equals("D1")) {
            orderedItem = "Mac 'N' Cheese Hot Pops";
            calculatedAmount = d1Price * orderAmount;
        } else {
            System.out.println("Enter a valid order");
        }
        
        double vatAmount = calculatedAmount * 0.12;
        
        
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|  |----------------------------------------------------------------------|  |");
        System.out.println("|  |                           Pop Eye's Receipt                          |  |");
        System.out.println("|  |                                                                      |  |");
        System.out.println("|  |    Your Order               Quantity               Amount            |  |");
        System.out.println("|  |    " + orderedItem + "     " + orderAmount + "                      " + calculatedAmount + "               |  |");
        System.out.println("|  |                                                                      |  |");
        System.out.println("|  |                  Love That Chicken From Pop Eye's                    |  |");
        System.out.println("|  |----------------------------------------------------------------------|  |");
        System.out.println("------------------------------------------------------------------------------");
        
        System.out.println(calculatedAmount);
        
    }
}
