package human.jackets;

public class NikeJacket implements Jacket {
    @Override
    public void putOnJacket() {
        System.out.println("Put on Nike ");
    }

    @Override
    public void putOffJacket() {
        System.out.println("Take off a Nike jacket");
    }
}
