package com.allstate.square;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 2/2/17.
 */
public class SquareTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testCalculateSquare() throws Exception {
        Square s = new Square();

        assertEquals(4, s.calculateSquare(2));

    }
}