package kata1;

import org.junit.Test;

import java.time.LocalDate;

import static java.time.LocalDate.of;
import static java.time.Month.SEPTEMBER;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class APersonShould {

    private final String NAME = "Jose";
    private final String SURNAME = "Deniz";
    private final LocalDate BIRTHDAY = of(1992, SEPTEMBER, 13);

    @Test
    public void have_a_complete_name_and_a_date_of_birth() {
        Person person = new Person(NAME, SURNAME, BIRTHDAY);
        assertThat(person.name(), is(NAME));
        assertThat(person.surname(), is(SURNAME));
        assertThat(person.completeName(), is(NAME + " " + SURNAME));
        assertThat(person.date(), is(BIRTHDAY));
    }

    @Test
    public void have_a_correct_age() {
        Person person = new TestablePerson(NAME, SURNAME, BIRTHDAY);
        assertThat(person.age(), is(23));
    }

    private class TestablePerson extends Person {

        public TestablePerson(String name, String surname, LocalDate birthday) {
            super(name, surname, birthday);
        }

        @Override
        protected LocalDate today() {
            return of(2015, SEPTEMBER, 22);
        }

    }
}
