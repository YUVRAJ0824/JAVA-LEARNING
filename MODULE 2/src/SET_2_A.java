import java.util.Scanner;
import java.util.Arrays;
// imp from 110ln need to learn
public class SET_2_A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Input
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }


        // 2. Traversal
        System.out.println("\n1. FOR LOOP TRAVERSAL");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        // 3. For-Each
        System.out.println("\n2. FOR-EACH TRAVERSAL");

        for (int value : arr) {
            System.out.println(value);
        }


        // 4. Printing
        System.out.println("\n3. PRINTING ARRAY");

        System.out.println(Arrays.toString(arr));

        System.out.println("this are method of array");
        // 5. Sum=plus of array elements
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        System.out.println("\n4. SUM = " + sum);


        // 6. Average of array elements with double DT
        double average = (double) sum / arr.length;

        System.out.println("5. AVERAGE = " + average);


        // 7. Count
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            count++;
        }

        System.out.println("6. COUNT = " + count);


        // 8. Even-Odd
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("7. EVEN = " + even);
        System.out.println("   ODD = " + odd);


        // 9. Maximum-find max value of an array
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("8. MAXIMUM = " + max);


        // 10. Minimum=finds min value of an array
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }


        System.out.println("9. MINIMUM = " + min);


        // 11. Search
        System.out.print("\n10. Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                found = true;
                System.out.println("Element found at index: " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }


        // 12. Reverse
        System.out.println("\n11. REVERSE TRAVERSAL");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        // 13. Update
        System.out.println("\n12. CONDITIONAL UPDATE");

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }

        System.out.println("Updated Array: " + Arrays.toString(arr));
    }
}