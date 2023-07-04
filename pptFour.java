package MockTest2PPT;

public class pptFour {
    public static void main(String[] args) {
        int a = 70;
        int b = 50;
        int c = 30;
        int largest = a;

        if (b > largest) {
            largest = b;

        }
        if (c > largest) {
            largest = c;
        }

        System.out.print("Largest Number is :" + largest);
    }
}
