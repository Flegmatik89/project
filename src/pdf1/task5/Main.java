package pdf1.task5;

/*
Даны 3 целых числа. Найти количество положительных и отрицательных
чисел в исходном наборе.
 */

public class Main {
    public static void main(String[] args) {
        int numberone = -1;
        int numbertwo = -2;
        int numberthree = -3;

        if (numberone >= 0) {
            if (numbertwo >= 0) {
                if (numberthree >= 0) {
                    System.out.println("You have 3 positive numbers and 0 negative numbers");
                }
                else {
                    System.out.println("You have 2 positive numbers and 1 negative number");
                }
            }
            else if (numbertwo < 0) {
                if (numberthree >= 0) {
                    System.out.println("You have 2 positive numbers and 1 negative number");
                }
                else {
                    System.out.println("You have only 1 positive number and 2 negative numbers");
                }
            }
        }
        else if (numberone < 0){
            if (numbertwo >= 0) {
                if (numberthree >= 0) {
                    System.out.println("You have 2 positive numbers and 1 negative number");
                }
                else {
                    System.out.println("You have only 1 positive number and 2 negative numbers");
                }
            }
            else if (numbertwo < 0) {
                if (numberthree >= 0) {
                    System.out.println("You have only 1 positive number and 2 negative numbers");
                }
                else {
                    System.out.println("You have 3 negative numbers and 0 positive numbers");
                }
            }
        }
    }
}