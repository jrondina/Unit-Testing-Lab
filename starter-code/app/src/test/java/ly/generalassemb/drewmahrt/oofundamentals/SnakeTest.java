package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class SnakeTest {

    Snake snake = new Snake(true);

    @Test
    public void make_noise_is_correct() throws Exception {
        String expectedNoise = "Hiss!!!";
        String  actualNoise = snake.makeNoise();
        assertEquals(expectedNoise,actualNoise);
    }

    @Test
    public void is_poisonous_correct() throws Exception {
        boolean expectedPoison = true;
        boolean actualPoison = true;
        assertEquals(expectedPoison,actualPoison);

    }

    @Test
    public void top_speed_is_correct() throws Exception {
        int expectedSpeed = 5;
        int actualSpeed = snake.getTopSpeed();
        assertEquals(expectedSpeed,actualSpeed);
    }
}