package u4pp;
import java.util.Scanner;
public class InputHelper {
    public InputHelper(Scanner scanner){
String input = scanner.nextLine();
    }
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
        if(input == "y" || input == "Y"){
            return true;
        }else if(input == "n" || input == "N"){
            return false;
        }
        return false;
    }
}
