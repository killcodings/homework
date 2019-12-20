import java.util.Arrays;
import java.util.Random;

/*
9) Найти наименьший элемент среди элементов с четными индексами массива
 */

public class Task19 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(mass));

        int min = mass[0];
        for (int i = 0; i < 10; i+=2) {
            if(mass[i]<min){
                min=mass[i];
            }
        }
        System.out.println("Наименьший элемент среди элементов с четными индексами массива = " + min + ".");
    }
}
