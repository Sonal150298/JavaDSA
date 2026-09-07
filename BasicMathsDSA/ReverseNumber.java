package BasicMathsDSA;

public class ReverseNumber {
    static void main() {
        int n=1234,rev=0;
        while(n>0)
        {
            int digit=n%10;//1234%10->4//123%10->3//12%10->2//1%10->1
            rev=rev*10+digit;//0x10+4->4(rev)//4x10+3->43//43x10+2->432//432x10+1->4321
            n=n/10;//123//12//1
        }
        System.out.println("Reversed number = " + rev);
    }
}
