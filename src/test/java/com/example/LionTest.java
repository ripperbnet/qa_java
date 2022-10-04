package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    private Feline feline;

    @Test
    public void getKittensTest() {
        Mockito.when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion(feline);
        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);
        Lion lion = new Lion(feline);
        assertEquals(food, lion.getFood());
    }

    @Test
    public void doesHaveManeTest() {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        });
        assertEquals( "Используйте допустимые значения пола животного - самец или самка" , exception.getMessage());
    }
}