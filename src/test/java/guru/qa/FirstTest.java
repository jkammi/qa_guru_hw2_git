package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertFalse(3 < 2);
    }

    void secondTest() {
        Assertions.assertFalse(3 < 1);
    }

    void thirdTest() {
        Assertions.assertFalse(3 <= 0);
    }

}

