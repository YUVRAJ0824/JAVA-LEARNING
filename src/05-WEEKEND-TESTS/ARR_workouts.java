public class ARR_workouts {
    public static void main(String[] args) {
     /*
     Try writing an enhanced for loop that:
1. Prints every mark.
2. Calculates the total sum of all marks.
      */

        int[] marks = {75, 82, 90, 65, 88};
        for(int mark:marks) //read
            System.out.println(mark);

// sum
        //struggled with rember logic for sum but later easy needs recap tho
int sum=0;
        for(int i=0;i< marks.length;i++) {


            sum = sum =+ marks[i];
        }
        System.out.println("sum:"+sum);

        //avg so avg=sum/count
        int avg=sum /marks.length;
        System.out.println("avg:"+avg);

        //largest
        int large=marks[0];
        for(int i=1;i< marks.length;i++)
        {
        if(marks[i]>=large)
        {
            large=marks[i];
        } }
        System.out.println("largest:"+large);

        //small
        int small=marks[0];
        for(int i=1;i<marks.length;i++)
        {
            if(marks[i]<=small)
            {
                small=marks[i];
            } }
        System.out.println("smallest:"+small);





    }
}
