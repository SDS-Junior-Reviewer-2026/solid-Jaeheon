package greeter;

import greeter.Greeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {
    private Greeter createGreeter(int tone){
        switch(tone){
            case Greeter.FORMAL: return new FormalGreeter();
            case Greeter.CASUAL: return new CausalGreeter();
            case Greeter.INTIMATE: return new IntimateGreeter();
            default: return new NormalGreeter();
        }
    }

    @Test
    public void testSaysHello() {
        Greeter greeter = createGreeter(Greeter.NORMAL);
        assertEquals("Hello.", greeter.greet());
    }

    @Test
    public void testSaysHelloFormally() {
        Greeter greeter = createGreeter(Greeter.FORMAL);
        assertEquals("Good evening, sir.", greeter.greet());
    }

    @Test
    public void testSaysHelloCasually() {
        Greeter greeter = createGreeter(Greeter.CASUAL);
        assertEquals("Sup bro?", greeter.greet());
    }

    @Test
    public void testSaysHelloIntimately() {
        Greeter greeter = createGreeter(Greeter.INTIMATE);
        assertEquals("Hello Darling!", greeter.greet());
    }
}
