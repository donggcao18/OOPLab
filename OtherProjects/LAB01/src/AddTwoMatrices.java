import java.util.Scanner;
public class AddTwoMatrices {
    static int rows;
    static int columns;

    public static void inputMatric(Scanner keyboard, int[][] matrix){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }
    public static void main(String args[]){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter numbers rows");
        rows = keyboard.nextInt();
        System.out.println("Enter numbers columns");
        columns = keyboard.nextInt();

        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
        int[][] sum = new int[rows][columns];

        System.out.println("Enter 1st matrix" );
        inputMatric(keyboard, matrix1);

        System.out.println("Enter 2nd matrix" );
        inputMatric(keyboard, matrix2);

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of 2 matrices are:" );
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
