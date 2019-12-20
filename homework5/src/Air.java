public class Air extends Transport {
    int wingspan;
    int minimumRunway;

    Air (int power, int maxSpeed, int weight, String brand, int wingspan, int minimumRunway) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minimumRunway = minimumRunway;
    }
}

