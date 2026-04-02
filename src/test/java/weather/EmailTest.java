package weather;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailTest {
    @Test
    public void testGeneratesAlertString() {
        Notifier email = NotifierFactory.getNotifier("email");
        assert email != null;
        assertEquals("It is sunny", email.generateWeatherAlert("sunny"));
    }
}
