import java.util.Arrays;

public class arr {

    public static void main(String[] args) {

        // 1. Creating an array with values

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Numbers: " + Arrays.toString(numbers));


        // 2. Accessing individual elements

        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Last element: " + numbers[4]);


        // 3. Updating an existing element

        numbers[2] = 99;

        System.out.println("After update: "
                + Arrays.toString(numbers));


        // 4. Creating an array with a fixed size

        int[] marks = new int[5];

        System.out.println("New array: "
                + Arrays.toString(marks));


        // 5. Assigning values using indexes

        marks[0] = 85;
        marks[1] = 90;
        marks[2] = 78;
        marks[3] = 92;
        marks[4] = 88;

        System.out.println("Marks: "
                + Arrays.toString(marks));


        // 6. Array length

        System.out.println("Number of elements: "
                + marks.length);


        // 7. Last element using length

        System.out.println("Last mark: "
                + marks[marks.length - 1]);


        // 8. Different data types

        double[] prices = {10.5, 20.5, 30.5};

        char[] grades = {'A', 'B', 'C'};

        boolean[] results = {true, false, true};

        String[] names = {"John", "Alex", "Sam"};

        System.out.println("Prices: "
                + Arrays.toString(prices));

        System.out.println("Grades: "
                + Arrays.toString(grades));

        System.out.println("Results: "
                + Arrays.toString(results));

        System.out.println("Names: "
                + Arrays.toString(names));


        // 9. Default values

        int[] intArray = new int[3];

        double[] doubleArray = new double[3];

        boolean[] booleanArray = new boolean[3];

        String[] stringArray = new String[3];

        System.out.println("int array: "
                + Arrays.toString(intArray));

        System.out.println("double array: "
                + Arrays.toString(doubleArray));

        System.out.println("boolean array: "
                + Arrays.toString(booleanArray));

        System.out.println("String array: "
                + Arrays.toString(stringArray));


        // 10. for-each loop

        System.out.println("Numbers using for-each:");

        for (int value : numbers) {
            System.out.println(value);
        }


        // 11. for-each with String array

        System.out.println("Names:");

        for (String name : names) {
            System.out.println(name);
        }


        // 12. Direct array printing

        System.out.println("Direct array: " + numbers);


        // 13. Arrays.toString()

        System.out.println("Readable array: "
                + Arrays.toString(numbers));


        // 14. Multiple updates

        numbers[0] = 100;
        numbers[1] = 200;
        numbers[4] = 500;

        System.out.println("After multiple updates: "
                + Arrays.toString(numbers));


        // 15. Checking array length dynamically

        System.out.println("Length: " + numbers.length);

        System.out.println("First index: 0");

        System.out.println("Last index: "
                + (numbers.length - 1));


        // 16. Array reference

        int[] original = {10, 20, 30};

        int[] reference = original;

        reference[0] = 99;

        System.out.println("Original: "
                + Arrays.toString(original));

        System.out.println("Reference: "
                + Arrays.toString(reference));


        // 17. Creating a separate array

        int[] first = {1, 2, 3};

        int[] second = first.clone();

        second[0] = 100;

        System.out.println("First: "
                + Arrays.toString(first));

        System.out.println("Second: "
                + Arrays.toString(second));


        // 18. Comparing arrays

        int[] a = {1, 2, 3};

        int[] b = {1, 2, 3};

        System.out.println("Arrays equal: "
                + Arrays.equals(a, b));


        // 19. Filling an array

        int[] values = new int[5];

        Arrays.fill(values, 10);

        System.out.println("Filled array: "
                + Arrays.toString(values));


        // 20. Sorting an array

        int[] unsorted = {50, 10, 40, 20, 30};

        Arrays.sort(unsorted);

        System.out.println("Sorted array: "
                + Arrays.toString(unsorted));


        // 21. Array size is fixed

        int[] fixed = {10, 20, 30};

        fixed[0] = 100;

        System.out.println("Fixed array: "
                + Arrays.toString(fixed));


        // 22. Index boundary

        int[] data = {10, 20, 30};

        System.out.println("Valid indexes: 0, 1, 2");

        System.out.println("First value: " + data[0]);

        System.out.println("Last value: "
                + data[data.length - 1]);
    }
}