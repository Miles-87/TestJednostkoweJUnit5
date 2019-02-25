package com.app;


import org.junit.jupiter.api.*;

public class AppTest1
{
    @BeforeAll
    public static void initAll() {
        // metoda ktora wykonuje sie jeden raz przed wszystkimi testami
        System.out.println("WYKONUJE SIE PRZED WSZYSTKIMI TESTAMI");
    }

    @BeforeEach
    public void beforeEachTest() {
        System.out.println("WYKONUJE SIE PRZED KAZDYM TESTEM");
    }

    @Test
    @DisplayName("TEST 1")
    public void test1()
    {
        String x = "ADAM";
        Assertions.assertEquals("ADAM", x, "TEST 1 - napis niepoprawny");
    }

    @Test
    @DisplayName("TEST 2")
    public void test2()
    {
        String x = "ADAM";
        Assertions.assertTrue(x.length() > 5, "TEST 2 - napis zbyt krotki");
    }

    @Test
    @DisplayName("TEST 3")
    public void test3()
    {
        Person person = new Person("ADAM", 30);
        Assertions.assertEquals(new Person("ADAM", 30), person, "TEST 3 - niepoprawny Person");
    }

    @AfterEach
    public void after() {
        System.out.println("PO KAZDYM TESCIE");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("PO WSZYSTKICH TESTACH");
    }
}
