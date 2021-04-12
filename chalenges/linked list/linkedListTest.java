/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tesss;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void addFirstTest() {
        linkeList classUnderTest = new linkeList();
        classUnderTest.append(5);
        classUnderTest.append(6);
        classUnderTest.append(7);

        assertEquals("head->[5]->[6]->[7]->x",classUnderTest.printLnkedList());
    }

    @Test public void insertBeforMiddleTest() {
        linkeList classUnderTest = new linkeList();
        classUnderTest.append(5);
        classUnderTest.append(6);
        classUnderTest.append(7);


        assertEquals("head->[5]->[8]->[6]->[7]->x",classUnderTest.insertBefore(6,8));

    }
    @Test public void insertBeforFirstNodeTest() {
        linkeList classUnderTest = new linkeList();
        classUnderTest.append(5);
        classUnderTest.append(6);
        classUnderTest.append(7);


        assertEquals("head->[8]->[5]->[6]->[7]->x",classUnderTest.insertBefore(5,8));
    }

    @Test public void insertAfterMdlleNodeTest() {
        linkeList classUnderTest = new linkeList();
        classUnderTest.append(5);
        classUnderTest.append(6);
        classUnderTest.append(7);


        assertEquals("head->[5]->[6]->[8]->[7]->x",classUnderTest.insertAfter(6,8));
    }
    @Test public void insertAfterLastNodeTest() {
        linkeList classUnderTest = new linkeList();
        classUnderTest.append(5);
        classUnderTest.append(6);
        classUnderTest.append(7);


        assertEquals("head->[5]->[6]->[7]->[8]->x",classUnderTest.insertAfter(7,8));
    }
    // _____________________________________________{{{{code Chaleng 07}}}}
      @Test public void returnValueTest() {
        linkeList classUnderTest = new linkeList();
        classUnderTest.append(5);
        classUnderTest.append(6);
        classUnderTest.append(7);
        classUnderTest.append(9);
        classUnderTest.append(10);


        assertEquals("Exeption",classUnderTest.returnValue(5));
        assertEquals("5",classUnderTest.returnValue(4));
        assertEquals("Exeption",classUnderTest.returnValue(-5));
        assertEquals("7",classUnderTest.returnValue(2));
    }
    @Test public void returnValueTestTow() {
        linkeList classUnderTest = new linkeList();
//        classUnderTest.append(5);
        classUnderTest.append(7);
        assertEquals("7",classUnderTest.returnValue(0));
    }
    // _____________________________________________{{{{code Chaleng 07}}}}

}