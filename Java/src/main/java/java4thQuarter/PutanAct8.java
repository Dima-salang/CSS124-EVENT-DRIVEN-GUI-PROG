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
public class PutanAct8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int miscFee = 0;
        int feePerUnit = 0;
        
        
        System.out.print("Enter your Student Number: ");
        String lrn = input.nextLine();
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your year level: ");
        String yearLevel = input.nextLine();
        
        System.out.print("Enter your general average: ");
        double ave = input.nextDouble();
        
        System.out.print("Enter the number of units you are enrolled in: ");
        int unitsEnrolled = input.nextInt();
        
        switch (yearLevel) {
            case "1":
                miscFee = 2000;
                feePerUnit = 300;
                break;
            case "2":
                miscFee = 3000;
                feePerUnit = 400;
                break;
            case "3":
                miscFee = 3000;
                feePerUnit = 500;
                break;
            case "4":
                miscFee = 4000;
                feePerUnit = 550;
                break;
        }
        
        double tuitionFee = unitsEnrolled * feePerUnit;
        double totalTuitionFee = miscFee + tuitionFee;
        
        double discount = 0;
        
        if (ave <= 90) {
            discount = tuitionFee * 0.20;
        } else if (ave <= 95) {
            discount = tuitionFee * 0.30;
        } else {
            discount = tuitionFee * 0.40;
        }
        
        double netTuitionFee = totalTuitionFee - discount;
        
        System.out.println("--------------------------------------------");
        System.out.println("Dear " + name + ",");
        System.out.println("Your total tuition fee is: " + totalTuitionFee);
        System.out.println("Your discount is: " + discount);
        System.out.println("Your net tuition fee is: " + netTuitionFee);
        
        
    }
}
    