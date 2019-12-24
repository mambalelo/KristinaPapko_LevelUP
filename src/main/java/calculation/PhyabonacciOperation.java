package calculation;

public class PhyabonacciOperation {
    public static int fibo(int number) {
        if (number <= 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else if (number == 2) {
            return 1;
        } else {
            return fibo(number - 1) + fibo(number - 2);
        }
    }

}

