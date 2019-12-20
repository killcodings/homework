public class Main {
    public static void main(String[] args) {
        Automobile pc1 = new Automobile(115, 140, 2300, "volvo", 4, 12, "minivan", 8);
        CargoTransport tr1 = new CargoTransport(210, 120, 3700, "Reno", 8, 23, 15);
        CivilTransport ca1 = new CivilTransport(600, 700, 23000, "Airbus", 32, 1500, "universal", 100,true);
        Military wa1 = new Military(900, 890, 21000, "Killer", 26, 900, false, 7);
        System.out.println(pc1.getInformation());
        System.out.println(tr1.getInformation());
        System.out.println(ca1.getInformation());
        System.out.println(wa1.getInformation());
        pc1.kmPerFuel(2);
        tr1.maxCarrying(6);
        ca1.maxPassengers(115);
        wa1.shot();
        wa1.catapult();
    }
}