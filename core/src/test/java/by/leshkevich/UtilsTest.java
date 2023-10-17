package by.leshkevich;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilsTest {

    String[] arrayStr;

    @BeforeEach
    void initArray() {
        arrayStr = new String[]{"1", "str"};
    }

    @Test
    void isNotAllPositiveNumbers() {

        boolean result = Utils.isAllPositiveNumbers(arrayStr);
        assertFalse(result);
    }
}