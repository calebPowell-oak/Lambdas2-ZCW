import java.util.ArrayList;
import java.util.List;

public class PersonHolder {

    List<Person> people = new ArrayList<Person>();

    public PersonHolder(){
        people.add(new Person(22));
        people.add(new Person(14));
        people.add(new Person(43));
    }

    public static List<Person> filterPersons(
            List<Person> roster, CheckPerson tester) {
        List<Person> newRoster = new ArrayList<Person>();
        for (Person p : roster) {
            if (tester.test(p)) {
                newRoster.add(p);
            }
        }
        return newRoster;
    }
}
