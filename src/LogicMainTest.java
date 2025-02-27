package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class LogicMainTest {

    @BeforeClass
    public static void beforeClass(){

    }

    @Test
    public void mainTest(){

        //given
        String text =  " ";
        int expectedResult = 0;
        LogicMain mainInstance = new LogicMain(text);


        //when
        assertEquals(mainInstance.firstTask(text) , expectedResult);
    }

    @AfterClass
    public static void afterClass(){

    }
}
