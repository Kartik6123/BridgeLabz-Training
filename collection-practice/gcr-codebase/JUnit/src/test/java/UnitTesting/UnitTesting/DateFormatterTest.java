package UnitTesting.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testValidDate() {
        String result = formatter.formatDate("2024-01-15");
        assertEquals("15-01-2024", result);
    }

    @Test
    void testAnotherValidDate() {
        assertEquals("31-12-2023",
                formatter.formatDate("2023-12-31"));
    }

    @Test
    void testInvalidDateFormat() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("15-01-2024");
        });
    }

    @Test
    void testInvalidDateValue() {
        assertThrows(IllegalArgumentException.class, () -> {
            formatter.formatDate("2024-13-40");
        });
    }
}
