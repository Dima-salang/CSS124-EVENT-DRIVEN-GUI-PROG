/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package putan.java;


import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class LuisGabrielleAct6 {
    
    public static void main(String[] args){
        String lrn, fname, gender, birthday, section, contact, guardian, adviser;
        char blType;
        int age, gradeLevel;
                
                
        Scanner answer = new Scanner(System.in);
                
                
        System.out.print("Enter your LRN: ");
        lrn = answer.nextLine();
        
        System.out.print("Enter your FULLNAME(Last Name, First Name, M.I.): ");
        fname = answer.nextLine();
        
        System.out.print("Enter AGE: ");
        age = answer.nextInt();
        
        answer.nextLine();
        
        System.out.print("Enter your GENDER: ");
        gender = answer.nextLine();
        
        System.out.print("Enter your BIRTHDAY: ");
        birthday = answer.nextLine();
        
        System.out.print("Enter GRADE LEVEL: ");
        gradeLevel = answer.nextInt();
        
        answer.nextLine();
        
        System.out.print("Enter SECTION: ");
        section = answer.nextLine();
        
        System.out.print("Enter CONTACT NUMBER: ");
        contact = answer.nextLine();
        
        System.out.print("Enter BLOOD TYPE: ");
        blType = answer.next().charAt(0);
        
        answer.nextLine();
        
        System.out.print("Enter your GUARDIAN: ");
        guardian = answer.nextLine();
        
        System.out.print("Enter your ADVISER: ");
        adviser = answer.nextLine();
        
        /* Display output */
        
        System.out.println("--------STUDENT INFORMATION----------");
        
        System.out.println("LRN:                " + lrn);
        System.out.println("Full Name:          " + fname);
        System.out.println("Age:                " + age);
        
        System.out.println("Birthday:           " + birthday);
        System.out.println("Grade Level:        " + gradeLevel);
        System.out.println("Section:            " + section);
        System.out.println("Contact Number:     " + contact);
        System.out.println("Blood Type:         " + blType);
        System.out.println("Guardian:           " + guardian);
        System.out.println("Adviser:            " + adviser);
                
        answer.close();
                
                
                
       
       
    }
    
    
}
