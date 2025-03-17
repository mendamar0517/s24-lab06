package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 */
public class InheritanceSortedIntListTest {
    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    /**
     * Called before each test.
     */
    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
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
     * Tests for the addAll() method.
     */
    @Test
public void testAddAll() {
    list1.add(1);
    list1.add(3);
    list1.add(2);
    list1.add(4);
    list1.add(2);
    System.out.println("list1 totalAdded: " + list1.getTotalAdded()); // Хүлээгдэж буй утга: 5

    list2.add(3);
    list2.add(0);
    System.out.println("list2 totalAdded before addAll: " + list2.getTotalAdded()); // Хүлээгдэж буй утга: 2

    list2.addAll(list1);

    System.out.println("list2 totalAdded after addAll: " + list2.getTotalAdded()); // Хүлээгдэж буй утга: 7
}
}
