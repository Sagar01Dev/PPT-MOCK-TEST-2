package MockTest2PPT;

import java.util.*;

public class pptOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Number : ");
        int num = sc.nextInt();
        System.out.println();

        if (num == 0) {
            System.out.println("Enter number is Zero");

        } else if (num < 0) {
            System.out.println("Enter Number is Negative");
        } else {
            System.out.println("Enter number is positive");
        }

    }

}
