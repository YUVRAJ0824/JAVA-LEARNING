import java.util.Arrays;
// optional import only need for array methods etc so or static methods so
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

            int[] marks = {70, 80, 90, 85, 75};
            /*
             * 1. CREATING AN ARRAY

             * Method 1: Declare and initialize together.
             * int[] means an integer array.
             * {} contains the initial values.
             */
            int[] numbers = {10, 20, 30, 40, 50};
            /*
             * Method 2: Create an array with a fixed size first.
             * new int[3] creates 3 integer positions.
             * Default int values are 0 until we assign new values.
             */
            int[] scores = new int[3];

            scores[0] = 75;
            scores[1] = 85;
            scores[2] = 95;

            // Update an existing element: arrayName[index] = value.
            scores[0] = 80;
            /*
             * 2. DIFFERENT ARRAY TYPES

             * The declared type determines the type of each element.
             */
            int[] ages = {20, 21, 22};
            double[] prices = {10.5, 25.75, 99.99};
            char[] letters = {'J', 'A', 'V', 'A'};
            String[] fruits = {"Apple", "Mango", "Orange"};
            boolean[] results = {true, false, true};
            /*
             * 3. PRINTING AN ARRAY

             * Printing an array directly does not print its elements.
             * Java displays a type-and-identity-style representation.
             * Isliye values dekhne ke liye Arrays.toString() use karte hain.
             */
            System.out.println(numbers);
            System.out.println(Arrays.toString(numbers));
            /*
             * 4. ACCESSING AND UPDATING ELEMENTS

             * Use arrayName[index] to access a specific element.
             * Indexing starts at 0.
             */
            System.out.println(numbers[0]); // 10
            System.out.println(numbers[2]); // 30

            numbers[1] = 25;
            System.out.println(Arrays.toString(numbers));
            // Invalid indexes cause ArrayIndexOutOfBoundsException.
        /*
             * 5. NORMAL FOR LOOP

             * i represents the index.
             * The loop visits each valid index from 0 to length - 1.
             */
            for (int i = 0; i < numbers.length; i++) {
                System.out.println(numbers[i]);
            }
            /*
             * 6. ENHANCED FOR LOOP

             * The loop gets each element directly.
             * Index ki zaroorat nahi hoti when we only read values.
             */
            for (int number : numbers) {
                System.out.println(number);
            }
            /*
             * 7. ARRAY LENGTH

             * length is a property, not a method.
             * Correct: numbers.length
             * Incorrect: numbers.length()
             */
            System.out.println("Length: " + numbers.length);

            /*
             * 8. ARRAYS UTILITY METHODS

             * Arrays is a utility class from java.util.
             * Its static methods can be called using the class name.

             * static means the method belongs to the class itself,
             * rather than to an individual object.
             */
            int[] values = {50, 10, 40, 20, 30};

            Arrays.sort(values);
            System.out.println(Arrays.toString(values));

            // sort() changes the original array into ascending order.
            // toString() returns a readable representation of its elements.


            /*
             * 9. IMPORTANT INTERVIEW Q&A
             *
             * Q1. What is an array?
             * An object that stores a fixed number of elements
             * of the same declared type.
             *
             * Q2. What is the first index?
             * Index 0.
             *
             * Q3. Can an array grow automatically?
             * No. Its length is fixed after creation.
             *
             * Q4. What happens when an invalid index is accessed?
             * Java throws ArrayIndexOutOfBoundsException.
             *
             * Q5. What is the difference between length and length()?
             * Arrays use the length property.
             * String uses the length() method.
             *
             * Q6. Why does printing an array directly look unusual?
             * It does not automatically print the elements.
             * Use Arrays.toString() or a loop.
             *
             * Q7. What is the difference between a normal and
             * an enhanced for loop?
             * A normal loop can use indexes; an enhanced loop
             * directly visits each element.
             *
             * Q8. What does Arrays.sort() do?
             * It sorts array elements into ascending order.
             *
             * Q9. Can an array store different types together?
             * A normal array has one declared element type.
             *
             * Q10. Is String a primitive type?
             * No. String is a reference type.
             */



        }
    }
