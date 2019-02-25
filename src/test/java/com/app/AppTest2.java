package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class AppTest2 {
    @Test
    @DisplayName("TEST 1")
    public void test1() {
        int val = 30;
        // mozesz message ustawic za pomoca Supplier
        // daje to takie udogodnienie ze kiedy wykonujesz test
        // to message zostanie utworzony tylko wtedy kiedy faktycznie test
        // nie zajdzie (LAZY EVALUATION)
        Assertions.assertTrue(val == 30, () -> "TEST 1 - wartosc niepoprawna");
    }

    @Test
    @DisplayName("TEST 2")
    public void test2() {
        // teraz wykonamy testy grupowe, czyli wtedy test zachodzi kiedy wszystkie testy
        // skladowe zachodza
        String n = "ADAM";
        Assertions.assertAll(
                "TEST 2 - TESTUJEMY NAPIS", // naglowek testu
                // ponizej masz kolejne testy, ich zaleta jest to ze wykonuja sie
                // do momentu az pierwszy test nie zajdzie
                () -> Assertions.assertEquals("ADAM", n, () -> "ERROR 1"),
                () -> Assertions.assertTrue(n.length() > 3, () -> "ERROR 2")
        );
    }
}
