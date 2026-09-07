package BasicMathsDSA;

public class IfPrimeNumber {
    static void main() {
        int n=11;
        boolean isPrime=true;
        if(n<=1) {
            isPrime=false;

        }
        else {
            for (int i = 2; i <n ; i++) {
                if(n%i==0){
                   isPrime=false;
                   break;
                }
            }

        }
        if(isPrime)
            System.out.println("Number is  Prime-->" +n);
        else
            System.out.println("Number is  Not Prime-->" +n);
    }
}
