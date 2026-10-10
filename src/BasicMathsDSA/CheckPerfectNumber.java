package src.BasicMathsDSA;

public class CheckPerfectNumber {

    static void main() {
        int num=36, sum=1;
        for (int i = 2; i*i<=num ; i++) {

            if (num%i == 0) {
               int first_factor=i;
               int second_factor=num/i;
               sum+=first_factor+second_factor;
            }
        }
        System.out.println(num+"---"+sum);
        if (num==sum)

            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}
