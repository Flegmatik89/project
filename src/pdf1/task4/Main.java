package pdf1.task4;

/*
Даны 3 целых числа. Найти количество положительных чисел в исходном
наборе.
 */

public class Main {
    public static void main(String[] args) {
        int numberone = -123;
        int numbertwo = -234;
        int numberthree = -3453;

        if (numberone >= 0 && numbertwo >= 0 && numberthree >= 0) {
            System.out.println("You have 3 positive numbers");
        } else if (numberone >= 0 && numbertwo >= 0 && numberthree < 0) {
            System.out.println("You have only 2 positive numbers");
        } else if (numberone >= 0 && numbertwo < 0 && numberthree < 0) {
            System.out.println("Just only 1 positive number");
        } else {
            System.out.println("You don't have positive numbers");
        }
    }
}
