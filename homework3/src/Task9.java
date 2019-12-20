import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = sc.nextInt();
        int[] array = new int[length];

        if (length % 2 == 1) {
            System.out.println("Введите другую длину массива");
        } else {
            for (int i = 0; i < length; i++) {
                array[i] = (int) (Math.random() * 15);
                System.out.print(array[i] + " ");
            }
            System.out.println();
            int leftSum = 0;
            for (int i = 0; i < length / 2; i++) {
                leftSum = leftSum + array[i];
            }
            System.out.println("Сумма левой половины " + leftSum);
            int rightSum = 0;
            for (int i = length / 2; i < length; i++) {
                rightSum = rightSum + array[i];
            }
            System.out.println("Сумма правой половины " + rightSum);
            if (leftSum > rightSum) {
                System.out.println("Левая сторона массива больше");
            } else if (leftSum < rightSum) {
                System.out.println("Правая сторона массива больше");
            } else {
                System.out.println("Сумма сторон одинаковая");
            }
        }
    }
}
