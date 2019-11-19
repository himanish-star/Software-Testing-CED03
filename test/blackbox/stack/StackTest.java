package blackbox.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {
    @Test
    public void pushAndPopElement_Stack() {
        Stack stack = new Stack();
        stack.pushToStack(4);
        assertEquals(4,stack.popFromStack());
    }

    @Test
    public void push_2_pop_1_Element_Stack() {
        Stack stack = new Stack();
        stack.pushToStack(3);
        stack.pushToStack(4);

        assertEquals(4,stack.popFromStack());
        assertEquals(0,stack.getTopIndex());
        assertEquals(3,stack.popFromStack());
    }

    @Test
    public void checkTopIndexWithMultiplePushAndPop() {
        Stack stack = new Stack();
        stack.pushToStack(11);
        stack.pushToStack(12);
        stack.pushToStack(14);

        assertEquals(2,stack.getTopIndex());
        assertEquals(14,stack.popFromStack());
        assertEquals(1,stack.getTopIndex());

        stack.pushToStack(15);

        assertEquals(2,stack.getTopIndex());
        assertEquals(15,stack.popFromStack());
        assertEquals(1,stack.getTopIndex());
        assertEquals(12,stack.popFromStack());

        stack.pushToStack(25);
        stack.pushToStack(42);


        assertEquals(2,stack.getTopIndex());
        assertEquals(42,stack.popFromStack());
        assertEquals(1,stack.getTopIndex());
        assertEquals(25,stack.popFromStack());
        assertEquals(0,stack.getTopIndex());
        assertEquals(11,stack.popFromStack());
    }
}