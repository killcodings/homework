package human.pants;

public class NikePants implements Pants {
    @Override
    public void putOnPants() {
        System.out.println("Put on Nike pants");
    }

    @Override
    public void putOffPants() {
        System.out.println("Off pants Nike");
    }
}
