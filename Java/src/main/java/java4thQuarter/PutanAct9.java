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
public class PutanAct9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int miscFee = 0;
        int feePerUnit = 0;
        String courseCode = "";
        
        
        
        System.out.print("Enter your Student Number: ");
        String lrn = input.nextLine();
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your course code: ");
        String course = input.nextLine();
        
        System.out.print("Enter your year level: ");
        String yearLevel = input.nextLine();
        
        System.out.print("Enter your general average: ");
        double ave = input.nextDouble();
        
        System.out.print("Enter the number of units you are enrolled in: ");
        int unitsEnrolled = input.nextInt();
        
        switch (course) {
            case "BSCS":
                miscFee = 3000;
                feePerUnit = 100;
                courseCode = "104";
                break;
            case "BSIT":
                miscFee = 2000;
                feePerUnit = 150;
                courseCode = "100";
                break;
            case "BSBA":
                miscFee = 2500;
                feePerUnit = 170;
                courseCode = "101";
                break;
            case "BSCA":
                miscFee = 2050;
                feePerUnit = 200;
                courseCode = "102";
                break;
            case "BSEdu":
                miscFee = 1500;
                feePerUnit = 220;
                courseCode = "103";
                break;
            
        }
        
        double tuitionFee = unitsEnrolled * feePerUnit;
        double totalTuitionFee = miscFee + tuitionFee;
        
        double discount = 0;
        
        if (ave == 1) {
            discount = tuitionFee * 0.30;
        } else if (ave == 2) {
            discount = tuitionFee * 0.20;
        } else if (ave == 3 ) {
            discount = tuitionFee * 0.10;
        } else {
            discount = 0;
        }
        
       
        double netTuitionFee = totalTuitionFee - discount;
        
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("|  |----------------------------------------------------------------------|  |");
        System.out.println("|  |                           Transcript of Fees                         |  |");
        System.out.println("|  |                                                                      |  |");
        System.out.println("|  |    Name: " + name + "                                        |  |");
        System.out.println("|  |    Course Code: " + courseCode + "                                                  |  |");
        System.out.println("|  |    Miscellaneous Fee: " + miscFee + "                                           |  |");
        System.out.println("|  |    Enrolled Units: " + unitsEnrolled + "                                                |  |");
        System.out.println("|  |    Total Tuition Fee: " + totalTuitionFee + "                                         |  |");
        System.out.println("|  |    Discount: " + discount + "                                                   |  |");
        System.out.println("|  |    Net Tuition Fee: " + netTuitionFee + "                                           |  |");
        System.out.println("|  |                                                                      |  |");
        System.out.println("|  |                   San Jose Litex Senior High School                  |  |");
        System.out.println("|  |----------------------------------------------------------------------|  |");
        System.out.println("------------------------------------------------------------------------------");
        
        
        
        
        
    }
}
