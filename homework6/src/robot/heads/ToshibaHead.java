package robot.heads;

public class ToshibaHead implements IHead {
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    @Override
    public void speek() {
        System.out.println("Says head Toshiba");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
