import java.util.Scanner;
import java.util.Arrays;

public class MonthYear {
    static String month;
    static int year;
    static String[] listMonth = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "sep", "Oct", "Nov", "Dec"};
    public static boolean check(){
        if (Arrays.asList(listMonth).contains(month)
                && year >= 1900 && year <= 3000){
            return true;
        }
            return false;
    }
    public static void PrintNumberOfDayInMonth(){
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.print("Enter month: ");
            month = keyboard.nextLine();

            System.out.print("Enter year: ");
            while (!keyboard.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                keyboard.next();
            }
            year = keyboard.nextInt();
            keyboard.nextLine();

        } while (!check());


        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") ||
                month.equals("Jul") || month.equals("Aug") || month.equals("Oct") ||
                month.equals("Dec")) {
            System.out.println(31);
        }
        else if (month.equals("Apr") || month.equals("Jun") ||
                month.equals("Sep") || month.equals("Nov")) {
            System.out.println(30);
        }
        else if(month.equals("Feb")){
            if (year % 4 == 0){
                System.out.println(29);
            }
            else{
                System.out.println(28);
            }

        }
    }
    public static void main(String args[]){
        PrintNumberOfDayInMonth();
    }
}
