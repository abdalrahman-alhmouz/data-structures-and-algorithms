    package basiclibrary;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LibraryTest {
    @Test
    public void five(){
        int[] arrayOne= {1,8,6,5};
        int num =5;

        Library classUnderTest = new Library();
        int[] shiftArray=classUnderTest.insertShiftArray( arrayOne ,num);

        assertEquals(1, shiftArray[0]);
        assertEquals(8, shiftArray[1]);
        assertEquals(5, shiftArray[2]);
        assertEquals(6, shiftArray[3]);
        assertEquals(5, shiftArray[4]);



    }
}