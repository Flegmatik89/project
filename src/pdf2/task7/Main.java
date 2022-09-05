package pdf2.task7;

/*
Напишите программу, определяющую сумму всех нечетных чисел от 1
до 99
 */

public class Main {
    public static void main(String[] args) {
//        int number = 0;
//        for (int i = 1; i < 100; i = i + 2) {
//            number += i;
//        }
//        System.out.println("Sum is equal - " + number);

        int commonDifference = 2;
        int amount = ((99 - 1) / commonDifference) + 1;
        int sum = ((1 + 99) * amount) / 2;
        System.out.println("Sum is equal - " + sum);
    }
}
