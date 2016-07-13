package ly.generalassemb.drewmahrt.oofundamentals;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZooTest {

    Zoo zoo = Zoo.getInstance();

    @Test
    public void addition_is_Correct() throws Exception {
        Cow brownCow = new Cow("Brown");
        zoo.addAnimal(brownCow);
        int expectedSize = 1;
        int actualSize =  Zoo.getInstance().getAnimals().size();

        assertEquals(expectedSize,actualSize);
    }

    @Test
    public void deletion_is_Correct() throws Exception {

        Cow brownCow = new Cow("Brown");
        Lion kingLion = new Lion(true);
        Snake rattleSnake = new Snake(true);

        zoo.addAnimal(brownCow);
        zoo.addAnimal(kingLion);
        zoo.addAnimal(rattleSnake);

        zoo.removeAnimal();

        int expectedSize = 3; //brownCow from the addition_is_Correct case is still there so removeAnimal() makes it 4-1 =3
        int actualSize = zoo.getAnimals().size();

        assertEquals(expectedSize,actualSize);
    }
}