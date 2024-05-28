package Arrays;
import java.util.Arrays;
import java.util.Scanner;


public class Averages {
    // Member variable to hold the array and scanner
    private SingleDimensionArray numbers;
    private Scanner input;

    // Constructor to initialize components and perform operations
    public Averages() {
        numbers = new SingleDimensionArray(4);
        input = new Scanner(System.in);

        for (int i=0; i<4; i++){
            System.out.println("Enter a number:");
            int score = input.nextInt();
            System.out.println("You entered " + score);
            numbers.insertNoIndex(score);


        }
        input.close();

    }

    public double calculateAverages (int[] arr) {
        int total = arr.length;
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];

            }
            return (double) sum / total;
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }
        return 0;
    }

    public int[] checkNumbersAboveAverage(int[] arr) {
        try {
            int countAboveAverage = 0;
            double average = calculateAverages(arr);

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > average) {
                    countAboveAverage++;
                }
            }

            int[] aboveAverage = new int[countAboveAverage];
            int index = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > average) {
                    aboveAverage[index++] = arr[i];
                }
            }

            return aboveAverage;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return new int[0];
        }
    }

    public static void main(String[] args) {
        Averages calAverage = new Averages();
        int[] values = calAverage.numbers.getArray();
        double average = calAverage.calculateAverages(values);
        System.out.println("The average is: " + average);
        int[] above = calAverage.checkNumbersAboveAverage(values);
        System.out.println("Numbers above average: " + Arrays.toString(above));


    }
}

