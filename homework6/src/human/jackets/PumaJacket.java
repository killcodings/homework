package human.jackets;

public class PumaJacket implements Jacket {
    @Override
    public void putOnJacket() {
        System.out.println("Put on Puma ");
    }

    @Override
    public void putOffJacket() {
        System.out.println("Take off a Puma jacket");
    }
}
