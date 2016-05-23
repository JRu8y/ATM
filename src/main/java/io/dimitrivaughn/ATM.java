package io.dimitrivaughn;

import java.util.ArrayList;

/**
 * Created by dimitrivaughn on 5/22/16.
 */
public class ATM {

    private ArrayList<User> userList = new ArrayList<>();
    UserInputHandler handler = new UserInputHandler();

    public void greetUser(){
        handler.inputUpdate("Welcome to this.Bank, where we provide the best in this.service.");
    }

    public void startATM() {
        greetUser();
        int choice = -1;
        while (choice != 0) {
            choice = handler.promptInteger("Please choose an option. 1: Log in, 2: Create a new user, 0: exit ATM");
            switch (choice) {
                case 1:
                    logIn();
                    break;
                case 2:
                    createNewUser();
                    break;
                case 0:
                    handler.inputUpdate("Great doing this.business with you. Exiting this.application. Good bye and enjoy this.day!");
                    break;
            }
        }
    }

    public void logIn(){
        String userName = handler.promptString("What is your user name?");
        String userPin = handler.promptString("What is your pin number?");
        bankingTransactions();
    }

    public void createNewUser(){
        String userName = handler.promptString("What is your user name?");
        String userPin = handler.promptString("What is your pin number?");
        User nextUser = new User(userName, userPin);
        userList.add(nextUser);
        bankingTransactions();
    }

    public void bankingTransactions(){
        handler.promptInteger("What transaction would like to perform? 1: Open new account, 2: Close existing account" +
                " 3: Other");
    }
}
