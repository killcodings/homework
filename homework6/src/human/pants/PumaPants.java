package human.pants;

public class PumaPants implements Pants {
    @Override
    public void putOnPants() {
        System.out.println("Put on Puma pants");
    }

    @Override
    public void putOffPants() {
        System.out.println("Off pants Puma");
    }
}
