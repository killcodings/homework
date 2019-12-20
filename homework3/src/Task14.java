import java.util.Arrays;
import java.util.Random;
/*
4) Найти наименьший нечетный элемент.
 */

public class Task14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i+=2) {
            mass[i] = random.nextInt(16);
        }
        System.out.println("Массив без изменений");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        int min = mass[0];
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("Наименьший нечетный элемент = " + min);
    }
}