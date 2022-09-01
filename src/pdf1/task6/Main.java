package pdf1.task6;

/*
Даны 2 числа. Вывести большее из них.
 */

public class Main {
    public static void main(String[] args) {
        int firstnumber = 35;
        int secondnumber = 35;
        if (firstnumber > secondnumber) {
            System.out.println( firstnumber + " is more");
        } else if (firstnumber == secondnumber) {
            System.out.println( firstnumber + " is equal with " + secondnumber);
        } else {
            System.out.println( secondnumber + " is more");
        }
    }
}
