public class workout_sheet {
    public static void main(String[] args)
    {
        System.out.println("square signs");
        //sqaure values
        for (int i = 1; i <= 5; i++) { // rows
            for (int j = 1; j <= 5; j++) { // columns
                System.out.print( "# ");
            }
            System.out.println();
        }
        System.out.println("______________");
        //number square
        System.out.println("square numbered");
        for (int i = 1; i < 5; i++) {
            for (int j=1;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();

        }

        System.out.println("_________");
        System.out.println("rectangle numbered");
        for (int i = 1; i <=4; i++) {
            for (int j=1;j<=6;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println("_________");
        System.out.println("triangle numbered");
        // why i rather num heres why
        // as shape itself wast to get rows from 1 so
        // we take j<=i
        for (int i = 1; i <=4; i++) {

            for (int j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        while ()
        System.out.println("_________");
        System.out.println("inverted triangle numbered");
        for (int i = 1; i <=4; i++) {
            for (int j=1;j<=i;j++)
            {
                System.out.print(j+ " ");
            }
            System.out.println();
        }




    }
}
