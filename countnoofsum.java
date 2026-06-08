import java.util.Scanner;
 public class countnoofsum{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                count++;
            }
        }

        System.out.println("The number of odd numbers from 1 to " + n + " is: " + count);
    }
}
