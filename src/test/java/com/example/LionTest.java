import com.example.Feline;
import com.example.Lion;
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

        when(feline.getKittens()).thenReturn(5);
        Lion lion = new Lion("Самка",feline);
        assertEquals(5,lion.getKittens());

    }

    @Test
    public void getFoodTest() throws Exception{
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самец",feline);
        assertEquals(List.of("Животные", "Птицы", "Рыба"),lion.getFood());
    }

}
