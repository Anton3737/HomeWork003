import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        System.out.println("Введіть операнд1:");
        Scanner operand1 = new Scanner(System.in);
        int A = operand1.nextInt();
        System.out.println("Введіть операнд1:");
        Scanner operand2 = new Scanner(System.in);
        int B = operand2.nextInt();

        int a = A + B;
        System.out.println("Результат арифметичної операції + між операндом№1 <"+A+"> та операндом№2 <"+B+"> складає "+ a);
        int b = A - B;
        System.out.println("Результат арифметичної операції - між операндом№1 <"+A+"> та операндом№2 <"+B+"> складає "+ b);
        int c = A * B;
        System.out.println("Результат арифметичної операції * між операндом№1 <"+A+"> та операндом№2 <"+B+"> складає "+ c);
        float d = A / B;
        System.out.println("Результат арифметичної операції / між операндом№1 <"+A+"> та операндом№2 <"+B+"> складає "+ d);
        double e = A % B;
        System.out.println("Результат арифметичної операції % між операндом№1 <"+A+"> та операндом№2 <"+B+"> складає "+ e);
    }
}
