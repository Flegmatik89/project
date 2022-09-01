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
        int variable = 111;
        String str = Integer.toString(variable);
        int lastPart;
        if (variable >= 10) {
            lastPart = Integer.parseInt(str.substring(str.length() - 2));
        } else {
            lastPart = variable;
        }

        if (lastPart >= 5 && lastPart <= 20 || str.endsWith("0")) {
            System.out.println(variable + " программистов");
        } else if (lastPart < 5 && lastPart > 1) {
            System.out.println(variable + " программиста");
        } else if (str.endsWith("1")){
            System.out.println(variable + " программист");
        }

    }
}
