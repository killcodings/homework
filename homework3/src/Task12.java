import java.util.Arrays;

/*
2) Найти среднее арифметическое элементов с нечетными номерами.
 */

public class Task12 {
    public static void main(String[] args) {

        int[] mass = new int[10];
        double sum = 0;
        double count = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 20);
            if (i % 2 != 0) {
                sum += mass[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(mass));
        sum /= count;
        System.out.println("Среднее арифметическое элементов с нечетными номерами = " + sum + ".");
    }
}

