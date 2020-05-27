package robot.hands;

public class ToshibaHand implements IHand{
    private int price;
    static boolean upHandChecker = false;

    public ToshibaHand(int price) {
        this.price = price;
    }

    @Override
    public void upHand() {
        if (upHandChecker == false) {
            System.out.println("Up Samsung hand");
            upHandChecker = true;
        } else {
            System.out.println("My Samsung hand is up");
        }

    }

    @Override
    public int getPrice() {
        return 0;
    }
}
