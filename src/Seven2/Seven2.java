package Seven2;

import java.util.Random;
import java.util.Scanner;
public class Seven2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();
        for(int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100);
        }
        //a
        for(int i = 0; i < 10; i = i + 2){
            System.out.print(numbers[i] + " ");
        }
        //b
        for(int i = 0; i < 10; i++){
            if(numbers[i] % 2 == 0){
                System.out.print(numbers[i] + " ");
            }
        }
        //c
        for(int i=9; i>=0 ;i--){
            System.out.println(numbers[i]);
        }
        //d
        System.out.print(numbers[0] + " " + numbers[9]);


    }
}
