import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    void leapYear() {
        assertEquals(true, NextDayCalculator.LeapYear(2020));
    }

    @Test
    void date() {
        assertEquals( "1/1/2019",NextDayCalculator.Date(31,12,2018));
    }

}