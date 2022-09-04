package pdf1.task5;

/*
Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
 */

public class Main {
    public static void main(String[] args) {
        int numberOne = 0;
        int numberTwo = -2;
        int numberThree = 3;
        int[] array = {numberOne, numberTwo, numberThree};
        int positiveNumber = 0;
        int negativeNumber = 0;

        for (int i : array) {
            if (i > 0) {
                positiveNumber++;
            } else if (i < 0) {
                negativeNumber++;
            }
        }
        System.out.println("amount positive numbers are " + positiveNumber + " and amount negative numbers are " +
                negativeNumber);
    }
}