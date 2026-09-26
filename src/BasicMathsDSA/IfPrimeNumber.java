package src.BasicMathsDSA;

public class IfPrimeNumber {
    static void main() {
        int num=4;
        if(CheckIfPrime(num))
            System.out.println("Prime Number"+num);
        else
            System.out.println("Not Prime"+ num);


     }
     static boolean CheckIfPrime(int num)
     {   boolean prime=true;
         for (int i = 2; i*i <= num; i++) {
             if(num%i==0)
                 prime=false;


         }
         return  prime;
     }
}
