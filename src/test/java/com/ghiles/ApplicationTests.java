package com.ghiles;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ApplicationTests {

    private Application app;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        if (this.app == null) {
            this.app = new Application();
        }
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testSayHello() {
        // Given

    	// When
        String value = this.app.sayHello("World");

        // Then
        assertEquals("Hello World !!!", value);
    }
}
