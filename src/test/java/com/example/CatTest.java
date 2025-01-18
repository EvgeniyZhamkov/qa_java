package com.example;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest extends TestCase {
    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }


    @Test
    public void getSoundTest(){

        Cat cat = new Cat(feline);
        assertEquals("Мяу",cat.getSound());

    }

    @Test
    public void getFoodTest() throws Exception {

        cat.getFood();
        Mockito.verify(feline).eatMeat();

    }

}
