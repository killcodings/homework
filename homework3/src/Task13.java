import java.util.Arrays;

/*
2) Найти среднее арифметическое элементов с нечетными номерами.
 */

public class Task13 {
    public static void main(String[] args) {

        int[] mass = new int[10];
        double sum = 0;
        int count = 0;
        int n = 5;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 20);
            if (mass[i] > n) {
                sum += mass[i];
                count++;
            }
        }
        System.out.println(Arrays.toString(mass));
        double average = sum / count;
        System.out.println("Средне арифметическое элементов превосходящих число " + n + " = " + average);
    }
}

