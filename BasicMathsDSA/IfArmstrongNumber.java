package BasicMathsDSA;

public class IfArmstrongNumber {
    static void main() {
        int n = 153;
        int r = 1;
        int sum = 0;
        int orig = n;
        while (n > 0) {

            int digit = n % 10;
            System.out.println("digit-->" + digit);
            sum = digit * digit * digit;
            n = n / 10;
        }
        System.out.println("sum of cubes->" + sum);
        if (orig == sum)
            System.out.println("Number is Palindrom--->" + sum);
        else
            System.out.println("Number is not Palindrom---->" + sum);
    }
}
