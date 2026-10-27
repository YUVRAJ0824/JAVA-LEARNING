public class shapes
{
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
       
        System.out.println("_________");
        System.out.println("inverted triangle numbered");
        // formula: j <= (4 - i + 1) -> starts with 4 numbers, shrinks down to 1
        for (int i = 1; i <= 4; i++) { // rows (1 to 4)
            for (int j = 1; j <= (4 - i + 1); j++) { // columns decrease each row
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("_________");
        System.out.println("pyramid");
        // spaces decrease (4 - i), odd stars increase (2 * i - 1)
        for (int i = 1; i <= 4; i++) { // rows
            for (int s = 1; s <= (4 - i); s++) { // spaces push right: 3, 2, 1, 0
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // odd stars: 1, 3, 5, 7
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("_________");
        System.out.println("inverted pyramid");
        // spaces increase (i - 1), odd stars decrease 2 * (4 - i) + 1
        for (int i = 1; i <= 4; i++) { // rows
            for (int s = 1; s <= (i - 1); s++) { // spaces increase: 0, 1, 2, 3
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * (4 - i) + 1); j++) { // odd stars: 7, 5, 3, 1
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
