package lesson40FunctionalInterfaces;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FunctionalExamplesTest {

    @Test
    void testIsPrime() {
        assertTrue(FunctionalExamples.isPrime.test(2));  // 2 — просте
        assertTrue(FunctionalExamples.isPrime.test(13)); // 13 — просте
        assertFalse(FunctionalExamples.isPrime.test(1)); // 1 — не просте
        assertFalse(FunctionalExamples.isPrime.test(9)); // 9 — не просте
    }

    @Test
    void testRandomDayOfWeek() {
        String result = FunctionalExamples.randomDayOfWeek.get();
        assertNotNull(result); // Перевіряємо, що не null
        assertTrue(result.matches("(?i)Monday|Tuesday|Wednesday|Thursday|Friday|Saturday|Sunday")); // Має бути день тижня
    }
    @Test
    void testRoundDouble() {
        assertEquals(4L, FunctionalExamples.roundDouble.apply(3.6));
        assertEquals(2L, FunctionalExamples.roundDouble.apply(2.4));
        assertEquals(-2L, FunctionalExamples.roundDouble.apply(-1.6));
    }

}
