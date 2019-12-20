import java.util.Arrays;
import java.util.Random;

/*
7) Подсчитать, сколько раз встречается элемент с заданным значением.
 */

public class Task17 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        int[] mass = new int[15];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass));
        int c = 5;
        count = 0;
        for (int i = 0; i < 15; i++) {
            if (mass[i] == c) {
                count++;
            }
        }
        System.out.println("Число " + c + " встречается " + count + " раз");
    }
}