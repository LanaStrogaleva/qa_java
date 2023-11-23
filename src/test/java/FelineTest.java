import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    @Test
    public void eatMeatTest() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }

    @Test
    public void  getFamilyTest() {
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }
    @Test
    public void getKittensTest() {
        int expected = 1;
        assertEquals(expected, feline.getKittens());
    }
    @Test
    public void getKittensWithCountTest() {
        int expected = 6;
        assertEquals(expected, feline.getKittens(6));
    }

}
