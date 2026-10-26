
import java.util.Arrays;

public class ARRAYS {

    public static void main(String[] args) {

        /*
         * JAVA ARRAYS
         *
         * An array stores multiple elements of the same declared type.
         * Its length is fixed after creation, and indexing starts at 0.
         *
         * Index:  0    1    2    3    4
         * Value: 70   80   90   85   75
         */

        // 1. CREATING ARRAYS

        // Way 1: Declare and initialize with values.
        int[] marks = {70, 80, 90, 85, 75};

        // Way 2: Create a fixed-size array, then assign values.
        int[] scores = new int[3]; // Default int values are 0.
        scores[0] = 75;
        scores[1] = 85;
        scores[2] = 95;

        scores[0] = 80; // Update an existing element.

        // Way 3: Declare first and initialize later.
        int[] numbers;
        numbers = new int[] {10, 20, 30, 40, 50};

        // 2. DIFFERENT ARRAY TYPES

        double[] prices = {10.5, 25.75, 99.99};
        char[] letters = {'J', 'A', 'V', 'A'};
        String[] fruits = {"Apple", "Mango", "Orange"};
        boolean[] results = {true, false, true};

        // 3. PRINTING AN ARRAY

        // Direct printing does not display the elements as a list.
        System.out.println(numbers);

        // Way 1: Print all elements in one readable line.
        System.out.println(Arrays.toString(numbers));

        // Way 2: Normal for loop — useful when indexes are needed.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Way 3: Enhanced for loop — directly reads each element.
        for (int number : numbers) {
            System.out.println(number);
        }

        // Print all values on one line.
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 4. ACCESSING ELEMENTS AND ARRAY LENGTH

        System.out.println(numbers[0]); // First element: 10
        System.out.println(numbers[2]); // Third element: 30
        System.out.println("Length: " + numbers.length);

        numbers[1] = 25;
        System.out.println(Arrays.toString(numbers));

        // Invalid indexes cause ArrayIndexOutOfBoundsException.
        // Arrays use .length; Strings use .length().

        // 5. ARRAYS UTILITY METHODS

        int[] values = {50, 10, 40, 20, 30};

        Arrays.sort(values); // Sorts the original array ascending.
        System.out.println(Arrays.toString(values));

        // Arrays is a utility class; static methods use the class name.
        // toString() returns a readable String representation of values.

        // 6. FINDING THE MAXIMUM VALUE

        int[] data = {12, 45, 7, 89, 23};
        int largest = data[0];

        // Index 0 is already used to initialize largest, so start at 1.
        for (int i = 1; i < data.length; i++) {
            if (data[i] > largest) {
                largest = data[i];
            }
        }

        System.out.println("Largest: " + largest);

        // If the condition is false, the if-block is skipped.
        // The loop continues with the next index.

        // 7. TWO-DIMENSIONAL ARRAYS

        int[][] studentMarks = {
            {70, 80},
            {85, 90},
            {60, 75}
        };

        System.out.println(Arrays.deepToString(studentMarks));

        // Outer length = rows; inner length = columns in that row.
        for (int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
            }
            System.out.println();
        }

        // 8. QUICK REVISION

        /*
         * 1. Arrays store elements of one declared type.
         * 2. The first index is 0; the last is length - 1.
         * 3. Array length is fixed after creation.
         * 4. Arrays.toString() prints a 1D array readably.
         * 5. Arrays.deepToString() handles nested arrays.
         * 6. Arrays.sort() sorts values in ascending order.
         * 7. A normal for loop can use indexes; enhanced for
         *    directly visits each element.
         * 8. String is a reference type, not a primitive type.
         * 9. new int[3] creates three integer positions,
         *    initialized to 0 by default.
         * 10. int[][] represents an array of arrays; rows can
         *     have different lengths.
         */

      
    }
}
