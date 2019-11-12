package blackbox.bicycle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BicycleTest {
    @Test
    void testSpeedAndBreakMechanism() {
        Bicycle newBicycle = new Bicycle(6, 100);

        newBicycle.speedUp(50);
        String expectedStr = "No of gears are "+ 6 + "\n" + "speed of bicycle is "+ 150;
        assertEquals(expectedStr, newBicycle.toString());

        newBicycle.applyBrake(140);
        expectedStr = "No of gears are "+ 6 + "\n" + "speed of bicycle is "+ 10;
        assertEquals(expectedStr, newBicycle.toString());

        newBicycle.speedUp(250);
        expectedStr = "No of gears are "+ 6 + "\n" + "speed of bicycle is "+ 260;
        assertEquals(expectedStr, newBicycle.toString());
    }

    @Test
    void testToStringMethodBicycle() {
        Bicycle newBicycle = new Bicycle(6, 180);

        String expectedStr = "No of gears are "+ 6 + "\n" + "speed of bicycle is "+ 180;
        assertEquals(expectedStr, newBicycle.toString());
    }

    @Test
    void testSetHeightOfMountainBike() {
        MountainBike newMountainBike = new MountainBike(4, 100, 23);

        String expectedStr = "No of gears are "+ 4 + "\n" + "speed of bicycle is "+ 100 + "\nseat height is "+ 23;
        assertEquals(expectedStr, newMountainBike.toString());

        newMountainBike.setHeight(44);
        expectedStr = "No of gears are "+ 4 + "\n" + "speed of bicycle is "+ 100 + "\nseat height is "+ 44;
        assertEquals(expectedStr, newMountainBike.toString());

        newMountainBike.applyBrake(44);
        expectedStr = "No of gears are "+ 4 + "\n" + "speed of bicycle is "+ 56 + "\nseat height is "+ 44;
        assertEquals(expectedStr, newMountainBike.toString());

        newMountainBike.speedUp(122);
        newMountainBike.setHeight(12);
        expectedStr = "No of gears are "+ 4 + "\n" + "speed of bicycle is "+ 178 + "\nseat height is "+ 12;
        assertEquals(expectedStr, newMountainBike.toString());
    }
}
