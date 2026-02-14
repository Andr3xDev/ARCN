package escuelaing.arcn.solid.lsp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VehicleTest {
    
    @Test
    public void testGasCarDrive() {
        GasCar car = new GasCar();
        assertFalse(car.isRunning());
        car.drive();
        assertTrue(car.isRunning());
    }
    
    @Test
    public void testElectricCarDrive() {
        ElectricCar car = new ElectricCar();
        assertFalse(car.isRunning());
        car.drive();
        assertTrue(car.isRunning());
    }
}
