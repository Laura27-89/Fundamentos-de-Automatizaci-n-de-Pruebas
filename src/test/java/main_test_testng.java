import org.testng.Assert;
import org.testng.annotations.Test;

public class main_test_testng {
    @Test
    public void testConstructor(){
        Persona persona = new Persona("Totoro", "Makoi");
        Assert.assertEquals(persona.getFullName(), "Totoro Makoi");
    }

    @Test
    public void testChangeName(){
        Persona persona = new Persona("Totoro", "Makoi");
        persona.changeName("Kori");
        Assert.assertEquals(persona.getFullName(), "Kori Makoi");
    }
}