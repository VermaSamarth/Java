package Function;

import java.util.*;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int num = scan.nextInt();
        int arr[] = new int[num];
        int c = 0;
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < num; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
                arr[i] = -1;
            }

        }
        for (int i = 0; i < num; i++) {
            for (int k = 1; k <= arr[i]; k++) {
                if (arr[i] % k == 0) {
                    c++;
                }
            }
            if (c == 2) {
                System.out.print(arr[i] + " ");
                arr[i] = -1;
            }

            c = 0;
        }
        for (int i = 0; i < num; i++) {
            if (arr[i] != -1)
                System.out.print(arr[i] + " ");
        }
        scan.close();

    }
}
