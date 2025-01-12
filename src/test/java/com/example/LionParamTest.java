import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParamTest {

    private String sex;
    private boolean hasMane;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }

    public LionParamTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец",true},
                {"Самка",false},
        };
    }

    @Mock
    Feline feline;

    @Test
    public void doesHaveManeTest(){
        try{

            Lion lion = new Lion(sex,feline);
            assertEquals(hasMane,lion.doesHaveMane());

        }catch (Exception e){

            assertEquals("Используйте допустимые значения пола животного - самец или самка",e.getMessage());

        }
    }
}
