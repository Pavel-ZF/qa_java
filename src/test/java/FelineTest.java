import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void felineGetFamilyTest() {
        String expectedResult = "Кошачьи";
        assertEquals(feline.getFamily(), expectedResult);
    }

    @Test
    public void felineEatMeatTest() throws Exception {
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(feline.eatMeat(), expectedResult);
    }

    @Test
    public void felineGetKittens1Test() {
        int expectedResult = 1;
        assertEquals(feline.getKittens(), expectedResult);
    }
}
