import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n = 15;

        System.out.println("Длина массива " + n);

        Integer mass[]=new Integer[n];

        for(int i=0; i<n;i++){
            mass[i]=r.nextInt(100); // заполняем массив случайными числами от 0 до 99
        }
        System.out.println("Массив без изменений");
        for(int i=0; i<n;i++){
            System.out.print(mass[i]+" "); // выводим массив на экран
        }
        System.out.println();

        int summ=0;
        for(int i=0;i<mass.length; i++){
            for(int j=0; j<mass.length; j++){
                if(mass[i]%2 == 0){
                    summ+=mass[i];
                }
            }
        }
        System.out.println(summ);
    }
}
