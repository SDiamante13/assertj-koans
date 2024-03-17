package com.pathtoprogramming.assertj.koans.lesson5;

import com.pathtoprogramming.assertj.koans.Koans;
import org.junit.jupiter.api.Test;

import static com.pathtoprogramming.assertj.koans.lesson5.helpers.DomainAssertions.assertThat;

/**
 * How to do Koans:
 * Step 1: Press the Run Button (Place cursor on the Method name to run a single method)
 * Step 2: Read the name of the Method that Failed
 * Step 3: Fill in the blank (___) to make it pass
 * Step 4: Repeat Until Enlightenment
 * Do not change anything except the blank (___)
 */
class CustomAssertions extends Koans {

    @Test
    void customPersonAssertions() {
        assertThat(john)
                .hasFullName(__)
                .hasBirthday(______)
                .hasOccupation(__);
    }
}

