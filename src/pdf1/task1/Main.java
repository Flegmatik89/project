package pdf1.task1;

/*
В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
 */

public class Main {
    public static void main(String[] args) {
        int number = 0;
        String mynumber = Integer.toString(number);
        if (number >= 0 && mynumber.length() == 1) {
            System.out.println(mynumber + " it is single positive number");
        } else if (mynumber.length() == 2){
            System.out.println(mynumber + " it is two-digit positive number");
        } else if (mynumber.length() == 3){
            System.out.println(mynumber + " it is three-digit positive number");
        } else {
            System.out.println(mynumber + " number has a many digits");
        }
    }
}