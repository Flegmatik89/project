package pdf1.task4;

/*
Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.
 */

public class Main {
    public static void main(String[] args) {
        int numberone = -123;
        int numbertwo = 234;
        int numberthree = -3453;
        int[] Array = new int[3];
        Array[0] = numberone;
        Array[1] = numbertwo;
        Array[2] = numberthree;
        int amount = 0;

        for (int i : Array) {
            if (i > 0) {
                amount = amount + 1;
            } else {
                amount = amount;
            }
        }
        System.out.println(amount);
    }
}
