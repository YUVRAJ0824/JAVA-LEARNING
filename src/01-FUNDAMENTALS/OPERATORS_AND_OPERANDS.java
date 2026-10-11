public class OPERATORS_AND_OPERANDS {

    public static void main(String[] args) {

        // 1. PRIMARY OPERATORS
        int[] numbers = {4, 7};
        String word = "Java";
        int groupedValue = (2 + 3) * 2; // () groups the math first
        System.out.println("Grouped value: " + groupedValue);
        System.out.println("Array item: " + numbers[1]); // [] gets item at index 1
        System.out.println("Word length: " + word.length()); // . accesses a method

        // 2. POSTFIX OPERATORS
        int postUp = 5;
        System.out.println("Post-increment: " + postUp++); // Use 5, then add 1
        int postDown = 5;
        System.out.println("Post-decrement: " + postDown--); // Use 5, then subtract 1

        // 3. UNARY OPERATORS
        int preUp = 5;
        System.out.println("Pre-increment: " + ++preUp); // Add 1, then use 6
        int preDown = 5;
        System.out.println("Pre-decrement: " + --preDown); // Subtract 1, then use 4
        System.out.println("Unary + and -: " + (+5) + ", " + (-5));
        System.out.println("NOT !: " + !true); // NOT flips true to false
        System.out.println("Bitwise NOT ~10: " + ~10); // Flips the bits; result is -11
        System.out.println("Cast double to int: " + (int) 3.9); // Drops the decimal part

        // 4. MULTIPLICATIVE OPERATORS
        System.out.println("Multiply: " + (3 * 4));
        System.out.println("Divide: " + (12 / 3)); // Integer division
        System.out.println("5 / 2 = " + (5 / 2)); // int division drops the remainder: 2
        System.out.println("5.0 / 2 = " + (5.0 / 2)); // double division keeps decimals: 2.5
        System.out.println("Remainder: " + (12 % 5));

        // 5. ADDITIVE OPERATORS
        System.out.println("Add: " + (5 + 3));
        System.out.println("Subtract: " + (5 - 3));
        System.out.println("Join text: " + "Java " + "is fun");

        int mathResult = 5 + 3 * 2; // Multiplication happens first
        System.out.println("5 + 3 * 2 = " + mathResult); // 11
        int forcedResult = (5 + 3) * 2; // Parentheses make addition happen first
        System.out.println("(5 + 3) * 2 = " + forcedResult); // 16

        // 6. SHIFT OPERATORS
        System.out.println("Left shift <<: " + (1 << 3)); // Moves bits left
        System.out.println("Signed right shift >>: " + (-8 >> 1)); // Keeps the sign
        System.out.println("Unsigned right shift >>>: " + (-8 >>> 1)); // Fills with zeroes

        // 7. RELATIONAL OPERATORS
        System.out.println("Less than <: " + (5 < 6));
        System.out.println("Less or equal <=: " + (5 <= 5));
        System.out.println("Greater than >: " + (6 > 5));
        System.out.println("Greater or equal >=: " + (6 >= 6));
        System.out.println("Is String: " + (word instanceof String)); // Checks the type

        // 8. EQUALITY OPERATORS
        int a = 10;
        int b = 10;
        System.out.println("Primitive ==: " + (a == b)); // Compares values
        System.out.println("Not equal !=: " + (a != 5));

        String str1 = new String("Java");
        String str2 = new String("Java");
        System.out.println("String ==: " + (str1 == str2)); // Compares references: false
        System.out.println("String .equals(): " + str1.equals(str2)); // Compares text: true

        // 9. BITWISE AND
        // &, ^, and | work on integer bits; && and || check boolean conditions.
        int firstBits = 6; // Binary 110
        int secondBits = 3; // Binary 011
        System.out.println("Bitwise &: " + (firstBits & secondBits)); // 010 = 2

        // 10. BITWISE XOR
        System.out.println("Bitwise ^: " + (firstBits ^ secondBits)); // 101 = 5

        // 11. BITWISE OR
        System.out.println("Bitwise |: " + (firstBits | secondBits)); // 111 = 7

        // 12. LOGICAL AND
        boolean isItem = true;
        boolean hasTicket = false;
        System.out.println("AND &&: " + (isItem && hasTicket)); // Both must be true

        int divisor = 0;
        boolean canDivide = divisor != 0 && 10 / divisor > 1; // Skips division when divisor is 0
        System.out.println("Can divide: " + canDivide);

        // 13. LOGICAL OR
        System.out.println("OR ||: " + (isItem || hasTicket)); // One or both; skips right side if left is true

        if (!isItem) {
            System.out.println("Item is false");
        } else {
            System.out.println("Item is true");
        }

        // 14. TERNARY OPERATOR
        // Format: condition ? valueIfTrue : valueIfFalse
        int n = 6;
        n += 11; // n is now 17
        System.out.println("Item: " + (n <= 5 ? "yes" : "no") + "\nValue: " + n);

        int speed = 80;
        String car = (speed > 60) ? "Fast" : "Slow";
        System.out.printf("Car speed is %s\n", car);

        int time = 22;
        String greeting = (time < 12) ? "Morning" : (time < 18) ? "Afternoon" : "Evening";
        System.out.println("Greeting: " + greeting);

        // 15. ASSIGNMENT OPERATORS
        int x = 10;
        x %= 20; // Keep the remainder
        System.out.println("x after mod: " + x);
        x /= 20; // Divide and store
        System.out.println("x after division: " + x);

        int assignedValue = 24;
        assignedValue += 2; // Same as: assignedValue = assignedValue + 2
        assignedValue -= 1;
        assignedValue *= 2;
        assignedValue /= 3;
        assignedValue %= 4;
        assignedValue &= 3;
        assignedValue ^= 1;
        assignedValue |= 4;
        assignedValue <<= 1;
        assignedValue >>= 2;
        assignedValue >>>= 1;
        System.out.println("After compound assignments: " + assignedValue);
    }
}