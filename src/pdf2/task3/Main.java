package pdf2.task3;

/*
Вычислить: 1+2+4+8+…+256
 */

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 256; i = i * 2) {
            sum += i;
        }
        System.out.println("Sum will be equal: " + sum);
    }
}
