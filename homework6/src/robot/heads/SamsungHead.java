package robot.heads;

public class SamsungHead implements IHead {
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speek() {
        System.out.println("Says head Samsung");

    }

    @Override
    public int getPrice() {
        return 0;
    }
}
