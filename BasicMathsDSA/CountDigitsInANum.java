package BasicMathsDSA;

public class CountDigitsInANum {
    public static void main(String[] args) {
        int n=987654320;
        int count=0;
        int r=1;
        while(n>0)
        {
            n=n/10;
            count++;
        }
        System.out.println("Number of digits-->"+count);
    }
}
