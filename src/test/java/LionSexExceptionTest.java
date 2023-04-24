import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LionSexExceptionTest {
    Feline feline;

    @Test
    public void haveManeExceptionTest() throws Exception {
        Exception exception = Assert.assertThrows(Exception.class, () -> {
            Lion lion = new Lion("Male", feline); });
        String expectedResult = "Используйте допустимые значения пола животного - самец или самка";
        assertEquals(expectedResult, exception.getMessage());
    }
}

