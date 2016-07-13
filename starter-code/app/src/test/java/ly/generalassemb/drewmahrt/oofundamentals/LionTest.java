package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionTest {

    Lion lion = new Lion(true);

    @Test
    public void make_noise_is_correct() throws Exception {
        String expectedNoise = "Roar!!!";
        String  actualNoise = lion.makeNoise();
        assertEquals(expectedNoise,actualNoise);
    }

    @Test
    public void alpha_is_correct() throws Exception {
        boolean expectedAlpha = true;
        boolean actualAlpha = false;
        assertEquals(expectedAlpha,actualAlpha);
    }

    @Test
    public void top_speed_is_correct() throws Exception {
        int expectedSpeed = 50;
        int actualSpeed = lion.getTopSpeed();
        assertEquals(expectedSpeed,actualSpeed);
    }
}