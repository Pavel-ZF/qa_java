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
public class LionDoesHaveManeParametrizedTest {
    @Parameterized.Parameter
    public String sex;

    @Parameterized.Parameters(name = "{index}: значение пола" )
    public static Object[] sexLion() {
        return new Object[] {
                "Самец",
                "Самка",
                "Male;"
        };
    }
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    @Mock
    Feline feline;
    @Test
    public void testDoesHaveMane() throws Exception {
        try {
            Lion lion = new Lion(sex, feline);
            Boolean expectedResult = null;

            if (sex.equals("Самец")) {
                expectedResult = true;
            } else if (sex.equals("Самка")) {
                expectedResult = false;
            }
            assertEquals(expectedResult, lion.doesHaveMane());
        }
        catch (Exception exception) {
            System.out.println("Используйте допустимые значения пола животного - самец или самка");
        }
    }


}
