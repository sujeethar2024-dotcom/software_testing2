import java.util.Scanner;

public class java1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] temperatures = new double[30];
        double sum = 0;
        System.out.println("Enter temperatures for 30 days:");
        for (int i = 0; i < 30; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = sc.nextDouble();
            sum += temperatures[i];
        }
        System.out.println("\n--- Temperature Report ---");
        for (int i = 0; i < 30; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i] + "°C");
        }
        double highest = temperatures[0];
        double lowest = temperatures[0];

        for (int i = 1; i < 30; i++) {
            if (temperatures[i] > highest) {
                highest = temperatures[i];
            }
            if (temperatures[i] < lowest) {
                lowest = temperatures[i];
            }
        }
        double average = sum / 30;
        int aboveAverageCount = 0;
        for (int i = 0; i < 30; i++) {
            if (temperatures[i] > average) {
                aboveAverageCount++;
            }
        }
        System.out.println("\nHighest Temperature: " + highest + "°C");
        System.out.println("Lowest Temperature: " + lowest + "°C");
        System.out.println("Average Temperature: " + average + "°C");
        System.out.println("Days above average: " + aboveAverageCount);

        sc.close();
    }
}