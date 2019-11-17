package blackbox.calculator;

public class Calculator {
    public int add(int n1,int n2) {
        return n1+n2;
    }

    public int subtract(int n1,int n2) {
        return n1-n2;
    }

    public int modSubtract(int n1,int n2) {
        if(n1>n2)
            return n1-n2;
        return n2-n1;
    }

    public int multiply(int n1,int n2) {
        return n1*n2;
    }

    public int divide(int n1,int n2) throws Exception {
        if(n2==0) {
            throw new Exception("Trying to divide by zero");
        }
        return n1/n2;
    }
}
