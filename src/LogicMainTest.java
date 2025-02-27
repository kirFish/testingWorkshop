import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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

    @Test
    public void fifthTaskTest(){


        String value = "11,25,24";
        String value2 = "11/n25/n24";


        assertEquals( 60, mainInstance.fifthTask(value2));
        assertEquals( 60, mainInstance.fifthTask(value2));

    }

    @Test
    public void sixthTaskTest(){

        //given
        String value = "-10";


        try{
           mainInstance.sixthTask(value);
        }catch(Exception ignore){}
    }

    @Test
    public void seventhTaskTest(){

        String value = "1001";

        String result =  mainInstance.seventhTask(value);

        assertEquals( "", result);

    }


    @Test
    public void eighthTaskTest(){

        String value = "//#5#4,3\n2";

        int result =  mainInstance.eighthTask(value);

        assertEquals( 14, result);

    }
}
