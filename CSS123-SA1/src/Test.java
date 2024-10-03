/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Test {
    public static void main(String[] args)
    {
        ATMCard card = new ATMCard(123456789, "Tomas Mapua", new Account(1234567.89, "Philippine Peso"));
        card.getAccount().deposit(5000);
        card.getAccount().withdraw(223456789);

        double newBalanceAmount = card.getAccount().balanceInquiry();
        System.out.println(newBalanceAmount + " " + card.getAccount().getCurrency());
        
        
        Fruit a = new Apple();
        The constructor is automatically called when an object is created or instantiated.


True

False

        
    }
}
 