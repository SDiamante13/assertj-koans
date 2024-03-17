package com.pathtoprogramming.assertj.koans.lesson3;

import com.pathtoprogramming.assertj.koans.Koans;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

/**
 * How to do Koans:
 * Step 1: Press the Run Button (Place cursor on the Method name to run a single method)
 * Step 2: Read the name of the Method that Failed
 * Step 3: Fill in the blank (___) to make it pass
 * Step 4: Repeat Until Enlightenment
 * Do not change anything except the blank (___)
 */
class ExceptionAssertions extends Koans {

    @Test
    void exceptionAssertions() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> {
                    throw new IllegalArgumentException("Illegal Person");
                })
                .withMessage(__);

        assertThatThrownBy(() -> {
            throw new IllegalArgumentException("Illegal Person");
        })
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining(__);
    }

    @Test
    void noExceptionThrown() {
        assertThatNoException()
                .isThrownBy(() -> System.out.println("No exception here!"));

        assertThatCode(() -> System.out.println("No exception here!"))
                .doesNotThrowAnyException();
    }
}
