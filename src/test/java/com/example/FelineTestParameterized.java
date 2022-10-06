package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineTestParameterized {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][]{
                    {1, 1},
                    {0, 0},
                    {-1, -1},
                    {2, 2}
            });
        }

        @Parameterized.Parameter(0)
        public int actual;

        @Parameterized.Parameter(1)
        public int expected;

        @Test
        public void getKittensTest() {
            assertEquals(expected, actual);
        }
}

