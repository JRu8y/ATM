package io.dimitrivaughn;

/**
 * Created by dimitrivaughn on 5/22/16.
 */
public class Investment extends BankAccount{

    private double interestRate = 0.015;

    public Investment (String accountName, String accountNumber, double accountBalance){
        super(accountName, accountNumber, accountBalance);

    }
}
