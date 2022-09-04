package pdf2.task5;

/*
Напишите программу печати таблицы перевода расстояний из дюймов в
сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
 */

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        int inch = 0;
        double cm = 0;
        for (inch = 1; inch <= 20; inch++){
            cm += 2.54;
            String formattedDouble = new DecimalFormat("#0.00").format(cm);
            System.out.println(inch + " inch is equal " + formattedDouble + " centimeters");
        }
    }
}
