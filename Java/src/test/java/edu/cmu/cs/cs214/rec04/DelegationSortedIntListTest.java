package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the DelegationSortedIntList class.
 *
 */
public class DelegationSortedIntListTest {
    private DelegationSortedIntList list1;
    private DelegationSortedIntList list2;

    /**
     * Called before each test.
     */
    @Before
    public void setUp() {
        list1 = new DelegationSortedIntList();
        list2 = new DelegationSortedIntList();
    }

    /**
     * Tests for the add() method.
     */
    @Test
    public void testAdd() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        assertTrue(list1.getTotalAdded() == 5);
    }

    /**
     * Test for the addAll() method.
     */
    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        assertTrue(list1.getTotalAdded() == 5);

        list2.add(3);
        list2.add(0);
        assertTrue(list2.getTotalAdded() == 2);

        list2.addAll(list1);
        assertTrue(list2.getTotalAdded() == 7);
    }
}
