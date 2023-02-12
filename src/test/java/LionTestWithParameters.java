import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionTestWithParameters {
    @Parameterized.Parameter()
    public String sex;
    @Parameterized.Parameter(1)
    public boolean expected;
     Feline feline = new Feline();
    @Before
    public void init() {
        MockitoAnnotations.openMocks(this); //initMocks уже не используется, идея предлагает openMocks
    }

    @Parameterized.Parameters(name = "sex: {0}, expected: {1}")
    public static Object [][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void constructorLionTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            assertEquals(expected, lion.doesHaveMane());
        }

}
