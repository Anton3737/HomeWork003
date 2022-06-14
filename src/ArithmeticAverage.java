import java.util.Scanner;

public class ArithmeticAverage {
    public static void main(String[] args) {
        System.out.println("Введіть 3 інтович цілочислених числа: ");
        Scanner in = new Scanner(System.in);
        double A = in.nextInt();
        double B = in.nextInt();
        double C = in.nextInt();

        int resaultVarInt = (int) ((A + B + C)/3);        // при виведенні середнього числа із 3х цилочислених  результат буде int без врахування залишку після коми
        //String resaultVarStr = (A + B + C)/3;      // вивести результат в консоль при використанні типу даних String без додаткових операцій неможна
        double resaultVarDoubl = (A + B + C)/3;   // При введені 3х цілих числаі виведення їх через тип даних Double виведе результат із залишком
        // Float resaultVarFloat = ((A + B + C)/3);   // Float не виведе в консоль дана , необхідно змінювати ТД результату на інший INT / Double
       // char resaultVarChar = (A + B + C)/3;         // Char не виведе результат операції в консоль
        short resaultVarShort = (short) ((A + B + C)/3);  // Тип даних Short виведе дані до коми так же само як і int але містить в 2 рази бальше памяті
        long resaultVarLong = (A + B + C)/3;          // Для виведення операцї необхідно long замінити на Double - бо він містить більше памяті
       // boolean resaultVarBool = (A + B + C)/3;   // Boolean не виведе результат числового розрахунку

        System.out.println(resaultVarInt);
        System.out.println(resaultVarStr);
        System.out.println(resaultVarDoubl);
        System.out.println(resaultVarFloat);
        System.out.println(resaultVarChar);
        System.out.println(resaultVarShort);
        System.out.println(resaultVarLong);
        System.out.println(resaultVarBool);


    }
}
