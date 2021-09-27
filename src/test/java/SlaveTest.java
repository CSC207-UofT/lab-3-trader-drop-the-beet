import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlaveTest {
    Slave s;

    @Before
    public void setUp() throws Exception {
        s = new Slave("A man");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("啊！", s.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(1, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        s.upgradeSpeed();
        assertEquals(2, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        s.downgradeSpeed();
        assertEquals(0, s.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(10, s.getPrice());
        s.downgradeSpeed();
        assertEquals(0, s.getPrice());
    }

}
