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
        String myNumber = Integer.toString(number);
        int positiveNumber = 0;
        int negativeNumber = 0;

        if (number > 0) {
            positiveNumber = number;
            switch (myNumber.length()){
                case 1:
                    System.out.println(positiveNumber + " it is single positive number");
                    break;
                case 2:
                    System.out.println(positiveNumber + " it is two-digit positive number");
                    break;
                case 3:
                    System.out.println(positiveNumber + " it is three-digit positive number");
                    break;
                case 4:
                    System.out.println(positiveNumber + " number has a many digits");
                    break;
            }
        } else if (number < 0) {
            negativeNumber = number;
            switch (myNumber.length() - 1){
                case 1:
                    System.out.println(negativeNumber + " it is single negative number");
                    break;
                case 2:
                    System.out.println(negativeNumber + " it is two-digit negative number");
                    break;
                case 3:
                    System.out.println(negativeNumber + " it is three-digit negative number");
                    break;
                case 4:
                    System.out.println(negativeNumber + " number has a many digits");
                    break;
            }
        } else {
            System.out.println("You have entered zero!");
        }
    }
}