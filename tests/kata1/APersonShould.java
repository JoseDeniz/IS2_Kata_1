package kata1;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static java.time.Month.SEPTEMBER;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class APersonShould {

    private String name;
    private String surname;
    private Person person;
    private LocalDate dateOfBirth;

    @Before
    public void setUp() {
        name = "Jose";
        surname = "Deniz";
        dateOfBirth = LocalDate.of(1992, SEPTEMBER, 13);
        person = new Person(name, surname, dateOfBirth);
    }

    @Test
    public void have_a_complete_name_and_a_date_of_birth() {
        assertThat(person.name(), is(name));
        assertThat(person.surname(), is(surname));
        assertThat(person.completeName(), is(name + " " + surname));
        assertThat(person.date(), is(dateOfBirth));
    }

    @Test
    public void have_a_correct_age() {
        assertThat(person.age(), is(23));
    }

}
