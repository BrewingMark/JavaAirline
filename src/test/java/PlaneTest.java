import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING_747);
    }

    @Test
    public void canGetPlaneType(){
        assertEquals(PlaneType.BOEING_747, plane.getPlaneType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(416, plane.getCapacity());
    }

    @Test
    public void canGetTotalWeight(){
        assertEquals(183500, plane.getTotalWeight());
    }

}
