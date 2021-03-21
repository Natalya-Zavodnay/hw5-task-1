import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateUnregisteredAndUnderLimit()
    {BonusService service = new BonusService();


        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
    @Test
    void shouldCalculateUnregisteredAndOverLimit()
    {BonusService service = new BonusService();


        long amount = 1000_000_60;
        boolean registered = false;
        long expected = 500;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);


    }
}