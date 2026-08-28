class demoEh
{
    public static void main(String[] args) {
        try {
            int a = 1;
            a = 1 / 0;
            System.out.print(a);
            checkage(15);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            System.out.print("done finally");
        }
    }
        static void checkage(int age)throws Exception
        {
         if(age<18)
         {
             throw new Exception("under age");
         }

         System.out.print("yes can ");
        }
    }
