
import java.util.Arrays;
import java.util.Scanner;

public class SimpleSieveAlgorithm {

    static void SieveOfErathosthenes(int size) {
        boolean prime[] = new boolean[size + 1];
        // for (int i = 1; i <= size; i++)
        // prime[i] = true;
         
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= size; i++) {
            if (prime[i] == true) {
                for (int j = i * i; j <= size; j += i) {
                    prime[j] = false;
                }
            }
        }

        System.out.print("Primes:");
        for (int i = 2; i <= size; i++) {
            if (prime[i] == true)
                System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int limit;
        System.out.println("Enter the limit: ");
        limit = scan.nextInt();
        SieveOfErathosthenes(limit);
        scan.close();
    }
}
