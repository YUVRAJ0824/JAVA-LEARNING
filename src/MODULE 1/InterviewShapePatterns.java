public class InterviewShapePatterns {
    public static void main(String[] args) {

        /*
        WHY NO '*' ON EVERY LINE?
        Java only cares about the start (slash-star) and end (star-slash).
        Any extra stars in the middle are just for visual style.
        You don't actually need them!
        */

        int n = 5;

        /*
        === 1. NUMBER RECTANGLE ===
        Outer loop = rows down , Inner loop = columns. right
        Output:
        1 2 3 4 5 6
        1 2 3 4 5 6
        1 2 3 4 5 6
        1 2 3 4 5 6
        */
        for (int i = 1; i <= 4; i++) //row
        {
            for (int j = 1; j <= 6; j++)//column
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }


        /*
        === 2. STAR RIGHT TRIANGLE ===
        Inner loop runs 'i' times (row number = star count).
        Output:
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
        === 3. REPEATING NUMBER TRIANGLE ===
        Prints the row number (i) instead of a star.
        Output:
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        /*
        === 4. INVERTED STAR TRIANGLE ===
        Inner loop counts backwards. Row 1 gets 5 stars, Row 2 gets 4, etc.
        Output:
        * * * * *
        * * * *
        * * *
        * *
        *
        */
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


        /*
        === 5. FLOYD'S TRIANGLE ===
        Uses a separate counter that never resets.
        Output:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }


        /*
        === 6. HOLLOW SQUARE ===
        Prints stars only on the first/last row or first/last column.
        Output:
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
        */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // 2 spaces for the empty center
                }
            }
            System.out.println();
        }


        /*
        === 7. STAR DIAMOND ===
        Combines a normal pyramid and an upside-down pyramid.
        Output:
            *
          * * *
        * * * * *
          * * *
            *
        */
        int size = 3; // Smaller size for a compact diamond

        // Top half
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = size - 1; i >= 1; i--) {
            for (int j = size; j >= i; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}