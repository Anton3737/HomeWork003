import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {
        System.out.println("Введіть радіус: ");
        Scanner radius = new Scanner(System.in);    // радиус
        double R = radius.nextDouble();
        System.out.println("Введіть висоту: ");
        Scanner haight = new Scanner(System.in);
        final double PI = 3.14;
        double h = haight.nextDouble();                        // висота циліндра
        double V = PI* ((R * R) * h);                      // S площа

        System.out.println("Об'єм циліндру за формулою V = πR2 h складає " + V);
        System.out.println();
        double S = 2 * ((PI * R) *(h + R));
        System.out.println("Площа всієї поверхні циліндру за формулою S = 2πR(h + r) складає " + S);
    }
}



//    Используя IntelliJ IDEA, создайте класс Volume. Напишите программу расчета объема
//        - V и площади поверхности -S цилиндра. Объем V цилиндра радиусом – R и высотой – h, вычисляется по формуле:
//        V = πR2 h
//        Площадь S поверхности цилиндра вычисляется по формуле: S = 2πR2 + 2πR2 = 2πR(R+h) Результаты расчетов выведите на экран.

