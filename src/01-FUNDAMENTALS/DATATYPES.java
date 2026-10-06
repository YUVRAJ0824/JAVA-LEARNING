import java.util.*;
public class DATATYPES {

    public static void main(String[] args){
        /*dt has two types
         primitive dt form of stack memory
   var is a reusable container for a value to store
         1byte=8bits
         int    4byte    whole numbers
         double  8byte    finance
         char  2byte     single letters
         boolean   jvm depended

         rare dt's
         byte 1byte   used in 1/0 case
         short  2byte  used in old db like year (don't use much)
         long(L or l) 8byte   used in long counter like phone no etc ,use lower l or caps L (suggested L)
         float(f) 4 byte   used in decimal points like temp ,rare use msolty game code etc
         void  return nothing used with methods no var deu to error so ok


         standards

         int phone=39083739l; compile time error
         long phone=38981379L; correct
         long phone=8798369l; correct

          small l,f or big L,F is supported,but use caps always!



         reference where stack memory address store in heap
         array
         string
         object

         sop("name"+dt);    space is allowed in quotes for gap

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
