package dcll.jcus.implementation;

import dcll.jcus.exceptions.EmptyStackException;
import dcll.jcus.interfaces.I_SimpleStack;

import java.util.ArrayList;

/**
 * Created by julien on 13/02/15.
 */
public class SimpleStack implements I_SimpleStack {

    private int nbElement;
    private Case sommet;

    public SimpleStack() {
        this.sommet = null;
        this.nbElement = 0;
    }

    @Override
    public boolean isEmpty() {
        return nbElement == 0;
    }

    @Override
    public int getSize() {
        return nbElement;
    }

    @Override
    public void push(Item item) {
        this.nbElement++;
        Case toAdd = new Case(this.sommet, item);
        this.sommet = toAdd;
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        return sommet.getItem();
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }
        Item toReturn = sommet.getItem();
        this.sommet = sommet.getSuivant();
        this.nbElement--;
        return toReturn;
    }

    @Override
    public boolean addCollection(ArrayList<Item> lesItems) {
        for(Item i : lesItems) {
            this.push(i);
        }
        return true;
    }
}
