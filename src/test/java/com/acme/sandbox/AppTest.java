package com.acme.sandbox;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertTrue;

public class AppTest {

    @Test
    @Category(Fast.class)
    public void testFast() {
        assertTrue(true);
    }

    @Test
    @Category(Slow.class)
    public void testSlow() {
        assertTrue(true);
    }
}
