public class Military extends Air {
    boolean catapultSystem;
    int totalRockets;


    Military(int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway, boolean catapultSystem, int totalRockets) {
        super(power, maxSpeed, weight, brand, wingspan, minimumRunway);
        this.catapultSystem = catapultSystem;
        this.totalRockets = totalRockets;

    }

    String getInformation() {
        return " " + power + " " + maxSpeed + " " + weight + " " + brand + " " + wingspan + "  " + minimumRunway + " " + totalRockets + " " + catapultSystem + " " + powerKW();
    }

    void shot() {
        int shots = totalRockets;
        for (int i = 0; i <= shots; i++) {
            if (totalRockets > 0) {
                System.out.println("Ракета пошла");
                totalRockets--;
            } else {
                System.out.println("Нет боеприпасов");
            }
        }
    }

    void catapult() {
        if (catapultSystem) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}