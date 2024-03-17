package com.pathtoprogramming.assertj.koans;

import java.time.LocalDate;

public class Person {

    private final String fullName;
    private final LocalDate birthday;
    private final String occupation;

    public Person(String fullName, LocalDate birthday, String occupation) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", occupation='" + occupation + '\'' +
                '}';
    }

    public Person withBirthday(LocalDate now) {
        return new Person(fullName, now, occupation);
    }

    public String fullName() {
        return fullName;
    }

    public LocalDate birthday() {
        return birthday;
    }

    public String occupation() {
        return occupation;
    }
}
