import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import com.example.Animal;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {
    private final String animalKindType;
    private final List<String> expectedFood;

    public AnimalParamTest(String animalKindType, List<String> expectedFood) {
        this.animalKindType = animalKindType;
        this.expectedFood = expectedFood;
    }

    @Parameterized.Parameters
    public static Object[][] animalFoodGroup() {
        return new Object[][]{
                {"Травоядное",
                        List.of("Трава", "Различные растения")},
                {"Хищник",
                        List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void FoodTest() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals("Список еды для животных не совпадает с ожидаемым", expectedFood, animal.getFood(animalKindType));
    }
}
