package dcll.jcus.tests;

import dcll.jcus.implementation.Case;
import dcll.jcus.implementation.Item;
import junit.framework.TestCase;

public class CaseTest extends TestCase {

    private Case c;
    private Case caseSuivante = new Case(null, new Item("test"));

    public void testGetSuivant() throws Exception {
        c = new Case(caseSuivante, new Item("test#2"));
        assertTrue(c.getSuivant() == this.caseSuivante);
    }

    public void testGetItem() throws Exception {
        c = new Case(caseSuivante, new Item("test#2"));
        assertTrue(c.getItem().getValue().equals("test#2"));
    }
}