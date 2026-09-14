import java.util.Arrays;
//ln40 imp for create
// display value of array ln22-35
public class arr {
    public static  void main(String[] args)
    {
        int[] id={1,2,3,4,5};
        id[0]=6; //new value replacement too
        System.out.println("id:"+id);
        // issues it dotn dispaly the array value so
        //This happens because Java does not automatically convert arrays into a readable text format when you print them directly.
        // Instead, it prints the memory address hashcode of the array object.
        System.out.println("id: " + Arrays.toString(id));

        int[] ids = {1, 2, 3, 4, 5};

        System.out.println("ids: ");
        for (int num : ids) {
            System.out.print(num + " \n"); // Prints numbers separated by spaces
        }
// Output: id: 1 2 3 4 5

        int[] idss = {1, 2, 3, 4, 5};

        for (int num : idss) {
            System.out.println("Value: " + num);
        }
/* Output:
   Value: 1
   Value: 2
   Value: 3 ... */

//double of array
        double[] timestamp={1.1,1.2,1.3,1.4,1.5};
        System.out.println(Arrays.toString(timestamp));


        //1. Provide all values at once (Java sets the size automatically)


        int[] sets = {1, 2, 3, 4};
        // Automatically makes a size-4 array
        //2. Set the size first, then add values one by one using the index
        System.out.println(Arrays.toString(sets));

        int[] set = new int[4]; // Makes a size-4 array filled with zeros

        set[0] = 1;  // Puts 1 in the first box
        set[1] = 2;  // Puts 2 in the second box
        set[2] = 3;
        set[3] = 10;
        System.out.println(Arrays.toString(set));


    }
}
