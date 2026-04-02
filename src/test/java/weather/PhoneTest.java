package weather;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneTest {
    @Test
    public void testGeneratesAlertString() {
        Notifier phone = NotifierFactory.getNotifier("phone");
        assert phone != null;
        assertEquals("It is rainy", phone.generateWeatherAlert("rainy"));
    }
}
