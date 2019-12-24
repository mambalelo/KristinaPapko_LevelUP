package calculation;

import java.util.Scanner;
import static calculation.MultiplyOperation.multiply;
import static calculation.PhyabonacciOperation.fibo;
import static calculation.SubtractionOperation.sub;


    public class Calculator {


        public static void main(String[] args) {

            Scanner read = new Scanner(System.in);

            int firstNumber = 0;
            int secondNumber = 0;

            String operation;
            String status;

            System.out.println("Калькулятор поддерживает следующие операции:" );
            System.out.println("сложение (+), вычитание (-), умножение (*), вычисление факториала(!), нахождение числа Фиабоначчи(F)");
            System.out.println("====== Введите первое число ======");
            firstNumber = read.nextInt();
            System.out.println("====== Введите тип операции ======");
            operation = read.next();
            if (!(operation.equals("!") || operation.equals("F"))) {
                System.out.println("====== Введите второе число ======");
                secondNumber = read.nextInt();
            }

            if (operation.equals("+")) {
                SumOperation result = new SumOperation(firstNumber, secondNumber);
                System.out.println("Равно " + result.summ());
            }

            if (operation.equals("-")) {
                System.out.println("Равно " + sub(firstNumber, secondNumber));
            }

            if (operation.equals("*")){
                System.out.println("Равно " + multiply(firstNumber,secondNumber));
            }

            if (operation.equals("!")){
                FactorialOperation factorial = new FactorialOperation(firstNumber);
                System.out.println("Равно " + factorial.fact(firstNumber));
            }

            if (operation.equals("^")){
                ExponentaOperation exponenta = new ExponentaOperation(firstNumber, secondNumber);
                System.out.println("Равно " + exponenta.exp());
            }

            if (operation.equals("F")){
                System.out.println("Равно " + fibo(firstNumber));
            }
            System.out.println();
            System.out.println("====== Программа завершена ======");



        }
}
