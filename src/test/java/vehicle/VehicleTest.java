package vehicle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    public Refiner refiner = new Refiner();
    public Vehicle vehicle = new Vehicle(100);

    @Test
    public void test_1() {
        for (int i = 0; i < 10; i++){
            vehicle.accelerate();
        }
        assertEquals(90, vehicle.getRemainingFuel());

        refiner.refuel(vehicle);
        assertEquals(100, vehicle.getRemainingFuel());
    }
}
