public class Task8 {
    public static void main(String[] args) {
//        for (int i=0; i<4; i++){
//            for(int j=i;j<4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        for(int i=4; i>0; i--){
//            for(int j=i;j<=4; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
        for (int i = 3; i >= 0; i--){        // одна итерация - одна строка, i - 3, 2, 1, 0 - кол-во пробелов
            for (int j = 0; j < i; j++){     // i раз
                System.out.print(" ");       // выводится пробел
            }
            for (int j = 0; j < (4 - i); j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i <= 3; i++){
            for (int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for (int j = 3; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");

        }

    }
}

