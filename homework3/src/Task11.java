import java.util.Arrays;

/*
1) Найти произведение элементов, кратных 3.
 */

public class Task11 {
    public static void main(String[] args) {

        int[] mass = new int[10];
        int m = 1;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 20);
            if (mass[i] > 0 && mass[i] % 3 == 0) {
                    m *= mass[i];
            }
        }
        System.out.println(Arrays.toString(mass));
        System.out.println("произведение элементов, кратных 3 = " + m);


    }
}

