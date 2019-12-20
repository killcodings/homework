import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        Integer mass[] = new Integer[20];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(21);                                                // заполняем массив случайными числами от 0 до 9
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");                                              // выводим массив на экран
        }
        System.out.println();

        for(int i=1;i < mass.length; i+=2){
            mass[i] = 0;
        }
        for (int i = 0; i < mass.length; i++){
            System.out.print(mass[i] + " ");
        }
    }
}
