package dcll.jcus.tests;

import dcll.jcus.implementation.Item;
import junit.framework.TestCase;

public class ItemTest extends TestCase {

    Item i;

    public void testGetValue() throws Exception {
        i = new Item("test");
        i.getValue();
        assertTrue(i.getValue().equals("test"));
    }
}