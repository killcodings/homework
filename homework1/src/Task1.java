public class Task1 {
    public static void main(String[] args) {
        int i = - 110;
        if (i > 0){

            if (i <= 9) {
                System.out.println("Число однозначное положительное");
            }
            if (i > 10 && i < 100) {
                System.out.println("Число двухзначное положительное");
            }
            if (i > 99) {
                System.out.println("Чмсло трехзначное положительное");
            }

        } else if (i < 0) {
            if (i > -10) {
                System.out.println("Число однозначное отрицательное");
                if (i <= -10 && i > -100) ;
                System.out.println("Двухзначное отрицательное число");
                if (i < -100) ;
                System.out.println("Трехзначное отрицательное");
            }

        }else {
            System.out.println("Это ноль");
        }

    }
}