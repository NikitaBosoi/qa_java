import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestingClass {

    // Проверяем класс Cat метод GetSound
    @Test
    public void testingCatClassMethodGetSound(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        assertTrue("Должно быть слово 'Мяу'", cat.getSound().equals("Мяу"));
    }


    // Проверяем класс Feline метод GetFamily
    @Test
    public void testingFelineClassMethodGetFamily(){
        Feline feline = new Feline();
        assertTrue("Должно быть слово 'Кошачьи'", feline.getFamily().equals("Кошачьи"));
    }

    // Проверяем класс Feline метод EatFood
    @Test
    public void testingFelineClassMethodEatMeat () throws Exception {
        Feline feline = new Feline();
        assertEquals("Должно быть значение", true , feline.eatMeat().contains("Животные")
                                                                        || feline.eatMeat().contains("Птицы")
                                                                        || feline.eatMeat().contains("Рыба"));
    }
    // Проверяем класс Feline метод GetKittens
    @Test
    public void testingFelineClassMethodGetKittens (){
        Feline feline = new Feline();
        assertEquals("Должно быть значение - 1", 1 , feline.getKittens());
    }

}
