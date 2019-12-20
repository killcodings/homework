import java.util.Arrays;
import java.util.Random;

/*
Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
матрицы).

3)Проверить произведение элементов какой диагонали больше.
4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
включительно)
 */

public class Task24 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] mass = new int[4][4];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == mass.length - 2 - i && mass[i][j] % 2 == 0) {
                    sum += mass[i][j];
                }
            }
        }
        System.out.println("сумму четных элементов стоящих над побочной диагональю: " + sum + ".");
    }
}