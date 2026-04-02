package vehicle;

public class Refiner {
    public void refuel(Vehicle vehicle) {
        int maxFuel = vehicle.getMaxFuel();
        vehicle.setRemainingFuel(maxFuel);
    }
}
