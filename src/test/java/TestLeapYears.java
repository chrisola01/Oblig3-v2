import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;


class TestLeapYears {
    @Test
    void is_2020_a_leap_year() {
        assertEquals(true, leapYear.checkYear(2020));
    }

    @Test
    void is_1700_a_leap_year() {
        assertEquals(false, leapYear.checkYear(1700));
    }

    @Test
    void is_divisible_by_4() {
        assertEquals(true, leapYear.checkYear(2024));
    }

    @Test
    void is_divisble_by_100_but_not_400() {
        assertEquals(false, leapYear.checkYear(2100));
    }

    @Test
    void is_divisible_by_400() {
        assertEquals(true, leapYear.checkYear(2008));
    }

    @Test
    void is_not_divisble_by_4() {
        assertEquals(false, leapYear.checkYear(2000));
    }


}
