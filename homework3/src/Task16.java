import java.util.Arrays;
import java.util.Random;

/*
6) Проверить, различны ли все элементы массива.
 */

public class Task16 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[15];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass));
        int s = 0;

        Arrays.sort(mass);
        for (int i = 1; i < 15; i++) {
            if (mass[i] == mass[i - 1]) {
                s = 0;
                break;
            } else {
                s = 1;
            }
        }
        switch (s) {
            case 0:
                System.out.println("Элементы массива различны");
                break;
            case 1:
                System.out.println("Элементы массива не различны");
                break;
        }
    }
}

