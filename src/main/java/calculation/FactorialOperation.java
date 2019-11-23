package calculation;

public class FactorialOperation {
    private int firstNumber;

    public FactorialOperation(int firstNumber) {

        this.firstNumber = firstNumber;
    }

    int fact(int firstNumber){
        int result = 1;
        for (int i = 1; i <= this.firstNumber; i++){
            result = result*i;

        }
        return result;
    }
}

