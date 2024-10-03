/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyApp;
import MyLibs.*;
import java.util.Scanner;
/**
 *
 * @author Luis
 */
public class Test {

    public static void main(String[] args)
    {
        // creation of the Team instance
        Team basketball = new Team("Cardinals", 5, 18, 21);

        Scanner scanner = new Scanner(System.in);
        
        
        do {
            // just a dummy print statement to make things more neat
            System.out.println("\n\n\n\n\n");


            // show the menu and prompt the user for their choice
            int userChoice = showMenu(scanner, basketball.name);

            switch (userChoice) {
                case 1:
                {
                    // just a dummy print statement to make things more neat
                    System.out.println("\n\n\n\n\n");


                    // check whether the team is still accepting applicants
                    if (basketball.memberCnt == basketball.maxMember)
                    {
                        System.out.println(basketball.name + " is no longer accepting applicants.");
                        break; 
                    }
                    
                    System.out.println("Member Application");
                    System.out.println("---------------------");
                    
                    System.out.print("Enter name: ");
                    String memberName = scanner.nextLine();
                    
                    // check whether the use entered a valid age for the member
                    int memberAge;
                    do
                    {
                        try
                        {
                            System.out.print("Enter age: ");
                            memberAge = Integer.parseInt(scanner.nextLine());
                        }
                        catch (NumberFormatException err)
                        {
                            System.out.println("Please enter a valid age...");
                            continue;
                        }   

                        break;
                    } while(true);
                     
                    // initialize the new member
                    Member member = new Member(memberName, memberAge);

                    if (!basketball.checkQualification(member))
                    {
                        System.out.println("Sorry, you are not qualified!");
                        break;
                    } else {
                        basketball.addMember(member);
                        System.out.println("Welcome to the " + basketball.name + " Team!\n");
                    }

                    break;
                }
                    
                case 2:
                {
                    System.out.println("\n\n\n\n\n");
                    System.out.println("Applicants for the " + basketball.name + ":");
                    System.out.println("---------------------------");

                    // we loop over each member of the team
                    for (Member member : basketball.members)
                    {
                        /* Since at initialization, the members are initialized to null,
                         * we only want to print members that are already filled out in the array
                         */
                        if (member != null)
                        {
                            System.out.println(member.name + " | " + member.age); 
                            System.out.println("----------------------");
                        } 

                    }

                    break;
                }
                case 3:
                {
                    System.exit(0);
                }
            } 
            // pause the program to allow the user to see the feedback of the system.
            programPause(scanner);
        } while(true);
        
    }
    
    // function to show the menu and prompt the user for their input
    public static int showMenu(Scanner scanner, String teamName)
    {

        // show the menu to the user
        System.out.println(teamName + " Team Application");
        System.out.println("-----------------------------");
        System.out.println("[1] Apply in the team");
        System.out.println("[2] Show applicants");
        System.out.println("[3] Exit");
        System.out.println("-----------------------------\n");


        
        /*
         * Do input validation to check whether the user entered a valid integer or not.
         * We catch the NumberFormatException and continue on with the program
         * to prevent it from crashing.
         */
        int userChoice;
        do {
            try 
            {
                System.out.print("Choice: ");
                userChoice = Integer.parseInt(scanner.nextLine());
                
                // check whether they entered an input within the valid range of choices
                if (userChoice > 3 || userChoice < 1)
                {
                    System.out.println("Enter a choice within the valid range...");
                    continue;
                }
            } 
            catch (NumberFormatException err)
            {
                System.out.println("Please enter a valid choice...");
                continue;
            }
            break;
        } while(true);
        
        return userChoice;

    };

    // just a function so that the user can see the feedback of the program without being redirected to the menu instantly
    public static void programPause(Scanner scanner)
    {
        // we pause for a while to let the user see the applicants before showing the menu again
        System.out.print("Press any key to continue...");
        scanner.nextLine();
    }



}
