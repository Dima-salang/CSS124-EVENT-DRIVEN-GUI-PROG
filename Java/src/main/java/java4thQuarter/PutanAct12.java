/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java4thQuarter;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;
/**
 *
 * @author Luis
 */
public class PutanAct12 {
    public static int age_calculator(int month, int day, int year) {
        Calendar calendar = new GregorianCalendar(year, month, day);
        Calendar now = new GregorianCalendar();
        
        int ageResult = now.get(Calendar.YEAR) - calendar.get(Calendar.YEAR);
        if (calendar.get(Calendar.MONTH) > now.get(Calendar.MONTH)
                || (calendar.get(Calendar.MONTH) == now.get(Calendar.MONTH) 
                && calendar.get(Calendar.DAY_OF_MONTH) > now.get(Calendar.DAY_OF_MONTH))) {
            ageResult--;
        }
        return ageResult;
    }
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char reply;
        
        do {
            int month = 0, day = 0, year = 0;
            System.out.println("=====AGE CHECKER PROGRAM=====");
            System.out.print("Enter Birth Month Number: ");
            month = input.nextInt();
            
            System.out.print("Enter Birth Day Number: ");
            day = input.nextInt();
            
            System.out.print("Enter Birthday Year Number: ");
            year = input.nextInt();
            
            System.out.print("Your present age is " + age_calculator(month, day, year) + " years old.");
            System.out.print("\nDo you want to continue? (Y/N) => ");
            
            reply = input.next().charAt(0);
            
        } while (reply == 'Y' || reply == 'y');
        System.out.println("\n-----TERMINATION-----");
    }
}
