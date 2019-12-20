import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {
        Integer mass[] = new Integer[50];
        int j = 1;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = j;
            j +=2;
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        Arrays.sort(mass, Collections.reverseOrder());
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
    }
}

