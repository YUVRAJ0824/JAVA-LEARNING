import java.util.Scanner; // STEP 1: IMPORT. Scanner is a built-in Java class, but it lives in the java.util package. You must import it before using it.

public class if_loop_scnr {
    public static void main(String[] args) {

        /*
         * HOW TO BUILD AND USE A SCANNER:
         *
         * 1. Create the Object (Instantiation):
         *    Scanner scanner = new Scanner(System.in);
         *    - 'Scanner' is the data type.
         *    - 'scanner' is the variable name (you can name it input, reader, etc.).
         *    - 'new Scanner(...)' builds a new Scanner object in memory.
         *    - 'System.in' tells the Scanner to read data from the standard input stream (your keyboard).
         *
         * 2. Read the Input:
         *    - Use methods like .nextInt() for integers, .nextLine() for text, or .nextDouble() for decimals.
         *
         * 3. Close the Scanner:
         *    - Always use .close() at the end to free up computer memory and resources.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Control Flow Learning Menu ===");
        System.out.println("1. Simple if-else");
        System.out.println("2. if - else if - else ladder");
        System.out.println("3. Nested if");
        System.out.println("4. for loop");
        System.out.println("5. while loop");
        System.out.println("6. do-while loop");
        System.out.println("7. for-each loop");
        System.out.print("Enter your choice (1-7): ");

        // STEP 2: READ INPUT. The program pauses here and waits for the user to type a number and press Enter.
        int choice = scanner.nextInt();

        System.out.println("\n--- RESULT ---");

        switch (choice) {
            case 1:
                /*
                 * HOW SIMPLE IF-ELSE WORKS:
                 * It evaluates a boolean condition.
                 * If the condition is true, it executes the code inside the 'if' block.
                 * If the condition is false, it skips to the 'else' block and executes that instead.
                 */
                int a = 5;
                if (a <= 5) {
                    System.out.println("yes, " + a + " is less than or equal to 5.");
                } else {
                    System.out.println("no");
                }
                break;

            case 2:
                /*
                 * HOW IF - ELSE IF - ELSE LADDER WORKS:
                 * It checks multiple conditions sequentially from top to bottom.
                 * As soon as it finds a true condition, it executes that block and skips the rest.
                 * If none of the conditions are true, the final 'else' block executes.
                 */
                int score = 85;
                if (score >= 90) {
                    System.out.println("Grade A");
                } else if (score >= 80) {
                    System.out.println("Grade B"); // This will execute
                } else {
                    System.out.println("Grade C");
                }
                break;

            case 3:
                /*
                 * HOW NESTED IF WORKS:
                 * It places an 'if' statement inside another 'if' statement.
                 * The inner condition is ONLY checked if the outer condition evaluates to true.
                 * Useful for checking prerequisites (e.g., must be 18 first, THEN check weight).
                 */
                int age = 20;
                int weight = 60;
                if (age >= 18) {
                    System.out.println("Age is 18 or older.");
                    if (weight > 50) {
                        System.out.println("You are eligible to donate blood.");
                    } else {
                        System.out.println("You are not heavy enough to donate blood.");
                    }
                }
                break;

            case 4:
                /*
                 * HOW FOR LOOP WORKS:
                 * Used when you know exactly how many times you want to loop.
                 * It has 3 parts in one line:
                 * 1. Initialization (int i = 1) -> happens once at the start.
                 * 2. Condition (i <= 5) -> checked before every iteration. Loop stops if false.
                 * 3. Update (i++) -> happens at the end of every iteration.
                 */
                System.out.println("Counting from 1 to 5:");
                for (int i = 1; i <= 5; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
                break;

            case 5:
                /*
                 * HOW WHILE LOOP WORKS:
                 * Used when you don't know exactly how many times to loop, but you have a stopping condition.
                 * It evaluates the condition BEFORE executing the block.
                 * If the condition is false initially, the loop body might not execute at all.
                 * You must update the variable inside the loop (like w++) to avoid an infinite loop.
                 */
                System.out.println("While loop counting to 3:");
                int w = 1;
                while (w <= 3) {
                    System.out.print(w + " ");
                    w++;
                }
                System.out.println();
                break;

            case 6:
                /*
                 * HOW DO-WHILE LOOP WORKS:
                 * Very similar to the while loop, but the condition is checked AFTER the block executes.
                 * This means the code inside the 'do' block is guaranteed to run AT LEAST ONCE,
                 * even if the condition is false from the very beginning.
                 */
                System.out.println("Do-while loop (runs at least once):");
                int d = 10;
                do {
                    System.out.println("Value of d: " + d);
                    d++;
                } while (d < 10); // Condition is false (11 < 10 is false), but it still printed "10" once!
                break;

            case 7:
                /*
                 * HOW FOR-EACH WORKS (Enhanced For Loop):
                 * Used exclusively to iterate through arrays or collections (like Lists).
                 * Syntax: for (DataType variableName : arrayName)
                 *
                 * - It automatically goes through every single item in the array from start to finish.
                 * - 'String fruit' creates a temporary variable holding the current item for that iteration.
                 * - You don't need to manually create an index counter or check the array length.
                 */
                String[] fruits = {"Apple", "Banana", "Mango", "Cherry"};

                System.out.println("Printing array elements using for-each:");
                for (String fruit : fruits) {
                    System.out.println("I like " + fruit);
                }
                break;

            default:
                System.out.println("Invalid choice. Please run the program again and select a number between 1 and 7.");
                break;
        }

        // STEP 3: CLOSE. Always close your scanner when you are completely done reading inputs.
        scanner.close();
    }
}