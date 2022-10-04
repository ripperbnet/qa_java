package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 1, 1 },
                { 0, 0 },
                { -1, -1 },
                { 2, 2 }
        });
    }

    @Parameterized.Parameter(0)
    public int actual;

    @Parameterized.Parameter(1)
    public int expected;



    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals(expected, actual);
    }

    @Test
    public  void getSoundTest() {
        Feline feline = new Feline();
        String actual = feline.getSound();
        String expected = "Мяу";
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensTest() {
        Feline feline = new Feline();
     //   int actual = feline.getKittens();
        assertEquals(expected, actual);
        assertEquals(expected, actual);
        assertEquals(expected, actual);
        assertEquals(expected, actual);
    }
}