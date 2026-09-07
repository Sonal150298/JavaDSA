package BasicMathsDSA;

public class IfPallindromeNumber {
    static void main() {
        int n=121,rev=0;
        int num=n;
        while(n>0)
        {
            int digit=n%10;//1234%10->4//123%10->3//12%10->2//1%10->1
            rev=rev*10+digit;//0x10+4->4(rev)//4x10+3->43//43x10+2->432//432x10+1->4321
            n=n/10;//123//12//1
        }
        if(rev==num)
        System.out.println("Given number is Pallindrome" + rev);
    }
}
