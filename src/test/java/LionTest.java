import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(MockitoJUnitRunner.class)
    public class LionTestNoParameters {
        @Mock
        Feline feline;
        @Test
        public void getKittensTest() throws Exception {
            Lion lion = new Lion("Самец",feline);
            lion.getKittens();
            Mockito.verify(feline, Mockito.times(3)).getKittens(); //убеждаемся, что метод вызвали с определенным аргементом 3 раза
        }

        @Test
        public void doesHaveManeTest() throws Exception { //throws Exception требует идея
            Lion lion = new Lion("Самец", feline);
            assertEquals(true, lion.doesHaveMane());
        }
        @Test
        public void getFoodTest() throws Exception {
            Lion lion = new Lion("Самец", feline);
            lion.getFood();
            Mockito.verify(feline).getFood("Хищник");
        }
        @Test
        public void constructorLionTest() throws Exception{
            Lion lion = new Lion("Самка", feline);
            assertEquals(false, lion.hasMane);
        }
        @Test
        public void constructorLionExceptionTest() throws Exception{
            Lion lion = new Lion("Самка", feline);
            assertThrows("Problems with exception",Exception.class,()-> new Lion("", feline));
        }
     }
