
package Array;




















import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        Scanner sc = new
                Scanner(System.in);
        int[] arr;
        arr = new int[5];

        for (int i = 0; i < arr.length;i++)
        {
            System.out.println("enter a number"  );
            arr[i]= sc.nextInt();

        }
        System.out.print("the values are :");
        for (int i=0; i<arr.length; i++)
        {


            System.out.println(arr[i]);
            if (arr[i]%2==0)
            {
                System.out.println(arr[i] + " is even number.");
                
            }
            else
            {
                System.out.println(arr[i]+ " is odd. " );


            }


                    )

        }


    }
}
