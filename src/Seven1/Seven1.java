package Seven1;

import java.util.Scanner;

public class Seven1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        for(int i=0; i < 10; i++){
            numbers[i] = input.nextInt();

        }
        for(int i=9; i>=0 ;i--){
            System.out.println(numbers[i]);
        }

    }
}
