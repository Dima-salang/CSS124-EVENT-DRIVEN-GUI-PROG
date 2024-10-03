/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class ATMCard {
    private int cardNumber;
    private String cardOwner;
    private Account account;
    public static int balance;
    public ATMCard(int cardNumber, String cardOwner, Account account)
    {
        this.cardNumber = cardNumber;
        this.cardOwner = cardOwner;
        this.account = account;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public Account getAccount() {
        return account;
    }
    
    
    
    
    
}
