package calculation;

public class SumOperation {

    private double firstNumber;
    private double secondNumber;

    SumOperation(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    double summ(){
        return this.firstNumber+this.secondNumber;
    }
}
