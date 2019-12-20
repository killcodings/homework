public class Task1 {
    public static void main(String[] args) {
        double a = 10;
        double b = 0;
        for (int i = 1; i <= 7; i++){
            System.out.println(i);
            b = a + b;
            a = a + a * 0.1;

        }
        System.out.println(b);
    }
}
