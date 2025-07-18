import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        // Read n
        int n = scanner.nextInt();
        long totalSum = (long) n * (n + 1) / 2;
 
        // Read n - 1 numbers and calculate their sum
        long actualSum = 0;
        for (int i = 0; i < n - 1; i++) {
            actualSum += scanner.nextInt();
        }
 
        // The missing number is the difference between total and actual sum
        System.out.println(totalSum - actualSum);
    }
}
