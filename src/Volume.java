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

