package src.BasicMathsDSA;

public class GCD_HCF {
    static void main() {
        int a = 180, b = 12;
        //find the GCD/HCF gcd(a,b)=gcd(b,a%b)--Euclidean Algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("GCD/HCF of (a,b)--->" + a);
    }
}
