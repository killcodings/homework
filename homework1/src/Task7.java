public class Task7 {
    public static void main(String[] args) {
        int i = 214;
        int j = i%100;
        if (j >= 11 && j <= 14) {
            System.out.println(i + " программистов");
        } else {
            switch (i%10) {
                case 1:
                    System.out.println(i + " программист");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println(i + " программиста");
                    break;
                default:
                    System.out.println(i + " программистов");
            }
        }
    }
}
