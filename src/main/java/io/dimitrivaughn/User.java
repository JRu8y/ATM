package io.dimitrivaughn;

import java.util.ArrayList;

/**
 * Created by dimitrivaughn on 5/22/16.
 */
public class User {

// declaring fields

    private String userName, userPin;
    private ArrayList<BankAccount> userAccounts = new ArrayList<BankAccount>();
    static int accountNumber = 0;

// initializing fields in the constructor

    public User(String name, String pin){
        this.userName = name;
        this. userPin = pin;
    }

// getters for user fields

    public String getUserName() {
        return userName;
    }

    public String getUserPin() {
        return userPin;
    }

    public ArrayList<BankAccount> getUserAccounts() {
        return userAccounts;
    }

// method to open a new account

    public void openAccount (String accountType, double depositAmount){
        switch(accountType.toLowerCase()){
            case "checking":
                userAccounts.add(new Checking(userName,Integer.toString(accountNumber),depositAmount));
                break;
            case "savings":
                userAccounts.add(new Savings(userName,Integer.toString(accountNumber),depositAmount));
                break;
            case "Investment":
                userAccounts.add(new Investment(userName,Integer.toString(accountNumber),depositAmount));
                break;
        }
        accountNumber++;
    }


}
