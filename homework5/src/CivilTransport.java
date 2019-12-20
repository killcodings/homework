public class CivilTransport extends Automobile {
    int totalPassengers1;
    boolean bissnes;

    CivilTransport(int power, int maxSpeed, int weight, String brand, int quantityofwheels, int fuelConsumption, String bodyType,  int totalPassengers1, boolean bissnes) {
        super(power, maxSpeed, weight, brand, quantityofwheels, fuelConsumption, bodyType, totalPassengers1);
        this.totalPassengers1 = totalPassengers1;
        this.bissnes = bissnes;

    }
    String getInformation() {
        return " " + power + " " + maxSpeed + " " + weight + " " + brand + " " + quantityofwheels + " " + bodyType + " " + totalPassengers1 + " " + bissnes + " " + powerKW();

    }

    private double fuelConsumptionDistance(double distance) {
        double fuelConsumptionDistance = fuelConsumption * (distance / 100);
        return fuelConsumptionDistance;
    }

    void maxPassengers(int passengers) {
        if (passengers < totalPassengers) {
            System.out.println("Загружен");
        } else {
            System.out.println("Вам нужен транспорт побольше");
        }
    }
}
