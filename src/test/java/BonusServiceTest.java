import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;

        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;

        assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateForNotRegisteredAndIsNotLimit() {
        BonusService service = new BonusService();

        long amount = 2_100_000;
        boolean registered = false;
        long expected = 210;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;

        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateForRegisteredAndIsNotLimit() {
        BonusService service = new BonusService();

        long amount = 2_100_000;
        boolean registered = true;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;

        assertEquals(expected, actual);
    }
}