import java.util.Scanner;

public class PandS {
    public static void main(String[] args)
    {

        /*   scanner has 4 steps
        1:import utill
        2:create new sc
        3:add input var with next___ (based on dt
        int=Int,double=NextDouble,etc same but String=Line )
        close with sc.close();

        3 types of printing statments
        print= standard
        println=next line

        printf= access dt with % based on
        %.2f=2decimals
        .3f=3 points limit etc so

         */
        Scanner sc=new Scanner(System.in);
        System.out.printf("enter your name:");
        String name=sc.nextLine();


        System.out.printf("enter your age:");
        int age=sc.nextInt();
        System.out.println("hello  "+name);
        System.out.println("your age is :"+age);

        System.out.println("thank you");

        sc.close();


    }

    public static class exceptionhandling {
        public static void main(String[] args)
        //nested try block
        {
     /* try{
          System.out.println("enter teh outer try block");
          int[] numbers={10,20,30};//arr create,init



          catch()
          {}

          try{

              System.out.println("enter the inner try block");
              int divisionresults=numbers[0]/0;
              System.out.println("results"+divisionresults);

          } catch (ArithmeticException e) {
            System.out.println("inner catch 1:can't divide by zero!(" +e+ ")");
                    }


            try {
                //System.out.println("enter inner try block 2");
                //int invalidElement=numbers[5];
                String str1 = null;
                System.out.println("str1:" + str1.length());
                //System.out.println("element:"invalidElement);

            } catch (NullPointerException e) {
                System.out.println("Exception."+ e);
            }
    */
            try{
                String str=null;
                System.out.println("String"+str);
            }catch (Exception e)
            {
                System.out.println("outer catch:generic fallback exception handler"+e);
            }
        }
    }
}
