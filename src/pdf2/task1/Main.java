package pdf2.task1;

/*
Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
суммарный путь пробежит спортсмен за 7 дней?
 */

public class Main {
    public static void main(String[] args) {
        double oneDayDistance = 10;
        int week = 7;
        double distance = 0;

        for (int i = 0; i < week; i++) {
            distance += oneDayDistance;
            oneDayDistance = 1.1 * oneDayDistance;
        }
        System.out.println(distance);
    }
}
