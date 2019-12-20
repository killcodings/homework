import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] mass = new int[10];
        int j = 2;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = j;
            j += 2;
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
