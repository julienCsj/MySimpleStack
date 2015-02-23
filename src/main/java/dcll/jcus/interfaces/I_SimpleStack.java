package dcll.jcus.interfaces;

import dcll.jcus.exceptions.EmptyStackException;
import dcll.jcus.implementation.Item;

import java.util.ArrayList;

/**
 * Created by julien on 13/02/15.
 */

public interface I_SimpleStack {
    /**
     * Tests if this stack is empty */
    public boolean isEmpty();
    /**
     * Returns the number of items in this stack. */
    public int getSize();
    /**
     * Pushes an item onto the top of this stack. * null item is allowed.
     */
    public void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it from the stack. */
    public Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function. * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException;

    public boolean addCollection(ArrayList<Item> lesItems);
}
