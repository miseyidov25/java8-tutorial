package java11;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld(){

        Person ismayil = new person();
        assertEquals("Hello World",ismayil.helloWorld() );

    }
    @Test
    public void shouldReturnIsmayil(){

        Person person = new person();
        assertEquals("Hello Ismayil",person.hello("Ismayil"))
        
    }
}