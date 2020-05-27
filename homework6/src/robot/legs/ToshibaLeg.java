package robot.legs;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("First step");
    }

    @Override
    public int getPrice() {
        return 0;
    }
}
