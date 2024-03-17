package com.pathtoprogramming.assertj.koans.lesson5.helpers;

import com.pathtoprogramming.assertj.koans.Person;
import org.assertj.core.api.AbstractAssert;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonAssert extends AbstractAssert<PersonAssert, Person> {

    public PersonAssert(Person actual) {
        super(actual, PersonAssert.class);
    }

    public PersonAssert hasFullName(String expectedFullName) {
        isNotNull();
        assertThat(actual.fullName())
                .withFailMessage("Expected person's full name to be <%s> but was <%s>",
                        expectedFullName, actual.fullName())
                .isEqualTo(expectedFullName);
        return this;
    }

    public PersonAssert hasBirthday(LocalDate expectedBirthday) {
        isNotNull();
        assertThat(actual.birthday())
                .withFailMessage("Expected person's birthday to be <%s> but was <%s>",
                        expectedBirthday, actual.birthday())
                .isEqualTo(expectedBirthday);
        return this;
    }

    public PersonAssert hasOccupation(String expectedOccupation) {
        isNotNull();
        assertThat(actual.occupation())
                .withFailMessage("Expected person's occupation to be <%s> but was <%s>",
                        expectedOccupation, actual.occupation())
                .isEqualTo(expectedOccupation);
        return this;
    }
}
