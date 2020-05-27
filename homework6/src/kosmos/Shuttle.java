package kosmos;

public class Shuttle implements IStart {
    @Override
    public boolean preLaunchSystemCheck() {
        int i = (int) (Math.random() * 11);
        if (i > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Shuttle engines are running. All systems are normal.");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    @Override
    public void start() {
        System.out.println("Start shuttle");
    }
}