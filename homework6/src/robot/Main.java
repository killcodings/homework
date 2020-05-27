package robot;

import robot.hands.SamsungHand;
import robot.hands.SonyHand;
import robot.hands.ToshibaHand;
import robot.heads.SamsungHead;
import robot.heads.SonyHead;
import robot.heads.ToshibaHead;
import robot.legs.SamsungLeg;
import robot.legs.SonyLeg;
import robot.legs.ToshibaLeg;

public class Main {
    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */
        SamsungHand samsungHand = new SamsungHand(4);
        SonyHand sonyHand = new SonyHand(3);
        ToshibaHand toshibaHand = new ToshibaHand(5);
        SamsungHead samsungHead = new SamsungHead(7);
        SonyHead sonyHead = new SonyHead(11);
        ToshibaHead toshibaHead = new ToshibaHead(11);
        SamsungLeg samsungLeg = new SamsungLeg(10);
        SonyLeg sonyLeg = new SonyLeg(4);
        ToshibaLeg toshibaLeg = new ToshibaLeg(3);
        Robot robot = new Robot(samsungHead, samsungHand, sonyLeg);
        Robot robot1 = new Robot(sonyHead, sonyHand, toshibaLeg);
        Robot robot2 = new Robot(toshibaHead, toshibaHand, samsungLeg);
        robot.action();
        robot1.action();
        robot2.action();
        if (robot.getPrice() > robot1.getPrice() && robot.getPrice() > robot2.getPrice()) {
            System.out.println("First robot is expensive");
        } else if (robot1.getPrice() > robot.getPrice() && robot1.getPrice() > robot2.getPrice()) {
            System.out.println("Second robot is expensive");
        } else {
            System.out.println("Third robot is expensive");
        }
    }
}

