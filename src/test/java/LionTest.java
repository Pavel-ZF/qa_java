import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void lionGetKittens1Test() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedResult = 1;
        assertEquals(expectedResult, lion.getKittens());
    }

    @Test
    public void lionEatMeatTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, lion.getFood());
    }
}
