public class Task2 {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 7;
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
