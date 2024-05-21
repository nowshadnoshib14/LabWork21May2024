package Seven4;

public class Seven4 {
    public static void main(String[] args) {

        int[] numbers = {5, 3, 8, 1, 2, 7, 34, 90};

                int result = sumWithoutSmallest(numbers);
                System.out.println("Sum without the smallest element: " + result);
            }

            public static int sumWithoutSmallest(int[] numbers) {
                if (numbers.length == 0) {
                    return 0;
                }

                int sum = 0;
                int smallest = numbers[0];

                for (int i = 0; i < numbers.length; i++) {
                    sum += numbers[i];
                    if (numbers[i] < smallest) {
                        smallest = numbers[i];
                    }
                }

                return sum - smallest;
            }
        }





