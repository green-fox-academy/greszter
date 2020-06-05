package sum;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumListTest {

    @Test
    public void sum() {
        SumList list = new SumList();
        list.add(3);
        list.add(4);
        list.add(5);
        assertEquals(12, list.sum());
    }

    @Test
    public void sumEmptyList() {
        SumList list = new SumList();
        assertEquals(0, list.sum());
    }

    @Test
    public void sumOneElement() {
        SumList list = new SumList();
        list.add(3);
        assertEquals(3, list.sum());
    }

    @Test
    public void sumNullElement() {
        SumList list = new SumList();
        list.add(null);
        assertEquals(0, list.sum());
    }

    @Test
    public void sumNullElementWithOthers() {
        SumList list = new SumList();
        list.add(null);
        list.add(4);
        list.add(5);
        assertEquals(9, list.sum());
    }






}