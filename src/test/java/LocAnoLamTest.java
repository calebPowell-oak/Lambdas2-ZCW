import com.sun.org.apache.xml.internal.security.encryption.AgreementMethod;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class LocAnoLamTest {

    private class AgeFilter implements CheckPerson {
        public boolean test(Person p) {
            return p.getAge() > 17;
        }
    }

    @Test
    public void testLocalClassFilter(){
        PersonHolder personHolder = new PersonHolder();
        Integer before = personHolder.people.size();
        personHolder.people = PersonHolder.filterPersons(personHolder.people, new AgeFilter());
        Integer after = personHolder.people.size();

        Assert.assertTrue((before - 1) == after);
    }

    @Test
    public void testAnonymousClassFilter(){
        PersonHolder personHolder = new PersonHolder();
        Integer before = personHolder.people.size();
        personHolder.people = PersonHolder.filterPersons(personHolder.people, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getAge() > 17;
            }
        });
        Integer after = personHolder.people.size();

        Assert.assertTrue((before - 1) == after);
    }

    @Test
    public void testLambdaExpressionFilter(){
        PersonHolder personHolder = new PersonHolder();
        Integer before = personHolder.people.size();
        personHolder.people = PersonHolder.filterPersons(personHolder.people, p -> p.getAge() > 17);
        Integer after = personHolder.people.size();

        Assert.assertTrue((before - 1) == after);
    }
}
