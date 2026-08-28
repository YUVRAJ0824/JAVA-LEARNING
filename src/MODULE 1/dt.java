
public class dt {

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
         short  2byte  used in old db like year (dont use much)
         long(L) 8byte   used in long counter like phone no etc ,use lower l or caps L (suggested L)
         float(f) 4 byte   used in decimal points like temp ,rare use msolty game code etc
         void  return nothing used with methods no var deu to error so ok


         standards

         int phone=39083739l; complie time error
         long phone=38981379L; correct
         long phone=8798369l; correct



         reference where stack memory address store in heap
         array
         string
         object

         sop("name"+dt);    space is allowed in quotes for gap

        */

        //int age=21;
        int age;  //declare
        age=21;  //assign

         //double pie=3.124;also 3=output is 3.0 ok

        // double p=3.12f;//float
        boolean  isClass=true;
        //rule camelcase firstlower then varname first caps eg isBody
        //boolean has t/f only
        //True wrong full lower case
        //u can use is,has,hade

        char grade='A';
        System.out.println("score "+grade);
        //one word only =char or many words need"" for str

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
        // % with , not with + (" %",

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




    }
}
