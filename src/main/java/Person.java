import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress;
    Integer age;

    public Person(){
        name = null;
        birthday = null;
        gender = null;
        emailAddress = null;
        age = null;
    }

    public Person(Integer age){
        name = null;
        birthday = null;
        gender = null;
        emailAddress = null;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println("person blah");
    }

}