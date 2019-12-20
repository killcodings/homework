public class Task3 {
        public static void main(String[] args) {
            int a = 0;
            for (int i = 1; i <= 256; i*=2){
                System.out.println(i);
                a += i;

            }
            System.out.println(a);
        }
    }