import java.util.Arrays;
import java.util.Random;

/*
10) Найти максимальный элемент в массиве и поменять его местами с нулевым
элементом
 */

public class Task20 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass));

        int max = mass[0];
        int index = 0;
        for (int i = 1; i < mass.length; i++) {
            if (mass[i] > max) {
                max = mass[i];
                index = i;
            }
        }
        System.out.println("Максимальный элемент = " + max);

        for (int i = 0; i < mass.length; i++) {
            if (i == index) {
                int k = mass[i];
                mass[i] = mass[0];
                mass[0] = k;
            }
        }
        System.out.println(Arrays.toString(mass));

    }
}