import com.example.AlexLion;
import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    public List<String> predatorFoodList = List.of("Животные", "Птицы", "Рыба");

    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = alexLion.getFriends();
        assertEquals(expected,actual);
    }

    @Test
    public void getPlaceOfLivingTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        String expected = "Нью-Йоркский зоопарк.";
        String actual = alexLion.getPlaceOfLiving();
        assertEquals(expected,actual);
    }

    @Test
    public void getKittensTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        int expected = 0;
        int actual = alexLion.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(predatorFoodList);

        List<String> expected = predatorFoodList;
        List<String> actual = alexLion.getFood();

        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        assertTrue(alexLion.doesHaveMane());
    }

}
