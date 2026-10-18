public class InterviewShapePatterns {
    public static void main(String[] args) {

        /*
        PATTERN CHEAT SHEET:
        - Outer loop (i) = rows down
        - Spaces loop (s) = push right: (n - i)
        - Inner loop (j) = columns across
        - println() = jump to next line

        QUICK TRICKS:
        - Normal triangle: j <= i
        - Inverted triangle: j <= (n - i + 1)
        - Pyramid (odd stars): j <= (2 * i - 1)
        - Repeat row: print(i + " ")
        - Count columns: print(j + " ")
        - Continuous count: print(counter++ + " ")
        - Hollow: if on edge print "* ", else print "  "
        */

        int n = 5;

        /*
        === 1. NUMBER RECTANGLE ===
        Outer = rows down, Inner = columns right.
        Output:
        1 2 3 4 5 6
        1 2 3 4 5 6
        1 2 3 4 5 6
        1 2 3 4 5 6
        */
        System.out.println("=== 1. NUMBER RECTANGLE ===");
        for (int i = 1; i <= 4; i++) { // rows
            for (int j = 1; j <= 6; j++) { // columns
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 2. STAR RIGHT TRIANGLE ===
        Row number = number of stars (row 1 has 1, row 2 has 2...).
        Output:
        *
        * *
        * * *
        * * * *
        * * * * *
        */
        System.out.println("=== 2. STAR RIGHT TRIANGLE ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 3. REPEATING NUMBER TRIANGLE ===
        Same loop as star triangle, just print 'i' instead of '*'.
        Output:
        1
        2 2
        3 3 3
        4 4 4 4
        5 5 5 5 5
        */
        System.out.println("=== 3. REPEATING NUMBER TRIANGLE ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 4. INVERTED STAR TRIANGLE ===
        Formula: (n - i + 1) decreases star count on each row.
        Output:
        * * * * *
        * * * *
        * * *
        * *
        *
        */
        System.out.println("=== 4. INVERTED STAR TRIANGLE ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 5. FLOYD'S TRIANGLE ===
        Counter is placed OUTSIDE the loops so it keeps increasing.
        Output:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
        */
        System.out.println("=== 5. FLOYD'S TRIANGLE ===");
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 6. HOLLOW SQUARE ===
        Only print star if on first/last row or first/last column.
        Output:
        * * * * *
        *       *
        *       *
        *       *
        * * * * *
        */
        System.out.println("=== 6. HOLLOW SQUARE ===");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // empty middle
                }
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 7. SOLID CENTERED PYRAMID ===
        Spaces decrease (n - i), stars increase odd (2 * i - 1).
        Output:
            *
          * * *
        * * * * *
        */
        System.out.println("=== 7. SOLID CENTERED PYRAMID ===");
        int pSize = 3;
        for (int i = 1; i <= pSize; i++) {
            for (int s = 1; s <= (pSize - i); s++) { // spaces
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) { // odd stars
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        /*
        === 8. STAR DIAMOND ===
        Top pyramid (1 to size) + bottom pyramid mirror (size - 1 down to 1).
        Output:
            *
          * * *
        * * * * *
          * * *
            *
        */
        System.out.println("=== 8. STAR DIAMOND ===");
        int size = 3;

        // Top half
        for (int i = 1; i <= size; i++) {
            for (int s = 1; s <= (size - i); s++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Bottom half
        for (int i = size - 1; i >= 1; i--) {
            for (int s = 1; s <= (size - i); s++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
