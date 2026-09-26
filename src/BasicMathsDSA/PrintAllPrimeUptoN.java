package src.BasicMathsDSA;

public class PrintAllPrimeUptoN {
    static void main() {
        int n = 100;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = IfPrimeNumber.CheckIfPrime(i);
            if (isPrime)
                System.out.println(i);

        }

    }

}

