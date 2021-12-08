package chapter4;

import java.util.Scanner;

public class AddTwoNo {
    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("enter first number:");
        int first = sc.nextInt();
        System.out.print("enter second number:");
        int second =sc .nextInt();
        int result = addTwoNo(first , second);
        System.out.println("sum is" + result);

    }

    public static int addTwoNo (int first ,int second){
    int result = first + second ;
    return result ;


    }
}
