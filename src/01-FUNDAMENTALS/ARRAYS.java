
import java.util.Arrays;
import java.util.Scanner;

public class ARRAYS {

    public static void main(String[] args) {

        /*
         * JAVA ARRAYS
         *
         * An array stores multiple values of the same data type
         * using a single variable.
         *
         * Visual example:
         *
         *  Array: marks
         *
         *  Index    0       1       2       3       4
         *        +-------+-------+-------+-------+-------+
         *  Value |  70   |  80   |  90   |  85   |  75   |
         *        +-------+-------+-------+-------+-------+
         *
         * Index starts at 0, so the last index is length - 1.
         * Har box ek element store karta hai.
         */

        // 1. CREATING ARRAYS

        // Way 1: Create and initialize together.
        int[] marks = {70, 80, 90, 85, 75};

        // Way 2: Create a fixed-size array and assign values later.
        int[] scores = new int[3]; // Default int values are 0.
        scores[0] = 75;
        scores[1] = 85;
        scores[2] = 95;
        scores[0] = 80; // Update an element.

        // Way 3: Declare first, then initialize.
        int[] extraNumbers;
        extraNumbers = new int[] {5, 10, 15};

        // Array length is fixed after creation.

        // 2. DIFFERENT ARRAY TYPES

        int[] ages = {20, 21, 22};
        double[] prices = {10.5, 25.75, 99.99};
        char[] letters = {'J', 'A', 'V', 'A'};
        String[] fruits = {"Apple", "Mango", "Orange"};
        boolean[] results = {true, false, true};

        // 3. PRINTING AN ARRAY

        // Direct printing does not display elements as a readable list.
        System.out.println(marks);

        // Way 1: Arrays.toString() returns a readable String.
        System.out.println(Arrays.toString(marks));

        // Way 2: Normal for loop uses indexes.
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // Way 3: Enhanced for loop directly reads each element.
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        // 4. ACCESSING, UPDATING AND ARRAY LENGTH

        System.out.println(marks[0]); // First element: 70
        System.out.println(marks[2]); // Third element: 90

        marks[1] = 85;
        System.out.println(Arrays.toString(marks));
        System.out.println("Length: " + marks.length);

        // Arrays use .length (property); Strings use .length() (method).
        // Invalid indexes cause ArrayIndexOutOfBoundsException.

        // 5. ARRAYS UTILITY METHODS

        int[] values = {50, 10, 40, 20, 30};

        Arrays.sort(values);
        System.out.println(Arrays.toString(values));

        /*
         * Arrays is a utility class from java.util.
         * Its static methods can be called using the class name.
         *
         * A property gives information; a method performs an operation.
         * sort() changes the original array into ascending order.
         * toString() returns a readable String, not a String[] array.
         *
         * Arrays is optional for basic array creation and indexing;
         * import it when using methods such as sort() or toString().
         */

        // 6. FINDING THE MAXIMUM VALUE

        int[] data = {12, 45, 7, 89, 23};
        int largest = data[0];

        // Index 0 is already the initial maximum, so start at index 1.
        for (int i = 1; i < data.length; i++) {
            if (data[i] > largest) {
                largest = data[i];
            }
        }

        System.out.println("Largest: " + largest);

        // If the condition is false, only the if-block is skipped.
        // The loop continues with the next index.

        // 7. TWO-DIMENSIONAL ARRAYS

        int[][] studentMarks = {
                {70, 80},
                {85, 90},
                {60, 75}
        };

        System.out.println(Arrays.deepToString(studentMarks));

        // Outer length = rows; each inner length = columns in that row.
        for (int i = 0; i < studentMarks.length; i++) {
            for (int j = 0; j < studentMarks[i].length; j++) {
                System.out.print(studentMarks[i][j] + " ");
            }
            System.out.println();
        }

        // 8. USER INPUT WITH SCANNER

        /*
         * Scanner reads keyboard input through System.in.
         * nextInt() reads an integer; nextDouble() reads a decimal.
         * next() reads one word; nextLine() reads a line of text.
         *
         * Pattern: import -> create -> use -> close.
         * Reuse one Scanner for the inputs you need.
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        if (size > 0) {
            int[] inputNumbers = new int[size];

            for (int i = 0; i < inputNumbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                inputNumbers[i] = sc.nextInt();
            }

            System.out.println(
                    "Your array: " + Arrays.toString(inputNumbers)
            );
        } else {
            System.out.println("Array size must be greater than zero.");
        }

        // Close after all required input is finished.
        sc.close();

        // 9. NEXT ARRAY PRACTICE TASKS

        /*
         * [ ] 1. Practise Scanner input with different array sizes.
         * [ ] 2. Calculate the sum and average.
         * [ ] 3. Find minimum and maximum values.
         * [ ] 4. Search for a value using linear search.
         * [ ] 5. Reverse an array.
         * [ ] 6. Practise Arrays.copyOf() and Arrays.equals().
         * [ ] 7. Practise 2D arrays and nested loops.
         * [ ] 8. Learn matrix addition and subtraction.
         * [ ] 9. Learn matrix multiplication after the basics.
         */
    }
}
