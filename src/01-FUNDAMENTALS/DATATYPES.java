import java.util.*;
public class DATATYPES {

    public static void main(String[] args){
          /*
           * Java data types:
           * Primitive types store simple values. Their values are not always stored on the stack;
           * where a value lives depends on how it is used.
           *
           * byte    1 byte    small whole numbers
           * short   2 bytes   whole numbers
           * int     4 bytes   whole numbers
           * long    8 bytes   large whole numbers (use L for the suffix, like 123L)
           * float   4 bytes   decimal numbers (use f for the suffix, like 3.14f)
           * double  8 bytes   decimal numbers with more precision than float
           * char    2 bytes   one UTF-16 code unit, written in single quotes like 'A'
           * boolean           true or false; Java does not define its storage size
           *
           * String, arrays, and other objects are reference types, not primitive types.
           * A reference variable refers to an object; Java does not promise that every
           * variable is stored in a particular memory area.
           *
           * Use String for phone numbers and other identifiers because you do not do math
           * with them and they can contain leading zeroes or symbols.
           * Use BigDecimal for decimal calculations that need exact currency values.
           * void is a method return type meaning the method does not return a value.
           *
           * A long literal can use L or l, but uppercase L is easier to read:
           * long population = 8798369L;

scanner.nextInt() — reads an int

scanner.nextDouble() — reads a double

scanner.nextBoolean() — reads a boolean

scanner.nextLong() — reads a long

scanner.nextFloat() — reads a float

scanner.nextByte() — reads a byte

scanner.nextShort() — reads a short

scanner.next() — reads a String (up to the next space)

scanner.nextLine() — reads an entire line of text as a String



        */
        Scanner sc=new Scanner(System.in);

        //int age=21;
        int age=sc.nextInt();  //declare
        //assign

         //double pie=3.124;also 3=output is 3.0 ok

        // double p=3.12f;//float
        boolean  isClass=true;
        //rule camelcase firstlower then varname first caps eg isBody
        //boolean has t/f only
        //True wrong full lower case
        //u can use is,has,hade

        char grade=sc.next().charAt(0);
       /* Here is why:

        scanner.next() returns a String. Even if the user types a single character like "a",
         Java treats it as a String object, not a primitive char.

        If you try to assign it directly like char c = scanner.next();
        , Java will throw a type mismatch compilation error because you cannot automatically convert
        a String to a char.

        Using .charAt(0) simply converts that returned String into the primitive char type you need.
        System.out.println("score "+grade);


        //one word only =char or many words need"" for str
        he 0 in .charAt(0) represents the index (the position) of the character you want to grab from the String.

In Java (and most programming languages), counting starts at 0 instead of 1.

0 = The very first character of the word.

1 = The second character.

2 = The third character, and so on.
*/

        //types of Sop
//formatted output (Sop)(Sopln)
        //but Sopf is format specifiers sok ok
        System.out.println(age);
        //print is with no next line eg sop(a);Sop(b); op is a b
        System.out.println(grade);
        //println(line) is with next line eg sop(a);Sop(b);
        // op is a
        // b
        //use text with var as ""+
        System.out.printf("age:%d",age);
        // % with , not with + (" %",var);

        System.out.print(age);


        //string is dt String is objects

        String mail="yuvi342@gmail.com";
        System.out.println("email: "+mail);
        System.out.println("email: "+mail+" "+"id ");
        System.out.println("email: "+mail+" "+ age);

        if(!isClass)      //(!)not gateis switching the t=f f=t ,tho isClass is true
        {
            System.out.print("yes");

        }
        else {
            System.out.print("no");
        }



sc.close();
    }
}
