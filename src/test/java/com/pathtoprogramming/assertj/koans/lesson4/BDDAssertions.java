package com.pathtoprogramming.assertj.koans.lesson4;

import com.pathtoprogramming.assertj.koans.Koans;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * How to do Koans:
 * Step 1: Press the Run Button (Place cursor on the Method name to run a single method)
 * Step 2: Read the name of the Method that Failed
 * Step 3: Fill in the blank (___) to make it pass
 * Step 4: Repeat Until Enlightenment
 * Do not change anything except the blank (___)
 */
class BDDAssertions extends Koans {

    @Test
    void BDD() {
        then(george.fullName()).containsIgnoringCase(__);
        then(brian).matches(p -> p.occupation().equals(__));
    }
}
