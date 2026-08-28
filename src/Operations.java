public class Operations {

    public static void main(String[] args) {

        // ==========================================
        // 1. TERNARY OPERATOR (Short if-else)
        // ==========================================
        // Syntax: (condition) ? valueIfTrue : valueIfFalse;
        int n = 6;
        n += 11; // n is now 17

        // Parentheses around the ternary prevent string concatenation errors
        System.out.println("Item: " + (n <= 5 ? "yes" : "no") + "\nValue: " + n);

        int speed = 80;
        String car = (speed > 60) ? "Fast" : "Slow";
        System.out.printf("Car speed is %s\n", car);

        // Nested Ternary
        int t = 22;
        // Checks: if < 12 (Morning), else if < 18 (Afternoon), else (Evening)
        String greeting = (t < 12) ? "Morning" : (t < 18) ? "Afternoon" : "Evening";
        System.out.println("Greeting: " + greeting);


        // ==========================================
        // 2. OPERATOR CATEGORIES
        // ==========================================
        /*
         * Arithmetic: +, -, *, /, % (Math)
         * Unary: ++, --, ! (Increase, decrease, or NOT)
         * Assignment: =, +=, -=, *=, /=, %= (Storing values)
         * Comparison: ==, !=, >, <, >=, <= (True/False checks)
         * Logical: && (AND), || (OR), ! (NOT) (Combining conditions)
         * Bitwise: &, |, ^, ~, <<, >>, >>> (Operating at the bit level)
         */


        // ==========================================
        // 3. BITWISE OPERATORS
        // ==========================================
        int res = ~10;
        System.out.printf("\nBitwise NOT of 10 is: %d\n", res);
        // ~ is One's Complement. It flips every 0 to 1 and every 1 to 0.
        // In Java, ~x always equals (-x - 1) because of how negatives are stored.


        // ==========================================
        // 4. LOGICAL AND BOOLEAN OPERATORS
        // ==========================================
        // Standard naming convention for booleans: start with is, has, was, etc.
        boolean isItem = true;

        /*
         * && (AND): both must be true
         * || (OR):  at least 1 must be true
         * !  (NOT): opposite sign
         */

        // ! is a unary operator (placed as a prefix before the variable).
        // && and || are binary operators (placed directly between two variables).
        if (!isItem) {
            System.out.println("Item is false");
        } else {
            System.out.println("Item is true");
        }


        // ==========================================
        // 5. ASSIGNMENT & MATH OPERATORS
        // ==========================================
        int x = 10;
        x %= 20; // % is modulo (gets the remainder of 10 divided by 20)
        System.out.println("x after mod: " + x);

        x /= 20; // / is division
        System.out.println("x after div: " + x);


        // ==========================================
        // 6. OPERATOR PRECEDENCE (Order of Operations)
        // ==========================================
        System.out.println("\n--- Operator Precedence ---");
        // Java follows standard math rules: Parentheses () first, then *, /, % before +, -
/*
**Java Operator Precedence (Highest to Lowest)**

Operators higher in this list are evaluated before operators lower in the list. When operators have the same precedence (are on the same line), they are evaluated based on their associativity (usually left-to-right, except for Unary, Ternary, and Assignment which are right-to-left).

1. **Parentheses & Access:**
* `()` Parentheses
* `[]` Array access
* `.` Object member access


2. **Unary (Right-to-Left):**
* `expr++` / `expr--` (Postfix)
* `++expr` / `--expr` (Prefix)
* `+` / `-` (Positive/Negative sign)
* `!` (Logical NOT)
* `~` (Bitwise NOT)
* `(type)` (Type casting)


3. **Multiplicative (Left-to-Right):**
* `*` (Multiply)
* `/` (Divide)
* `%` (Modulo/Remainder)


4. **Additive (Left-to-Right):**
* `+` (Add or String Concatenation)
* `-` (Subtract)


5. **Shift (Left-to-Right):**
* `<<` (Left shift)
* `>>` (Signed right shift)
* `>>>` (Unsigned right shift)


6. **Relational / Comparison (Left-to-Right):**
* `<` (Less than)
* `<=` (Less than or equal to)
* `>` (Greater than)
* `>=` (Greater than or equal to)
* `instanceof` (Type comparison)


7. **Equality (Left-to-Right):**
* `==` (Equal to)
* `!=` (Not equal to)


8. **Bitwise AND (Left-to-Right):**
* `&`


9. **Bitwise XOR (Left-to-Right):**
* `^`


10. **Bitwise OR (Left-to-Right):**
* `|`


11. **Logical AND (Left-to-Right):**
* `&&`


12. **Logical OR (Left-to-Right):**
* `||`


13. **Ternary (Right-to-Left):**
* `? :` (Short if-else)


14. **Assignment (Lowest Precedence, Right-to-Left):**
* `=`
* `+=`, `-=`, `*=`, `/=`, `%=`
* `&=`, `^=`, `|=`
* `<<=`, `>>=`, `>>>=`
 */
        int mathResult = 5 + 3 * 2; // Multiplication happens first
        System.out.println("5 + 3 * 2 = " + mathResult); // 11

        int forcedResult = (5 + 3) * 2; // Parentheses force addition first
        System.out.println("(5 + 3) * 2 = " + forcedResult); // 16


        // ==========================================
        // 7. COMPARING OBJECTS VS. PRIMITIVES
        // ==========================================
        System.out.println("\n--- Objects vs Primitives ---");

        // Primitives (int, boolean, double, char) use == to compare actual values
        int a = 10, b = 10;
        System.out.println("Primitives (a == b): " + (a == b)); // true

        // Objects (like Strings) must use .equals() to compare actual content
        // Using 'new String' forces Java to make two separate objects in memory
        String str1 = new String("Java");
        String str2 = new String("Java");

        System.out.println("Objects with == (Memory Address check): " + (str1 == str2)); // FALSE
        System.out.println("Objects with .equals() (Text Value check): " + str1.equals(str2)); // TRUE


        // ==========================================
        // 8. SPECIAL JAVA OPERATORS
        // ==========================================
        System.out.println("\n--- Special Operators ---");

        // A. instanceof: Checks if an object belongs to a specific Class type
        String text = "Hello";
        System.out.println("Is 'text' a String? " + (text instanceof String)); // true

        // B. Pre vs Post Increment
        int count = 5;
        System.out.println("Post-increment (count++): " + (count++)); // Prints 5, THEN becomes 6
        System.out.println("Pre-increment (++count): " + (++count));  // Becomes 7 FIRST, then prints 7
    }
}