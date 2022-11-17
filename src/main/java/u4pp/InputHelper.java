package u4pp;
import java.util.Scanner;
public class InputHelper {
    public InputHelper(Scanner scanner){

    }// gets the prompt and asks the question and takes in an input, if it is other than the listed options it will require them to try again
    public static boolean getYesNoInput(String prompt){
        Scanner deez = new Scanner(System.in);
        System.out.println(prompt);
        String input = deez.nextLine();
        while(input != "y" || input != "Y" || input != "n" || input != "N"){
            System.out.println(prompt);
            System.out.println("You typed: " + input);
            System.out.println("Please only enter the options y,Y,n,or N.");
            input = deez.nextLine();
        }
        if(input.equals("y") || input.equals("Y")){
            return true;
        }else if(input.equals("n") || input.equals("N")){
            return false;
        }
        return false;
    }
//gets the prompt and asks it, then an int has to be inputted by the user that lies between the min and max or it will repeatedly ask them to input the correct int
    public int getIntegerInput(String prompt, int min, int max){
        int input;
        Scanner deez = new Scanner(System.in);
        System.out.println(prompt);
        input = deez.nextInt();
        while(input > max || input < min){
            System.out.println(prompt);
            System.out.println("You typed: " + input);
            System.out.println("Please only enter a number between " + min + "and "  + max);
            input = deez.nextInt();
        }
        if(min < input && input < max){
            return input;
        }
        return input;
    }
}
