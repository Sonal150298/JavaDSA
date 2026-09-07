package BasicMathsDSA;

public class SumOfDigitsInANum {
    public static void main(String[] args) {
        int n=987654320;
        int sum=0;
        int r=1;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;

        }

        System.out.println("Sum of digits-->"+sum);
    }
}
