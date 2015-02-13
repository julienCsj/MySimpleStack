package dcll.jcus.tests;

import dcll.jcus.exceptions.EmptyStackException;
import dcll.jcus.implementation.Item;
import dcll.jcus.implementation.SimpleStack;
import junit.framework.TestCase;

public class SimpleStackTest extends TestCase {

    private SimpleStack stack;

    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {
        this.stack = null;
    }


    public void testIsEmpty() throws Exception {
        this.stack = new SimpleStack();
        assertTrue(stack.isEmpty());
    }

    public void testGetSize() throws Exception {
        this.stack = new SimpleStack();
        assertTrue(stack.getSize()==0);
    }

    public void testPushSize() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        assertTrue(stack.getSize() == 1);
    }

    public void testPushEmpty() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        assertFalse(stack.isEmpty());
    }


    public void testPeek() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        assertTrue(stack.peek().getItem().equals("julien"));
    }

    public void testPeekSize() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        assertTrue(stack.getSize() == 1);
    }

    public void testPeekEmpty() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        assertFalse(stack.isEmpty());
    }

    public void testPop() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        stack.push(new Item("elliot"));
        assertTrue(stack.pop().getItem().equals("elliot"));
    }

    public void testPop2() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        stack.push(new Item("elliot"));
        Item i = stack.pop();
        assertTrue(stack.pop().getItem().equals("julien"));
    }

    public void testPop3() throws Exception {
        this.stack = new SimpleStack();
        stack.push(new Item("julien"));
        stack.push(new Item("elliot"));
        Item i = stack.pop();
        assertTrue(stack.isEmpty() == false && stack.getSize() == 1);
    }

    public void testPopExeption() throws Exception {
        this.stack = new SimpleStack();
        try {
            stack.pop();
        } catch (EmptyStackException e) {
            assertTrue(true);
        }
    }

    public void testPeekExeption() throws Exception {
        this.stack = new SimpleStack();
        try {
            stack.peek();
        } catch (EmptyStackException e) {
            assertTrue(true);
        }
    }
}