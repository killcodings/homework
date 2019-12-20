import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
8) Найти второй по величине (т.е. следующий по величине за максимальным)
элемент в массиве.
 */

public class Task18 {
    public static void main(String[] args) {
        Random random = new Random();
        Integer[] mass = new Integer[8];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass));
        Arrays.sort(mass);
        System.out.println(Arrays.toString(mass));
        System.out.println("Второй по величине элемент в массиве = " + mass[6]);
    }
}

