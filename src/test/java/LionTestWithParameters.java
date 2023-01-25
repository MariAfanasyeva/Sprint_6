import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

@RunWith(Parameterized.class)
public class LionTest {
    //добавляем поля класса
    private final String sex;
    private final boolean hasMane;

    //нужен конструктор
    public LionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }
    //у нас уже есть аннотация с RunWith, поэтому подключаем с помощью метода
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this); //initMocks уже не используется, идея предлагает openMocks
    }
    //создаем мок через аннотацию
    @Mock
    Feline feline;
    @Parameterized.Parameters
    public static Object [][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
                {"null", false},
                {"1234567", false}
        };
    }
    @Test
    //теперь нужно проверить исключения если и не Самец и не Самка
    public void genderLionTestException() throw new Exception {
        try {
            Lion lion = new Lion(sex, feline);
            Assert.assertEquals(hasMane, lion.hasMane);
        }
        catch (Exception exception) {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage()); //получить сообщение об ошибке
        }
    }




}