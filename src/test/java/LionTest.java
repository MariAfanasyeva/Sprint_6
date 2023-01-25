import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
    public class LionTest {
        @Mock
        Feline feline;
        @Test
        public void getKittensTest() throws Exception {
            Mockito.when(feline.getKittens()).thenReturn(1);
            Lion lion = new Lion("Самец",feline);
            Assert.assertEquals(1, lion.getKittens());
        }

        @Test
        public void doesHaveManeTest() throws Exception { //throws Exception требует идея
            Lion lion = new Lion("Самец", feline);
            assertEquals(true, lion.doesHaveMane());
        }

    @Test
    public void doesHaveManeTestFemale() throws Exception { //throws Exception требует идея
        Lion lion = new Lion("Самка", feline);
        assertEquals(false, lion.doesHaveMane());
    }
//        @Test
//        public void getFoodTest() throws Exception {
//            Lion lion = new Lion("Самец", feline);
//            lion.getFood();
//            Mockito.verify(feline).getFood("Хищник");
//        }

    @Test
    public void getFoodCallEatMeat() throws Exception {
        String sex = "Самец";
        Lion lion = new Lion(sex, feline);
        lion.getFood();
        Mockito.verify(feline).eatMeat();
    }

    //проверяем что возвращается верный список
    @Test
    public void getFoodReturnFelineList() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Feline feline = new Feline();
        String sex = "Самка";
        Lion lion = new Lion(sex, feline);
        assertEquals(felineFood, lion.getFood());
    }
//        @Test
//        public void constructorLionTest() throws Exception{
//            Lion lion = new Lion("Самка", feline);
//            assertEquals(false, lion.hasMane);
//        }
//        @Test
//        public void constructorLionExceptionTest() throws Exception{
//            Lion lion = new Lion("Самка", feline);
//            assertThrows("Problems with exception",Exception.class,()-> new Lion("", feline));
//        }
     }
