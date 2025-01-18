import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class LionTest {

    @Before
    public void setup(){

        MockitoAnnotations.initMocks(this);

    }

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {

        when(feline.getKittens()).thenReturn(1);
        Lion lion = new Lion("Самка",feline);
        assertEquals(1,lion.getKittens());

    }

    @Test
    public void getFoodTest() throws Exception{
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец",feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

    @Test
    public void otherSexExceptionShouldReturnUnknownSexLionMessageString() {
        String expectedString = "Используйте допустимые значения пола животного - самец или самка";
        Exception exception = Assert.assertThrows(Exception.class, () -> new Lion("Котенок", feline));
        Assert.assertEquals(expectedString, exception.getMessage());
    }

}
