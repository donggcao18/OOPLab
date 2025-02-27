import java.util.Scanner;

public class NumericArray {
    static int[] array;

    public static boolean bubleSort(int n1, int n2){
        if(n1<n2){
           return true;
        }
        else return false;
    }
    public static void inputArray(){
        System.out.print("Enter number of elements: ");
        Scanner keyboard  = new Scanner(System.in);
        int elements = keyboard.nextInt();
        System.out.print("Enter number in the array: ");
        array = new int[elements];
        for(int i = 0; i < array.length; i++){
            array[i] = keyboard.nextInt();
        }

    }
    public static void arrangeArray(){
        for (int i=0; i<array.length-1; i++){
            for(int j = i; j<array.length-1-i; j++){
                if(!bubleSort(array[j], array[j+1])){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[]){
        inputArray();
        arrangeArray();

        for(int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
