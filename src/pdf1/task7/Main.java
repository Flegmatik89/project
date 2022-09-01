package pdf1.task7;

/*
В переменную записываете количество программистов. В
зависимости от количества программистов необходимо вывести правильно
окончание. Например:
• 2 программиста
• 1 программист
• 10 программистов
• и т.д
 */

public class Main {
    public static void main(String[] args) {
        int variable = 116;
        String str = Integer.toString(variable);


        if (str.endsWith("20") || str.endsWith("19") || str.endsWith("18") || str.endsWith("17") ||
                str.endsWith("16") || str.endsWith("15") || str.endsWith("14") || str.endsWith("13") ||
                str.endsWith("12") || str.endsWith("11") || str.endsWith("10") || str.endsWith("9") ||
                str.endsWith("8") || str.endsWith("7") || str.endsWith("6") || str.endsWith("5") ||
                str.endsWith("0")) {
            System.out.println(variable + " программистов");
        } else if (str.endsWith("4") || str.endsWith("3") || str.endsWith("2")) {
            System.out.println(variable + " программиста");
        } else if (str.endsWith("1")){
            System.out.println(variable + " программист");
        }

    }
}
