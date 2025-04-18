import javax.swing.JOptionPane;

public class ChoosingClass{
    public static void main(String arg[]){
        String noti = "Doo you wannt to changr your option";
        int option = JOptionPane.showConfirmDialog(null,
                noti, "Choose an option:", JOptionPane.YES_NO_OPTION);
        JOptionPane.showMessageDialog(null,
                "You have chosen " +
                (option == JOptionPane.YES_OPTION ? "Yes" : "No"));
    }
}
