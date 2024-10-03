package java4thQuarter;
import java.util.Scanner;

public class PutanAct37 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter operation [+-/*%]: ");
        char operation = input.next().charAt(0);

        System.out.println("Your answer is: " + calculateOperation(num1, num2, operation));
        

        input.close();
    }

    static int calculateOperation(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '%':
                result = num1%num2;
                break;
            default:
                System.out.println("Enter a valid input...");
                break;
        }

        return result;
    }
}
