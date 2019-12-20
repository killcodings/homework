public class GroundTransport extends Transport {
    public int quantityofwheels;
    public int fuelConsumption;

    public GroundTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.quantityofwheels = quantityofwheels;
        this.fuelConsumption = fuelConsumption;
    }
}
