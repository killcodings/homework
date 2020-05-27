package human.shoes;

public class ReebokShoe implements Shoe {
    @Override
    public void putOnShoe() {
        System.out.println("Put on Reebok shoe");
    }

    @Override
    public void putOffShoe() {
        System.out.println("Put off Reebok shoe");
    }
}
