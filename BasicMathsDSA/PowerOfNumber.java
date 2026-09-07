package BasicMathsDSA;

public class PowerOfNumber {
    static void main() {
        int base = 10, exp = 3;//(a^b)
int result=1;
        while(exp!=0)
        {
            result*=base;
            exp--;
        }
        System.out.println("Answer--> "+result);
    }


}
