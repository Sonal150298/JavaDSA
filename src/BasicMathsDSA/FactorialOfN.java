package src.BasicMathsDSA;

public class FactorialOfN {
    static void main() {
        int num = 5, fact = 1;
        while (num > 1) {
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial of number--" + fact);
    }
}
