package pdf1.task2;

/*
Треугольник существует только тогда, когда сумма любых двух его сторон
больше третьей. Определить существует ли такой треугольник. Дано: a, b, c –
стороны предполагаемого треугольника. Требуется сравнить длину каждого
отрезка-стороны с суммой двух других. Если хотя бы в одном случае отрезок
окажется больше суммы двух других, то треугольника с такими сторонами не
существует.

 */

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;
    if (a + b > c && a + c > b && b + c > a) {
        System.out.println("Triangle exists");
    } else if (a + b == c || a + c == b || b + c == a) {
        System.out.println("It is isosceles triangle");
    } else {
        System.out.println("Triangle doesn't exist");
    }

    }
}
