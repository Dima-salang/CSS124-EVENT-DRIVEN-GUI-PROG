package java4thQuarter;
import java.util.Scanner;


public class PutanAct38 {
    
    static double balance = 1000;

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        
        String menuReply;
        if (validatePIN()) {
            
            do {
                System.out.println("MENU");
                System.out.println("1. Balance/Inquiry");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Exit");

                System.out.print("Enter your choice: ");
                char userReply = input.next().charAt(0);
                
             
                activateATM(userReply);
                
                input.nextLine();
                System.out.print("Go to menu? Y/N: ");
                menuReply = input.nextLine();
                
            } while (menuReply.equals("Y") || menuReply.equals("y"));
        }

    }

    static boolean validatePIN(){
        Scanner input = new Scanner(System.in);
        int tries = 3;

        
        while (tries >= 0) {
            String pin = input.nextLine();
            if (pin.equals("1234")) {
                return true;
            } else {
                System.out.println("Incorrect PIN!");
                tries--;
            }
        }

        System.out.println("YOU ARE NOW LOCKED OUT. TRY AGAIN LATER.");
        return false;
    }

    static void activateATM(char userChoice){
        Scanner userInput = new Scanner(System.in);

        switch(userChoice){
            case '1':
                System.out.println("Your current balance: " + balance);
                break;
            case '2':
                System.out.print("Enter amount to deposit: ");
                double depositAmount = userInput.nextDouble();
                balance += depositAmount;
                System.out.println("New account balance: " + balance);
                break;
            case '3':
                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = userInput.nextDouble();
                if (withdrawAmount < balance){
                    balance -= withdrawAmount;
                } else {
                    System.out.println("Insufficient balance.");
                }
                System.out.println("New account balance: " + balance);
                break;
            case '4':
                break;
            default:
                System.out.println("Enter a valid input!");
                break;
        }
    }
    
}
