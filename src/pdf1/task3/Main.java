package pdf1.task3;

/*
Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на
10. Вывести полученное число.
 */

public class Main {
    public static void main(String[] args) {
        int number = 0;
        if (number > 0) {
            System.out.println("old number is " + number + " and new number is " + (number + 1));
        } else if (number < 0) {
            System.out.println("old number is " + number + " and new number is " + (number - 2));
        } else {
            System.out.println("You have entered zero and new value is " + (number = 10));
        }
    }
}
