package pdf1.task5;

/*
Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
 */

public class Main {
    public static void main(String[] args) {
        int numberone = 1;
        int numbertwo = -2;
        int numberthree = 3;
        int[] array = {numberone, numbertwo, numberthree};
        int positivenumber = 0;
        int negativenumber = 0;

        for (int i : array) {
            if (i > 0) {
                positivenumber = positivenumber + 1;
            } else {
                negativenumber = negativenumber + 1;
            }
        }
        System.out.println("amount positive numbers are " + positivenumber + " and amount negative numbers are " +
                negativenumber);
    }
}