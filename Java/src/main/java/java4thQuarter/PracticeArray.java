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
public class PracticeArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of employees: ");
        int numOfEmployees = input.nextInt();
        
        String empEmails[] = new String[numOfEmployees];
        String usernames[] = new String[numOfEmployees];
        String passwords[] = new String[numOfEmployees];
        
        int counter = 0;
        char reply;
        
        do {
            input.nextLine();
            System.out.println("-----Employee List Population-----");
            
            
            
            System.out.print("Enter email of the employee: ");
            String email = input.nextLine();
            
            System.out.print("Enter the username of the employee: ");
            String username = input.nextLine();
            
            System.out.print("Enter the password of the employee: ");
            String password = input.nextLine();
            
            empEmails[counter] = email;
            usernames[counter] = username;
            passwords[counter] = password;
            
            System.out.print("Continue? (Y/N): ");
            reply = input.next().charAt(0);
            
            counter++;
            
            
            
        } while (reply == 'Y' || reply == 'y');
        
        
        do {
            System.out.print("Enter the index of the employee: ");
            int empIndex = input.nextInt();
     
            System.out.println("Employee Index: " + empIndex);
            System.out.println("Email: " + empEmails[empIndex]);
            System.out.println("Username: " + usernames[empIndex]);
            System.out.println("Password: " + passwords[empIndex]);
            
            input.nextLine();
            
            System.out.print("Do you want to find another employee? (Y/N): ");
            reply = input.next().charAt(0);
        } while (reply == 'Y' || reply == 'y');
    }
}
