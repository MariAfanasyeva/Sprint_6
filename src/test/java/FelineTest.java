import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    private Feline feline = new Feline();
    @Test
    // с помощью throws - предупреждение об исключении
    public void eatMeatReturnPredatorFood() throws Exception {
        List<String> felineFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(felineFood, feline.eatMeat());
    }
    @Test
    public void getFamilyTest() {
        String typeOfAnimal = "Кошачьи";
        //проверяем метод feline.getFamily(), сравниваем, что полученное значение соответствует корркектному - "Кошачьи"(именно его должен вернуть метод в Feline)
        Assert.assertEquals(typeOfAnimal, feline.getFamily());
    }
    @Test
    public void getKittensTest() {
        int numberOfKitten = 1;
        //тут проверяем значение "1"
        Assert.assertEquals(numberOfKitten, feline.getKittens());
    }
    @Test
    public void getKittensTestRandomInt() {
        int numberOfKitten = 77;
        //тут проверяем int значение, например "77"
        Assert.assertEquals(numberOfKitten, feline.getKittens(numberOfKitten));
    }
}
