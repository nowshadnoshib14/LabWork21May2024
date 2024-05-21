package Seven6;

public class Seven6 {
    public static void main(String[] args) {
        int[] num  = {1, 4, 9, 16, 9, 7, 4, 9, 11};
        int sum = num[0];

        for(int i=1; i < 9; i++){
            if(i % 2!=0){
                sum = sum - num[i];
            }
            else {
                sum = sum + num[i];
            }
        }
        System.out.println(sum);
    }
}
