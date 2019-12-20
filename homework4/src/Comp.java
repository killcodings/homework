import java.util.Scanner;

public class Comp {
    String processor;
    int ram;
    int hdd;
    int resource;
    int count = 0;
    Scanner sc = new Scanner(System.in);

    Comp(String processor, int ram, int hdd, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hdd = hdd;
        this.resource = resource;
    }

    void printCompInformation() {
        System.out.println("Процессор: " + processor);
        System.out.println("Оперативная память: " + ram);
        System.out.println("Жесткий диск: " + hdd);
        System.out.println("Циклов работы: " + resource);
    }

    void turnOn() {
        int i = (int) (Math.random() * 2);
        System.out.print("Введите число ");
        int Number = sc.nextInt();
        if (Number <= 1) {
            if (Number == i) {
                count++;
                turnOff();
            } else {
                fire();
            }
        } else {
            System.out.println("Введите число от 0 до 1");
            turnOn();
        }
    }

    void fire() {
        System.out.println("Компьютер горит");

    }

    void turnOff() {
        int i = (int) (Math.random() * 2);
        System.out.print("Введите число ");
        int Number = sc.nextInt();
        if (Number <= 1) {
            if (Number == i) {
                count++;
                turnOn();
            } else {
                fire();
            }
        } else {
            System.out.println("I need 1 or 0.");
            turnOff();
        }
    }
}