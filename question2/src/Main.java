import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select the beverage type");
        System.out.println("1) PS5");
        System.out.println("2) XBOX");
        System.out.println("3) Switch");

        int choice = input.nextInt();
        input.nextLine();

        String ConsoleType ="";
        switch (choice) {
            case 1: ConsoleType = "PS5";break;
            case 2: ConsoleType = "XBOX";break;
            case 3: ConsoleType = "Switch";break;
            default:ConsoleType= "Unknown";break;
        }
    }


}
