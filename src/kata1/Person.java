package kata1;

import java.time.LocalDate;

import static java.time.LocalDate.now;

public class Person {

    private final String name;
    private final String surname;
    private final LocalDate dateOfBirth;

    public Person(String name, String surname, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public String name() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public String completeName() {
        return name + " " + surname;
    }

    public LocalDate date() {
        return dateOfBirth;
    }

    public int age() {
        return today().getYear() - dateOfBirth.getYear();
    }

    protected LocalDate today() {
        return now();
    }

}
