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

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {

    @Mock
    Feline feline;

    @Test
    public void getFriendsTest() {
        AlexLion alexLion = new AlexLion(feline);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = alexLion.getFriends();
        assertEquals(expected,actual);
    }

    @Test
    public void getPlaceOfLivingTest() {
        AlexLion alexLion = new AlexLion(feline);
        String expected = "Нью-Йоркский зоопарк.";
        String actual = alexLion.getPlaceOfLiving();
        assertEquals(expected,actual);
    }

    @Test
    public void getKittensTest() {
        AlexLion alexLion = new AlexLion(feline);
        int expected = 0;
        int actual = alexLion.getKittens();
        assertEquals(expected,actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);

        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> actual = alexLion.getFood();
        assertEquals(expected, actual);
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        AlexLion alexLion = new AlexLion(feline);
        boolean expected = true;
        boolean actual = alexLion.doesHaveMane();
        assertEquals(expected, actual);
    }

}
