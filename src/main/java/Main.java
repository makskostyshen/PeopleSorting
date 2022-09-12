import person.Person;
import person.creator.PeopleCreator;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PeopleCreator creator = new PeopleCreator();
        List<Person> people = creator.createPeople(500);

        for(Person p: people){
            System.out.println(p);
        }
    }
}
