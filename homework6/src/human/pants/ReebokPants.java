package human.pants;

public class ReebokPants implements Pants {
    @Override
    public void putOnPants() {
        System.out.println("Put on Reebok pants");
    }

    @Override
    public void putOffPants() {
        System.out.println("Off pants Reebok");
    }
}

