package pdf2.task6;

/*
Напишите программу вывода всех четных чисел от 2 до 100
включительно
 */

public class Main {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 2; i <= 100; i = i + 2){
            number = i;
            System.out.println(number);
        }
    }
}
