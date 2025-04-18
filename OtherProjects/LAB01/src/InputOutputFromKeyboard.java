import java.util.Scanner;

public class InputOutputFromKeyboard {
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Name?");
        String userName = keyboard.nextLine();

        System.out.println("Age?");
        int userAge = keyboard.nextInt();

        System.out.println("Taal?");
        double userTall = keyboard.nextDouble();
        System.out.println ("Hi " + userName + ". You  are of  age: " + userAge);
    }
}
