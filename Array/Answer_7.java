package Array;

import java.util.Scanner;

public class Answer_7{



    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input floating-point number: ");
        float x=sc.nextFloat();

        System.out.print("Input floating-point another number: ");
        float y=sc.nextFloat();

        x = Math.round(x * 1000);
        x = x / 1000;

        y = Math.round(y * 1000);
        y = y / 1000;

        if (x == y)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}