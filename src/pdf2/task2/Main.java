package pdf2.task2;

/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
 */

public class Main {
    public static void main(String[] args) {
        int amoebaCount = 1;
        for (int i = 3; i <= 24; i = i + 3){
            amoebaCount *= 2;
            System.out.println("Amoeba count is " + amoebaCount + " after " + i + " hours");
        }
    }
}
