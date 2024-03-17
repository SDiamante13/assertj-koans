package com.pathtoprogramming.assertj.koans.lesson5.helpers;

import com.pathtoprogramming.assertj.koans.Person;

public class DomainAssertions {

    public static PersonAssert assertThat(Person actual) {
        return new PersonAssert(actual);
    }
}
