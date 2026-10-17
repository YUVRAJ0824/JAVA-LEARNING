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
    Widening: Converting a smaller type to a bigger type (e.g., int to double). It happens automatically, but can still lose precision (for example, long to float).
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


        System.out.println("\n--- 3. String to Char (charAt & toCharArray) ---");
        String str = "yo";

        // charAt(index) → get ONE specific char by position
        char ch = str.charAt(0);    // 'y'  (position 0)
        char ch2 = str.charAt(1);   // 'o'  (position 1)
        System.out.println("charAt(0): " + ch);   // y
        System.out.println("charAt(1): " + ch2);  // o

        // toCharArray() → get ALL chars at once as an array
        char[] letters = str.toCharArray();  // ['y', 'o']
        System.out.println("toCharArray: " + letters[0] + " " + letters[1]); // y o

        // KEY RULE:
        // String.valueOf(0)  → "0"   (converts the NUMBER 0 to String)
        // str.charAt(0)      → 'y'   (reads the char AT position 0 of str)


        System.out.println("\n--- 4. String to Number (parse methods) ---");
        // Pattern: WrapperClass.parseXxx("stringValue") → gives you the number

        // String → int  (most common, use this the most)
        int age = Integer.parseInt("20");
        System.out.println("parseInt:    " + age);      // 20

        // String → double  (use for decimals like price, weight)
        double price = Double.parseDouble("99.99");
        System.out.println("parseDouble: " + price);    // 99.99

        // String → long  (use for very big numbers)
        long bigNum = Long.parseLong("9876543210");
        System.out.println("parseLong:   " + bigNum);   // 9876543210

        // String → float  (less precise decimal)
        float temp = Float.parseFloat("36.6");
        System.out.println("parseFloat:  " + temp);     // 36.6

        // String → boolean
        boolean isValid = Boolean.parseBoolean("true");
        System.out.println("parseBoolean:" + isValid);  // true

        // String → byte  (tiny number -128 to 127)
        byte smallNum = Byte.parseByte("100");
        System.out.println("parseByte:   " + smallNum); // 100

        // String → short
        short medNum = Short.parseShort("200");
        System.out.println("parseShort:  " + medNum);   // 200

        /*
        PARSE — QUICK REFERENCE:
        ┌──────────────────────────────────────────────────┐
        │  Integer.parseInt("20")       → int    20        │
        │  Double.parseDouble("99.99")  → double 99.99     │
        │  Long.parseLong("9876543210") → long   9876543210│
        │  Float.parseFloat("36.6")     → float  36.6      │
        │  Boolean.parseBoolean("true") → boolean true     │
        │  Byte.parseByte("100")        → byte   100       │
        │  Short.parseShort("200")      → short  200       │
        ├──────────────────────────────────────────────────┤
        │  ⚠ char has NO parseChar() — use charAt(0)       │
        │  ⚠ "abc" inside parseInt()  → crash!             │
        └──────────────────────────────────────────────────┘
        */


        System.out.println("\n--- 5. Any Type to String (valueOf) ---");
        int num = 42;
        String numStr = String.valueOf(num);       // int → String
        System.out.println("valueOf int:    " + numStr);  // "42"

        double pi = 3.14;
        String piStr = String.valueOf(pi);         // double → String
        System.out.println("valueOf double: " + piStr);   // "3.14"

        char symbol = '$';
        String symStr = String.valueOf(symbol);    // char → String
        System.out.println("valueOf char:   " + symStr);  // "$"
    }
// reviewed and verified

    /*
    ============================================================
    ASCII — Char to Int & Back  (LEARN LATER — Advanced Java)
    ============================================================
    NOT IMPORTANT NOW. Come back to this when you study:
    - String algorithms
    - Character manipulation
    - Advanced Java topics

    WHAT IS ASCII?
    Every character has a number code behind it.
    'A' = 65,  'B' = 66,  'a' = 97,  '0' = 48

    char → int  (widening — automatic, no cast needed)
        char letter = 'A';
        int code = letter;   // gives 65

    int → char  (narrowing — needs manual cast)
        int num = 66;
        char c = (char) num;  // gives 'B'

    Useful combos:
        (int)'A'   → 65
        (int)'a'   → 97
        (int)'0'   → 48
        (char)65   → 'A'
    ============================================================
    */

    /*
    ============================================================
    CORE RULES — String & Char Conversion (Direction Chart)
    ============================================================

    TWO DIRECTIONS:

    ► TO String (converting anything INTO a String):
       String.valueOf(x)   → works on int, double, char, boolean, ANY type
       Integer.toString(n) → works on Integer object (same goal, different call style)
       "" + x              → quick trick, works on anything via concatenation

    ► FROM String (reading/breaking OUT of a String):
       str.charAt(i)       → gives ONE char at index i  (String → char)
       str.toCharArray()   → breaks whole String into char array (String → char[])

    ============================================================
    COMMON CONFUSION:
    ============================================================

    toString()    → any object ──► String   (going TO String)
    toCharArray() → String ──► char[]       (going AWAY from String, breaking it apart)

    These are OPPOSITE directions — NOT the same thing!

    ============================================================
    QUICK REFERENCE TABLE:
    ============================================================

    Method                     | From        | To        | Example
    ---------------------------|-------------|-----------|------------------------------
    String.valueOf(x)          | any type    | String    | valueOf(65)     → "65"
    Integer.toString(n)        | Integer     | String    | toString(65)    → "65"
    Integer.parseInt(str)      | String      | int       | parseInt("42")  → 42
    Double.parseDouble(str)    | String      | double    | parseDouble("3.14") → 3.14
    str.charAt(i)              | String      | char      | "Java".charAt(0) → 'J'
    str.toCharArray()          | String      | char[]    | "Hi".toCharArray() → ['H','i']
    (int) char                 | char        | int       | (int)'A'        → 65
    (char) int                 | int         | char      | (char)65        → 'A'

    NOTE: boolean cannot be converted to/from other types.
          String needs parseInt/parseDouble to become a number — no direct cast.
    ============================================================
    */
    }

