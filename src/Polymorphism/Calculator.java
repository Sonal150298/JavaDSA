package src.Polymorphism;

public class Calculator {

    int add( int a, int b){
        return a+b;
    }

    //overloading method
    int add(int a,int b ,int c){
        return a+b+c;

    }

    double add(int a,int b,double c)
    {
        double sum= (a+b+c);
        return sum;
    }
}
