package io.dimitrivaughn;
import java.util.*;


/**
 * Created by dimitrivaughn on 5/22/16.
 */
public class UserInputHandler {


    private static Scanner scanner = new Scanner(System.in);


// methods to handle input and output

    public static void inputUpdate(String update){
        System.out.println(update);
    }

    public static String promptString(String update){
        inputUpdate(update);
        return scanner.next();
    }

    public static double promptDouble(String update){
        inputUpdate(update);
        double answer = 0;
        try{answer = scanner.nextDouble();}
        catch (Exception notANumber){
            inputUpdate("Please choose a valid number between 0-9");
            scanner.nextLine();
        }

        return answer;

    }

    public static int promptInteger(String update){
        inputUpdate(update);
       int answer = 0;
        try{answer = scanner.nextInt();}
        catch (Exception notANumber){
            inputUpdate("Please choose a valid number between 0-9");
            scanner.nextLine();
        }

        return answer;

    }

}
