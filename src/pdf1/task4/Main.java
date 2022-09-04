package pdf1.task4;

/*
Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.
 */

public class Main {
    public static void main(String[] args) {
        int numberOne = -123;
        int numberTwo = 234;
        int numberThree = -3453;
        int[] array = {numberOne, numberTwo, numberThree};
        int amount = 0;

        for (int i : array) {
            if (i > 0) {
                amount++;
            }
        }
        System.out.println(amount);
    }
}
