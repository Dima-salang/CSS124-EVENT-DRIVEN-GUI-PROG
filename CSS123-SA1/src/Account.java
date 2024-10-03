/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luis
 */
public class Account {
    private double accountBalance;
    private String currency;
    
    
    public Account(double accountBalance, String currency)
    {
        this.accountBalance = accountBalance;
        this.currency = currency;
    }
    
    public void deposit(double amount)
    {
        if (amount >= 0)
        {
            accountBalance += amount;
        } else {
            System.out.println("Error depositing...");
        }
        
    }
    
    public void withdraw(double amount)
    {
        if (amount >= 0 && amount <= accountBalance)
        {
            accountBalance -= amount;
        } else {
            System.out.println("Error withdrawing...");
        }
    }
    
    public double balanceInquiry()
    {
        return accountBalance;
    }

    public String getCurrency()
    {
        return currency;
    }
}
