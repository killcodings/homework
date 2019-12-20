import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("Введите число больше 3");

        if (scanner.hasNextInt()) {
            n = scanner.nextInt();

            if (n < 3) {
                System.out.println("Введите число больше 3. Перезапустите программу и попробуйте снова!");
            }
            else {
                int[] mass = new int[n];
                int count = 0;

                for (int i = 0; i < mass.length; i++) {
                    mass[i] = random.nextInt(n);
                    if (mass[i] % 2 == 0) {
                        if (mass[i] > 0) {
                            count++;
                        }
                    }
                }
                System.out.println(Arrays.toString(mass));

                int[] mass_1 = new int[count];
                int index = 0;
                for (int i = 0; i < mass.length; i++) {
                    if (mass[i] % 2 == 0) {
                        if (mass[i] > 0) {
                            mass_1[index] = mass[i];
                            index++;
                        }
                    }
                }
                System.out.println(Arrays.toString(mass_1));
            }
        }
        else {
            System.out.println("Извините, но это явно не целое число. Перезапустите программу и попробуйте снова!");
        }
    }
}