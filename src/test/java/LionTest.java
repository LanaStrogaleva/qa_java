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
    @Mock
    Feline feline;

    @Test
    public void getKittensTest() {
        Lion lion = new Lion(feline);

        Mockito.when(feline.getKittens()).thenReturn(1);

        int expected = 1;
        assertEquals(expected, lion.getKittens());
    }

    @Test(expected = Exception.class)
        public void doesHaveManeExceptionTest() throws Exception {
        Lion lion = new Lion("Девочка");
        lion.doesHaveMane();
    }
    @Test
    public void getFoodTest() throws Exception {
        Lion lion = new Lion(feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = lion.getFood();
        assertEquals(expected, actual);
    }

}
