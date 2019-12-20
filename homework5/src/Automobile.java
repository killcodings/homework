public class Automobile extends GroundTransport {
    String bodyType;
    int totalPassengers;

    Automobile (int power, int maxSpeed, int weight, String brand, int quantityofwheels, int fuelConsumption, String bodyType, int totalPassengers){
        super (power, maxSpeed, weight, brand, quantityofwheels, fuelConsumption);
        this.bodyType = bodyType;
        this.totalPassengers = totalPassengers;
    }


    private double fuelConsumptionDistance(double distance) {
        double fuelConsumptionDistance = fuelConsumption * (distance / 100);
        return fuelConsumptionDistance;
    }
    String getInformation() {

        return " " + power + " " + maxSpeed + " " + weight + " " + brand + " " + quantityofwheels + " " + fuelConsumption + " " + bodyType + "  " + totalPassengers + " " + powerKW();
    }


    void kmPerFuel (double time){
            double distance = time * maxSpeed;
            System.out.println("За время " + time + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " проедет " + distance + " km израсходует " + +fuelConsumptionDistance(distance) + " литров топлива");

    }
}
