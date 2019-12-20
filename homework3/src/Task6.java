import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        Integer mass[] = new Integer[4];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(11);                                                // заполняем массив случайными числами от 0 до 9
        }
        System.out.println("Массив без изменений");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");                                              // выводим массив на экран
        }
        System.out.println();

        boolean isTrue = true;
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] >= mass[i + 1]) {
                isTrue = false;
                break;
            }
        }
        if (isTrue) {
            System.out.println("Массив строго возрастающий.");
        }
        else {
            System.out.println("Массив не возрастающий.");
        }
    }
}


