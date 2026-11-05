public class ARRAYS2 {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 40,50};
//enhanced for loop(for each)
        // for( dt var:arr var)
        //for each/enhaced for used as read array elements
        for (int number : num) {
            System.out.println(number);
        }
        // note for each is unoffical name and its offical is enhanced for loop


        //jagged traversal array
        int[][] jagged = {
                {10, 20, 30},
                {40, 50},
                {60, 70, 80, 90}
        };
        /*
        Remember:
- jagged.length = number of rows.
- jagged[i].length = number of elements in the current row.
         */
    }
}
