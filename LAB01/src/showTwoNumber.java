import javax.swing.JOptionPane;
public class showTwoNumber {
    public static void main(String args[]){
        int a = Integer.parseInt
                (JOptionPane.showInputDialog(null, "Enter first: "));
        int b = Integer.parseInt
                (JOptionPane.showInputDialog(null, "Enter second: "));
        System.out.println("Sum is: " + (a+b));
    }
}
