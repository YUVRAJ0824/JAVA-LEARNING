import java.util.Arrays;

public class SET_1 {

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

        // 6. Array length - field/property not a method here

        System.out.println("Number of elements: "
                + marks.length);

        // 7. Last element using length so last element - the value index to print
        // so length gives size count -1(last element in array)
        // array.length is 5 so -1 gives 4th element to print

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
        //0

        double[] doubleArray = new double[3];
        //0.0

        boolean[] booleanArray = new boolean[3];
        //F

        String[] stringArray = new String[3];
        //null

        System.out.println("int array: "
                + Arrays.toString(intArray));

        System.out.println("double array: "
                + Arrays.toString(doubleArray));

        System.out.println("boolean array: "
                + Arrays.toString(booleanArray));

        System.out.println("String array: "
                + Arrays.toString(stringArray));


        // 10. for-each loop - print/display  all elements,value=temp var

        System.out.println("Numbers using for-each:");

        for (int value : numbers) {
            System.out.println(value);
        }


        // 11. for-each with String array,same with str of array

        System.out.println("Names:");

        for (String name : names) {
            System.out.println(name);
        }


        // 12. Direct array printing,gives address not values

        System.out.println("Direct array: " + numbers);


        // 13. Arrays.toString() easy and faster

        System.out.println("Readable array: "
                + Arrays.toString(numbers));


        // 14. Multiple/mass updates

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
        //  sort= static method,no need to waste lines

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


        // 23. What is deepToString and why do we use it?

        int[][] twoD = { {1, 2}, {3, 4} };

        // WHY NOT Arrays.toString()?
        // toString() only looks at the first level. Because a 2D array is an "array of arrays",
        // it just prints the messy memory addresses of the inner arrays, not the actual numbers.
        System.out.println("Using toString(): " + Arrays.toString(twoD));
        // Output looks like garbage: [[I@1b6d3586, [I@4554617c]

        // WHY Arrays.deepToString()?
        // deepToString() goes "deep" (recursively) into nested arrays. It keeps opening up
        // the inner arrays until it finds the actual values and prints them clearly.
        // You MUST use this for 2D, 3D, and Jagged arrays!
        System.out.println("Using deepToString(): " + Arrays.deepToString(twoD));
        // Output looks perfect: [[1, 2], [3, 4]]

        //24. types of array
        //If you use Arrays.toString() on a 2D or 3D array,
        // it will just print the memory addresses of the inner arrays.
        // Arrays.deepToString() looks inside the nested arrays to print the actual values.

        // 1D: A simple linear sequence of elements accessed by a single index.
        int[] oneD = {10, 20, 30};
        //System.out.println("1-D array:"+ Arrays.deepToString(oneD));



        // 2D: An array of 1D arrays, forming a uniform grid of rows and columns.
        int[][] twooD = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println("2-D array:"+ Arrays.deepToString(twooD));



        // Jagged: A 2D array where the inner arrays (rows) have different lengths.
        int[][] jagged = {
                {1, 2},
                {3, 4, 5, 6},
                {7}
        };
        System.out.println("jagged array:"+ Arrays.deepToString(jagged));

        // MultiD (3D): An array containing 2D arrays, accessed by three indices (depth, row, col).
        int[][][] multiD = {
                { {1, 2}, {3, 4} },
                { {5, 6}, {7, 8} }
        };
        System.out.println("multi-D array:"+ Arrays.deepToString(multiD));

        // 25. The difference between toString() and deepToString()

        int[][] my2DArray = { {1, 2}, {3, 4} };

        // --- 1. Arrays.toString() = SHALLOW (Surface Level) ---
        // How it works: It only looks at the very first layer of the array.
        // If it sees inner arrays, it doesn't bother opening them. It just prints
        // their default "memory address names".
        System.out.println("toString: " + java.util.Arrays.toString(my2DArray));
        // Result: [[I@1b6d3586, [I@4554617c] (Ugly and useless for 2D)


        // --- 2. Arrays.deepToString() = DEEP (Recursive) ---
        // How it works: It looks inside the array, sees the inner arrays, and OPENS them.
        // It keeps going "deep" into every layer until it finds the actual numbers.
        System.out.println("deepToString: " + java.util.Arrays.deepToString(my2DArray));
        // Result: [[1, 2], [3, 4]] (Perfectly readable)


        // --- WHY ARE THERE TWO DIFFERENT METHODS? ---
        // Performance! toString() is very fast and perfect for standard 1D arrays.
        // deepToString() takes more processing power because it has to recursively hunt
        // through multiple layers. Java keeps them separate so you don't waste speed
        // on simple 1D arrays.

    }
}