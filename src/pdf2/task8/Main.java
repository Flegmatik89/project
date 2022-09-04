package pdf2.task8;

/*
И ещё можете попрактиковаться и нарисовать оставшиеся 2
треугольника
       *
     * * (1)
   * * *
 * * * *
 * * * *
   * * * (2)
     * *
       *
 */

public class Main {
    public static void main(String[] args) {
        int maxSymbols = 4;

        for (int i = 0; i <= maxSymbols; i++) {

            for (int k = maxSymbols; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

//            for (int k = maxSymbols; k >= i; k--) {
//                System.out.print(" ");
//            }

            System.out.println(" ");
        }
        for (int i = maxSymbols; i >= 0; i-- ) {

            for (int k = maxSymbols; k > i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

//            for (int k = maxSymbols; k > i; k--) {
//                System.out.print(" ");
//            }

            System.out.println(" ");

        }
    }
}
