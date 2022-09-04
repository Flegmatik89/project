package pdf1.task1;

/*
В переменную записываем число. Надо вывести на экран сколько в этом
числе цифр и положительное оно или отрицательное. Например, "это
однозначное положительное число". Достаточно будет определить, является ли
число однозначным, "двухзначным или трехзначным и более.
 */

public class Main {
    public static void main(String[] args) {
        int number = -1000;
        int convertedNumber = number;
        String positiveOrNegativePart = "";
        String digitsCountMessage = "";

        if (number == 0) {
            System.out.println("You have entered zero!");
        } else {
            if (number > 0) {
                positiveOrNegativePart = "positive number";
            } else if (number < 0) {
                convertedNumber = Math.abs(number);
                positiveOrNegativePart = "negative number";
            }

            String myNumber = Integer.toString(convertedNumber);

            switch (myNumber.length()) {
                case 1:
                    digitsCountMessage = " is single ";
                    break;
                case 2:
                    digitsCountMessage = " is two-digit ";
                    break;
                case 3:
                    digitsCountMessage = " is three-digit ";
                    break;
                default:
                    digitsCountMessage = " has more than 3 digits ";
            }
            System.out.println(number + digitsCountMessage + positiveOrNegativePart);
        }
    }
}