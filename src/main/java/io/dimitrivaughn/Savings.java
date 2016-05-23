package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/22/16.
 */
public class Savings extends BankAccount {

    private double interestRate = 0.005;


    public Savings (String accountName, String accountNumber, double accountBalance){
        super(accountName, accountNumber, accountBalance);

    }
}
