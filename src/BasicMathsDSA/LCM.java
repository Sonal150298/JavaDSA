package src.BasicMathsDSA;

public class LCM {
    static void main() {
        //LCM*HCF=a*b-->LCM=(a*b)/GCD or HCF

        int a = 18, b = 12;

        int prod = a * b;
        System.out.println("product of (a,b)---->" + prod);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        int gcd = a;
        System.out.println("GCD/HCF of (a,b)---->" + gcd);
        int lcm = prod / gcd;
        System.out.println("LCM of (a.b)---->" + lcm);

    }
}
