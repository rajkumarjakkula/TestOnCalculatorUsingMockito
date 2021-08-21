public class Calculator {

    ArithmeticOperations arithmetic;

    public Calculator (ArithmeticOperations arithmetic){
        this.arithmetic = arithmetic;

    }
    public double sum(double input1, double input2) {
        return arithmetic.sum(input1,input2);
    }
    public double subtract(double input1, double input2) {
        return input1-input2;
    }
    public double multiply(double input1, double input2) {
        return input1*input2;
    }
    public double divide(double input1, double input2) {
        return input1/input2;
    }
}
