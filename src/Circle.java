import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        System.out.println("Введіть радіус кола для розрахунку його площі: ");
        Scanner circleRadius = new Scanner(System.in);
        final double PI = 3.14;    // константа Р = зі значенням 3.14
        double r = circleRadius.nextDouble();   // радіус кола вноситься самостійно
        double S = PI*(r*r);    // формула площі кола - πR2
        System.out.println("Площа круга виміряна за формулою πR2 з числа " + r + " складає " + S);    // вивод в консоль
    }
}
