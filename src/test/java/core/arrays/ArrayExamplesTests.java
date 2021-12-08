package core.arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayExamplesTests {
    ArrayExample arrayExample = new ArrayExample();

    @Test
    public void boundValuesMenuTest() {
       assertEquals(1, arrayExample.getGameMenuItems(0));
       assertEquals(5, arrayExample.getGameMenuItems(4));
    }

    @Test
    public void inputInvalidMenuTest(){
       arrayExample.setGameMenuItems(1,6);
       assertEquals(2,arrayExample.getGameMenuItems(1));
    }
    @Test
    public void inputChangeMenuTest(){
        arrayExample.setGameMenuItems(0,2);
        assertEquals(2, arrayExample.getGameMenuItems(0));
    }

    @Test
    public void menuSwitchOption(){

    }



}
