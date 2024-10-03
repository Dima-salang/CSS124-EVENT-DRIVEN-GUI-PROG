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
public class PutanAct34 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char reply;
        
        String fullNames[] = {"Putan Luis Gabrielle", 
                               "Acosta Justin Lhei",
                                "Dela Pena Justine",
                                "Magculang Lui", 
                                "Ignacio Justin",
                                "Galang Jorham",
                                "Gozum Therese",
                                "Valdez Chrisgabriel",
                                "Serrano Neo",
                                "Manga Louis"};
        
        String lrnArr[] = {"403063150219",
                        "095614414032",
                        "095212344213",
                        "430213252883",
                        "091323445342",
                        "873239292111",
                        "090923523132",
                        "092352311222",
                        "423957211123",
                        "093235231111"};
        
        String contacts[] =
        {
            "09561441403",
            "09231423233",
            "09236667413",
            "09352315677",
            "092364587823",
            "099864513232",
            "096331232346",
            "095673237753",
            "093893321234",
            "097995445132"
        };
        
        String sections[] = {"Microsoft", "Microsoft", "Microsoft", "Microsoft",
            "Microsoft", "Microsoft", "Microsoft", "Microsoft", "Microsoft", "Microsoft"
        };
        
        String strands[] = {"ICT", "ICT", "ICT", "ICT", "ICT",
            "ICT", "ICT", "ICT", "ICT", "ICT",
        };
        
        do {
            System.out.print("Enter the student index: ");
            int studentIndex = input.nextInt();
            
            System.out.println("Full Name: " + fullNames[studentIndex]);
            System.out.println("LRN: " + lrnArr[studentIndex]);
            System.out.println("Section: " + sections[studentIndex]);
            System.out.println("Strand: " + strands[studentIndex]);
            System.out.println("Contact Number: " + contacts[studentIndex]);
            
            System.out.print("Search another? (Y/N): ");
            reply = input.next().charAt(0);
            
            
        } while (reply == 'Y' || reply == 'y');
    
        

        
}
}
