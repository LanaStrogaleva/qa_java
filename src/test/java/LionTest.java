import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    public List<String> predatorFoodList = List.of("Животные", "Птицы", "Рыба");

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        Mockito.when(feline.getKittens()).thenReturn(1);

        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test(expected = Exception.class)
        public void doesHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion(feline,"Девочка");
        lion.doesHaveMane();
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline, "Самец");

        Mockito.when(feline.getFood("Хищник")).thenReturn(predatorFoodList);

        List<String> expected = predatorFoodList;
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

}
