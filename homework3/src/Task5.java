import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] mass_1 = new int[5];
        int[] mass_2 = new int[5];
        double a = 0;
        double b = 0;

        System.out.println("Массив первый ");
        for (int i = 0; i < mass_1.length; i++) {
            mass_1 [i] = r.nextInt(16);
            System.out.print(mass_1 [i] + " ");
            a += mass_1 [i];
        }
        System.out.println();
        System.out.println("Массив второй ");
        for (int i = 0; i < mass_1.length; i++) {
            mass_2 [i] = r.nextInt(16);
            System.out.print(mass_2 [i] + " ");
            b += mass_2 [i];
        }
        System.out.println();
        a = a/mass_1.length;
        b = b/mass_2.length;
        System.out.println("Среднее арифметическое mass_1 " + a);
        System.out.println("Среднее арифметическое mass_2 " + b);

        if (a > b) {
            System.out.println("mass_1 больше");
        }
        if (b > a) {
            System.out.println("mass_2 больше");
        } else if (a == b){
            System.out.println("Массивы равны");
        }
    }
}
