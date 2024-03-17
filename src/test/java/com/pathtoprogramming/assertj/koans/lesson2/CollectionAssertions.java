package com.pathtoprogramming.assertj.koans.lesson2;

import com.pathtoprogramming.assertj.koans.Koans;
import com.pathtoprogramming.assertj.koans.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * How to do Koans:
 * Step 1: Press the Run Button (Place cursor on the Method name to run a single method)
 * Step 2: Read the name of the Method that Failed
 * Step 3: Fill in the blank (___) to make it pass
 * Step 4: Repeat Until Enlightenment
 * Do not change anything except the blank (___)
 */
class CollectionAssertions extends Koans {

    List<Person> people = List.of(george, john, brian);

    @Test
    void recursiveComparison() {
        List<Person> copyOfPeople = List.of(george.withBirthday(LocalDate.now()), john, brian);

        // Using a normal isEqualTo() assertion
        // you must define hashcode & equals
        assertThat(people).isNotEqualTo(copyOfPeople);
        // Using recursiveComparison you can avoid the need to do this
        assertThat(people)
                .usingRecursiveComparison()
                .ignoringFields(__)
                .isEqualTo(copyOfPeople);
    }

    @Test
    void filtering() {
        assertThat(people)
                .filteredOn("occupation", notIn("Musician"))
                .hasSize(1)
                .containsOnly(brian);
        assertThat(people)
                .filteredOnAssertions(person ->
                        assertThat(person.birthday().getYear()).isLessThan(___))
                .containsOnly(brian, john);
    }

    @Test
    void extracting() {
        assertThat(people)
                .extracting(__, __)
                .contains(
                        tuple("George Harrison", "Musician"),
                        tuple("John Lennon", "Musician"),
                        tuple("Brian Epstein", "Music Entrepreneur")
                );
    }
}
