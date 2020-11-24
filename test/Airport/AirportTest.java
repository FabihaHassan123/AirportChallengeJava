package Airport;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirportTest {

    @Test
    public void land() {
        Object plane = new Plane();
        Airport.land(plane);
        assertEquals(plane, Airport.hangar.get(0));
    }

    @Test
    public void takeoff() {
        Object plane = new Plane();
        Airport.land(plane);
//        assertEquals(plane + " has taken off", Airport.takeoff(plane));
        assertThat(Airport.takeoff(plane)).isEqualTo(plane + " has taken off");
        assertTrue(Airport.hangar.isEmpty());
    }

    @Test
    public void isFull() {
        Object plane1 = new Plane();
        Object plane2 = new Plane();

    }
}