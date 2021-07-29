import org.junit.Assert;
import org.junit.Test;

public class main_test_junit {

    @Test
    public void  testConstructor(){
        Persona persona = new Persona("Totoro", "Makoi");
        Assert.assertEquals("Totoro Makoi", persona.getFullName());
    }

    @Test
    public void testChangeName(){
        Persona persona =  new Persona("Totoro", "Makoi");
        persona.changeName("Kori");
        Assert.assertEquals("Kori Makoi", persona.getFullName());
    }
}
