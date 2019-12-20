import java.util.Arrays;
import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random random = new Random();
        double [] mass_1 = new double [10];
        double [] mass_2 = new double [10];
        double [] mass_3 = new double[10];

        for (int i = 0; i < mass_1.length; i++) {
            mass_1[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass_1));

        for (int i = 0; i < mass_2.length; i++) {
            mass_2[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass_2));

        for (int i = 0; i < mass_3.length; i++) {
            mass_3[i] = mass_1[i] / mass_2[i];
        }
        System.out.println(Arrays.toString(mass_3));

        int a = 0;
        for (int i = 0; i < mass_3.length; i++) {
            if (mass_3[i] % 1 == 0) {
                a++;
            }
        }
        System.out.println("Колличество целых чисел в 3 массиве = " + a);
    }
}
