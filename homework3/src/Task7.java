import java.util.Random;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        Integer mass[] = new Integer[12];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = r.nextInt(16);                                                // заполняем массив случайными числами от 0 до 15
        }
        System.out.println("Массив без изменений");
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");                                              // выводим массив на экран
        }
        System.out.println();

        int max=mass[0];
        int index = 0;
        for(int i=0; i<mass.length; i++){
            if(mass[i]>=max){
                max=mass[i];
                index = i;
            }
        }
        System.out.println("max="+max);
        System.out.println("Индекс последнего вхождения максимального элемента в массив = " + index);
    }
}
