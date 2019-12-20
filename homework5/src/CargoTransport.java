public class CargoTransport extends GroundTransport {
    int loading;

    CargoTransport(int power, int maxSpeed, int weight, String brand, int numberOfWheels, int fuelConsumption, int loading) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.loading = loading;
    }


    String getInformation() {
        return power + " " + maxSpeed + " " + weight + "  " + brand + " " + quantityofwheels + " " + fuelConsumption + " " + loading + "  " + powerKW();
    }

    void maxCarrying(int cargoWeight) {
        if (cargoWeight < loading) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }
}
