package blackbox.maxmin;

import org.junit.Test;
import static org.junit.Assert.*;
public class MaxMinTest {

    @Test
    public void testGetMaxValue() {
        System.out.println("getMaxValue");
        int[] array ={1,2,3,4};
        int result = MaxMin.getMaxValue(array);
        assert(result==4);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test
    public void testGetMaxValue1() {
        System.out.println("getMaxValue");
        int[] array ={-1,9,8,0,-9};
        int result = MaxMin.getMaxValue(array);
        assertFalse(result==-9);
        // TODO review the generated test code and remove the default call to fail.

    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetMaxValue2() {
        System.out.println("getMaxValue");
        int[] array = {};
        int result = MaxMin.getMaxValue(array);
        assertTrue(result==4);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of getMinValue method, of class Palindrome.
     */
    @Test
    public void testGetMinValue() {
        System.out.println("getMinValue");
        int[] array = {1,2,3,4};
        int result = MaxMin.getMinValue(array);
        assert(result==1);

    }

}