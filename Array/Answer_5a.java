package Array;

import java.util.Scanner;

public class Answer_5a {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the row");
        int n= sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*  ");

            }
            System.out.println("");
        }
    }
}
