public class InterviewShapePatterns {
    public static void main(String[] args) {

        /*
        JAVA PATTERN PROGRAMMING — ROADMAP & CHEAT SHEET

        LOOP LOGIC:
        - Outer loop (i) = rows down
        - Spaces loop (s) = spaces pushing right: (n - i)
        - Inner loop (j) = columns / symbols across
        - print() continues on same line, println() moves to next line

        USEFUL FORMULAS (1-based rows):
        - Right-angled triangle:  j <= i
        - Inverted triangle:      j <= (n - i + 1)
        - Pyramid spaces:         s <= (n - i)
        - Pyramid stars (odd):    j <= (2 * i - 1)
        - Inverted pyramid:       spaces = (i - 1), stars = 2 * (n - i) + 1
        - Increasing numbers:     print(j)
        - Repeating numbers:      print(i)
        - Floyd's counter:        print(counter++)
        - Hollow shapes:          if (i==1 || i==n || j==1 || j==cols) print("* "), else print("  ")

        FULL 21-PATTERN ROADMAP:

        Tier 1 — Basic shapes and loop fundamentals (CURRENT PRACTICE: 1-8)
          1. Solid square
          2. Solid rectangle
          3. Right-angled triangle
          4. Inverted right-angled triangle
          5. Increasing number triangle
          6. Repeated-number triangle
          7. Floyd’s triangle
          8. Centered pyramid

        Tier 2 — Intermediate shapes and variations (NEXT UP: 9-15)
          9. Inverted centered pyramid
          10. Diamond
          11. Mirrored right triangle
          12. Number pyramid
          13. Alphabet triangle
          14. Increasing/decreasing number patterns
          15. Symbol variations (#, +, -)

        Tier 3 — Advanced shapes for the future (REFERENCE: 16-21)
          16. Hollow square and rectangle
          17. Hollow pyramid
          18. Butterfly pattern
          19. Hourglass
          20. Pascal’s triangle
          21. Mixed number and symbol patterns

        CURRENT GOAL: Master patterns 1-8 below, then move to Arrays.
        */

        int n = 5;


        // --- TIER 1 IMPLEMENTATION (PATTERNS 1 - 8) ---

        // 1. SOLID SQUARE
        // Fixed rows and columns (n x n)
        // Output:
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        System.out.println("1. SOLID SQUARE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // 2. SOLID RECTANGLE
        // Different row and column counts (e.g. 4 rows, 6 cols)
        // Output:
        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *
        System.out.println("2. SOLID RECTANGLE");
        int rows = 4, cols = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // 3. RIGHT-ANGLED TRIANGLE
        // Increase symbols in each row (row i has i stars)
        // Output:
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        System.out.println("3. RIGHT-ANGLED TRIANGLE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // 4. INVERTED RIGHT-ANGLED TRIANGLE
        // Decrease symbols in each row: j <= (n - i + 1)
        // Output:
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        System.out.println("4. INVERTED RIGHT-ANGLED TRIANGLE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i + 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();


        // 5. INCREASING NUMBER TRIANGLE
        // Print the column number 'j' (1 to i)
        // Output:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        System.out.println("5. INCREASING NUMBER TRIANGLE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();


        // 6. REPEATED-NUMBER TRIANGLE
        // Print the row number 'i' repeated i times
        // Output:
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        System.out.println("6. REPEATED-NUMBER TRIANGLE");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();


        // 7. FLOYD’S TRIANGLE
        // Continuous counter across rows without resetting
        // Output:
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        System.out.println("7. FLOYD'S TRIANGLE");
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();


        // 8. CENTERED PYRAMID
        // Spaces decrease (n - i), odd stars increase (2 * i - 1)
        // Output:
        //         *
        //       * * *
        //     * * * * *
        //   * * * * * * *
        // * * * * * * * * *
        System.out.println("8. CENTERED PYRAMID");
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= (n - i); s++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


