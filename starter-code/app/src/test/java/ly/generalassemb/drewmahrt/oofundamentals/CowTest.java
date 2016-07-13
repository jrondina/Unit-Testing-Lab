package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class CowTest {

    Cow cow = new Cow("Brown");

    @Test
    public void make_noise_is_correct() throws Exception {
        String expectedNoise = "Moo!!!";
        String  actualNoise = cow.makeNoise();
        assertEquals(expectedNoise,actualNoise);
    }

    @Test
    public void top_speed_is_correct() throws Exception {
        int expectedSpeed = 15;
        int actualSpeed = cow.getTopSpeed();
        assertEquals(expectedSpeed,actualSpeed);
    }

    @Test
    public void color_is_correct() throws Exception {
        String expectedColor = "Brown";
        String actualColor = cow.getColor();
        assertEquals(expectedColor,actualColor);
    }
}