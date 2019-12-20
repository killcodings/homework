public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -2;

        int sum = 0;
        int minus = 0;

        if (a > 0) {
            sum++;

        } else if (a < 0){
            minus++;
        }
        if (b > 0){
            sum++;

        }else if (b < 0){
            minus++;


        }
        if (c > 0){
            sum++;
        } else if (c < 0){
            minus++;
        }
        System.out.println("Положительных чисел " + sum);
        System.out.println("Отрицательных чисел " + minus);
    }

}