package chapter4;

import java.util.Scanner;

public class HighestLowest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number:");
        int first = sc.nextInt();
        System.out.print("enter second number:");
        int second = sc.nextInt();
        System.out.print("enter third number:");
        int third = sc.nextInt();
        int highest = findHighest(first, second, third);
        System.out.println("highest" + highest);
    }

    public static int findHighest(int first, int second, int third) {

        int highest;
        if (first > second && first > third)
            highest = first;
        else if (second > first && second > third)
            highest = second;
        else
            highest = third;
        return highest;


    }
}
