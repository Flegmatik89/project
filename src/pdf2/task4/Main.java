package pdf2.task4;

/*
Составьте программу, вычисляющую A*B, не пользуясь операцией
умножения.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i != a; i++){
            sum += b;
        }
        System.out.println(a + " * " + b + " = " + sum);
    }
}
