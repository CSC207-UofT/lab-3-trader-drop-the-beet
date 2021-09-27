import org.junit.*;

import static org.junit.Assert.*;


public class SheepTest {
    Sheep S;

    @Before
    public void setUp() throws Exception {
        S = new Sheep();
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Baa!", S.sound());
    }


    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(8, S.getPrice());
    }

}