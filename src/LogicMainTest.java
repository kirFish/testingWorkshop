import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LogicMainTest {

    private static LogicMain mainInstance = new LogicMain();


    @Test
    public void firstTaskTest(){

        //given
        String text =  "";
        int expectedResult = 0;

        //when
        int result = mainInstance.firstTask(text);

        //then
        assertEquals( result, expectedResult);
    }


    @Test
    public void secondTaskTest(){

        //given
        int value = 69;

        //when
        int result = mainInstance.secondTask(value);

        //then
        assertEquals( result, value);
    }


    @Test
    public void thirdTaskTest(){

        //given
        String value = "5,6";

        //when
        int expectedResult = 11;
        int result = mainInstance.thirdTask(value);

        //then
        assertEquals( result, expectedResult);
    }

    @Test
    public void fourthTaskTest(){

        //given
        String value = "2/n16";

        //when
        int expectedResult = 18;
        int result = mainInstance.fourthTask(value);

        //then
        assertEquals( result, expectedResult);
    }
}
