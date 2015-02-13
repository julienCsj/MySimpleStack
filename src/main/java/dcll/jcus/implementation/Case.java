package dcll.jcus.implementation;

/**
 * Created by julien on 13/02/15.
 */
public class Case {
    private Case suivant;
    private Item item;

    public Case(Case suivant, Item item) {
        this.suivant = suivant;
        this.item = item;
    }

    public Case getSuivant() {
        return suivant;
    }

    public Item getItem() {
        return item;
    }
}
