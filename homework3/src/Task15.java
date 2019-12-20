import java.util.Arrays;
import java.util.Random;


/*
5) «Сожмите» массив, выбросив из него каждый второй элемент.
«Освободившиеся» места массива заполните нулями.
 */

public class Task15 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }

        for (int i = 2; i < mass.length; i += 2) {
            mass[i] = 0;
        }
        System.out.println(Arrays.toString(mass));
    }
}