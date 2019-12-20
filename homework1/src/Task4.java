public class Task4 {
    public static void main(String[] args) {
        int a = 2;
        int b = -2;
        int c = 4;

        int sum = 0;

        if (a > 0) {
            sum++;
        }

        if (b > 0){
            sum++;
        }
        if (c > 0){
            sum++;
        }
        System.out.println("Количество положительных чисел " + sum);

    }
}
