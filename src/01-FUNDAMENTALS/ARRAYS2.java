import java.util.Arrays;

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

        //Arrays.equals() =method

        int[] a={10,20,30};
        int[] b={10,50,60};
        int[] c={10,20,30};
        System.out.println(Arrays.equals(a,b));
        //check if both arrays elements are same value or not
        System.out.println(Arrays.equals(a,c));

        //Arrays.fill() method =used to fill out array with same value into all elements
        int marks[]=new int[5];
        System.out.println("before fill method:"+Arrays.toString(marks));
        //int default is zero 0 so
        //Arrays.fill(arr name,value);
        Arrays.fill(marks,69);
        System.out.println("after fill method:"+Arrays.toString(marks));
        //Arrays.copyof();=used to copy org arr values into 2nd arr and aldo decide size of arr too
        int[]  org=new int[3];
        int[] cpy= Arrays.copyOf(org,4);
        System.out.println("cpy method 1"+Arrays.toString(cpy));
        //Arrays.copyOf(org arr,size of arr)
        // can change 2nd arry size too so
        /*
int[] original = {10, 20, 30};
int[] copy;
copy = Arrays.copyOf(original, 3);    is both same ways to assign copy values
         */
        int[] copy = new int[3];

        copy = Arrays.copyOf(org, 3);
        System.out.println("cpy method 2"+Arrays.toString(copy));


        //What happens? when
        //The old contents of copy are replaced by a reference to the newly created array.
        int[] original = {10, 20, 30};
        int[] copyy = {30, 40, 50};

        copyy = Arrays.copyOf(original, 3);
        //replaced old values with new values
        System.out.print("cpy method 3"+Arrays.toString(copyy));
    }
}
