public class TYPE_CONVERSION {
    public static void main(String[] args)
    {
        //byte, short, int, long, float, double
        //char can change
        //boolean cant change
        //str can change using (like Integer.parseInt() or String.valueOf())

   /*
   Type Conversion: The broad term for changing a value from one data type to another (either automatically by Java or manually by you).
   Type Casting: Specifically means manual conversion where you force it using parentheses (e.g., (int) myDouble).
   Widening: Converting a smaller type to a bigger type (e.g., int $\rightarrow$ double). It happens automatically.
   Narrowing: Converting a bigger type to a smaller type (e.g., double $\rightarrow$ int). It requires manual casting.

Widening is also called: Implicit Conversion or Promotion (because Java "promotes" it to a bigger size safely).

Narrowing is also called: Explicit Conversion or Explicit Casting (because you have to explicitly write the target type).

    */
        System.out.println("auto convert-small to big");
        int a=10;
        double b=a;
        System.out.println(b+" :b value");

        System.out.println("manual convert-big to small");
        double c=2.2;
        int d=(int)c;
        System.out.println(d+" :d value");

//all combinations type
        System.out.println("\n--- 1. WIDENING (Automatic) ---");

        byte myByte = 5;
        short myShort = myByte;     // byte to short
        int myInt = myShort;        // short to int
        long myLong = myInt;        // int to long
        float myFloat = myLong;     // long to float
        double myDouble = myFloat;  // float to double

        System.out.println("Byte " + myByte + " widened all the way to double: " + myDouble);


        System.out.println("\n--- 2. NARROWING (Manual Casting Required) ---");

        double bigDouble = 123.456;
        float bigFloat = (float) bigDouble;   // double to float
        long bigLong = (long) bigFloat;       // float to long
        int bigInt = (int) bigLong;           // long to int
        short bigShort = (short) bigInt;      // int to short
        byte bigByte = (byte) bigShort;       // short to byte

        System.out.println("Double " + bigDouble + " narrowed all the way to byte: " + bigByte);
/*
no boolean
special types char and str
*/


        System.out.println("--- 1. Char to Int & Back ---");
        char letter = 'A';
        int ascii = letter; // char automatically widens to int (gives 65)
        System.out.println("Char 'A' widened to int: " + ascii);

        int code = 66;
        char newChar = (char) code; // int must be manually cast back to char (gives 'B')
        System.out.println("Int 66 narrowed back to char: " + newChar);


        System.out.println("\n--- 2. String to Char & Primitives ---");
        String word = "Java";
        char firstLetter = word.charAt(0); // Grabs the first character ('J')
        System.out.println("String \"Java\" first char: " + firstLetter);

        String numStr = "123";
        int parsedNum = Integer.parseInt(numStr); // String to int
        System.out.println("String \"123\" parsed to int: " + parsedNum);


        System.out.println("\n--- 3. Primitives/Chars to String ---");
        char symbol = '$';
        String symbolStr = String.valueOf(symbol); // or "" + symbol
        System.out.println("Char '$' converted to String: " + symbolStr);

        double pi = 3.14159;
        String piStr = String.valueOf(pi); // double to String
        System.out.println("Double 3.14159 converted to String: " + piStr);
    }
// reviewed and verified
    }

