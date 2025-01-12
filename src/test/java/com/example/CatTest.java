package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;

    @Mock
    Predator predator;


    @Test
    public void getSoundTest(){

        Cat cat = new Cat(feline);
        assertEquals("Мяу",cat.getSound());

    }

    @Test
    public void getFoodTest() throws Exception {

        Cat cat = new Cat(feline);
        assertEquals(predator.eatMeat(),cat.getFood());

    }

}
