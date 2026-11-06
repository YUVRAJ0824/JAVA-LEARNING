
import java.util.Arrays;

public class ARRAYS1 {

    public static void main(String[] args) {

// min,max,sum,avg,sort,search,traversal == array operations
        //ascending  small to big
        //descending  big to small

      /*
JAVA ARRAYS

An array stores multiple values of the same data type
using a single variable.

Visual example:
Array: marks

Index    0       1       2       3       4
      +-------+-------+-------+-------+-------+
Value |  70   |  80   |  90   |  85   |  75   |
      +-------+-------+-------+-------+-------+

Index starts at 0, so the last index is length - 1.
Har box ek element store karta hai.

1. Basic Array Operations
   - Traversal
   - Access
   - Update
   - Searching
   - Sorting
   - Minimum / Maximum
   - Sum / Average
   - Insertion / Deletion (with fixed-size limitations)

2. Array Properties and Utilities
   - length — array field.
   - Arrays.toString() — display array contents.
   - Arrays.sort() — sorting utility method.
   - Arrays.equals() — compare array contents.
   - Arrays.fill() — fill array elements.
   - Arrays.copyOf() — create a copied array.
*/
        //create
        // 1.method -normal
        // auto sizing,filled by zero for default values,cant by empty

        //int[]marks={}; wrong

        int[] marks1={10,20,0,40};
        //solo asign/update
        marks1[2]=30; // 0 into 30 at index 2
        //array is 10,20,30,40


        //method 2- method style
        //pre fixed size,manual assigin,empty is replaced with default values

        //int[] marks2=new int[]; wrong - array dimension  missing error

        int[] marks2=new int[5];
        System.out.print(marks2);//print address of arrays
        marks2[0]=10;
        marks2[2]=30;

        System.out.print("\n before missed index 1,3,4 :"+Arrays.toString(marks2));

        marks2[1]=20;
        marks2[3]=40;
        System.out.print("\n After missed index 1,3 :"+Arrays.toString(marks2));

        //display array elements 2 ways


        //solo elements - using index
        System.out.println("\nmarks2 index 2:"+marks2[2]); //index 2 value of array marks2

        //1.solo elements but repeated  using for loop way =one ele one line until all displayed
        for(int i=0;i<marks2.length;i++)
            System.out.println(marks2[i]);
        //marks2.length == array property(field)

//a String uses name.length() (method), whereas an array uses marks.length (field)

        //2.display all elements in one line format= toString method -easy
        System.out.println("one line display (array format):"+Arrays.toString(marks1));
        // Arrays.toString() static method by import util.Arrays package
        //here Arrays =utility class

        /* IMP
 Expression             What it is
marks.length            Array field
marks.length()          Invalid
Arrays.length           Invalid
Arrays.toString(marks)  Static method
Arrays.sort(marks)      Static method


length → Field

sort() → Static method

Sorting → Operation

Arrays → Utility class

*/



//Arrays.sort() is a method

        //1. count array element -using .length
        System.out.println("size of array is:"+marks1.length);
        // size of array  count is given

        //2. Arrays.sort(array-name)
        int[] random={2,5,6,6,7,8,0};
        Arrays.sort(random); //return type so display using for-len or a.tostr method
        System.out.println("array sort"+Arrays.toString(random));
        //gives ascending order array elements


        // if sort is needed in descending order for array
        //we use wrapper obj --future learning


        System.out.print("\n");
        // largest and smallest elements in an array (min,max)
        System.out.print("arrays was 10,30,20,40 \n");
        //largest   >=,>
        int[] max={10,30,20,40};
        int large=max[0];

        for(int i=1;i<max.length;i++) {
            if (max[i] >= large) {
                large = max[i];
            }
        }
        System.out.println("largest element in array:"+large);
        System.out.print("\n");
//:: rule change signs at for and if section
        //smallest  <=,<
        int[] min={10,30,20,40};
        int small=max[0];

        for(int i=1;i>min.length;i++) {
            if (min[i] <= large) {
                small = min[i];
            }
        }
        System.out.println("small element in array:"+small);
        System.out.print("\n");

        //sum of array
        int[] add={10,30,20,40};
        System.out.println("add={10,30,20,40}");
        int sum=0;
        for(int i=1;i<add.length;i++)
        {
            sum=sum+add[i];
        }

        System.out.println("sum element in array:"+sum);

        /*

Average = Sum/Number of elements
Here:
Average = 100/4 = 25
         */

        //avg of array elements

        int[] numbers = {10,30,20,40};
        int sums = 0;

        for (int i = 0; i < numbers.length; i++) {
            sums = sums + numbers[i];
        }
        //why we took above code(array and sum) as we need to sum array then do avg due to formula so

        double average = (double) sums / numbers.length;
        //Why (double)?
        //If both operands//values are inte, Java performs integer division.so we need 0.0 not 0 only so
        System.out.println("avg of array is:"+average);

        // avg=sum/array-size ,sum=add of array elements tho so

        //recap is bal tho



        //2d array
        int[][] two_d=new int[5][5];
        //two_d[i][j]
        //i=row,j=col
        //int[row][col]

        two_d[1][0]=10;
        two_d[0][1]=01;
System.out.println(two_d[1][0]);
        for(int i=0;i< two_d.length;i++) //count rows
            for(int j=0;j<two_d.length;j++)
            System.out.print(" "+two_d[i][j]);
        System.out.print("\n ______");
        System.out.println("2d display using deepToString():"+Arrays.deepToString(two_d));

//A Jagged Array means each row can have a different number of columns (elements).
       // int[][] jagged=new int[3][];
       // so the block size changed into big mid small etc so ?


        int[][] jagged = new int[3][];

        jagged[0] = new int[5]; // Big row
        jagged[1] = new int[2]; // Small row
        jagged[2] = new int[3]; // Medium row
System.out.print("jagged");
        System.out.println(Arrays.deepToString(jagged));
// jagged has empty i so we put tostr();

        System.out.println(Arrays.toString(jagged[0]) + "\n"
                + Arrays.toString(jagged[1]) + "\n"
                + Arrays.toString(jagged[2]));
        System.out.print(Arrays.toString(jagged[0]));// single row display

        //deepToString=handles  nested(i,j) based arrays
//due more then on var etc o we do deeptoString so  and in deep t is caps where normal is t is samll

   /*
What you're printing	              Data type	Method
One normal array	                    int[]	Arrays.toString()
One row of a 2D array	                int[]	Arrays.toString()
Complete 2D array	                 int[][]	Arrays.deepToString()
Complete Jagged Array	             int[][]	Arrays.deepToString()
    */

    }
}
