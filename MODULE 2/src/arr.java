import java.util.Arrays;

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


    }
}
