package sort;

import person.Person;
import person.fields.PersonField;

import java.util.*;


public class AgeSorter {

    public Person[] sort(Person[] people){
        List<Person>[] peopleByValues = createEmptyList();

        fill(people, peopleByValues);

        return getJoined(people, peopleByValues);
    }


    private Person[] getJoined(Person[] people, List<Person>[] peopleByValues){
        List<Person> resulting = new LinkedList<>();

        for(List<Person> personList: peopleByValues){
            for(Person person: personList){
                resulting.add(person);
            }
        }
        return resulting.toArray(new Person[people.length]);
    }


    private void fill(Person[] people, List<Person>[] peopleByValues){
        for(Person p: people){
            peopleByValues[p.getAge() - PersonField.MIN_AGE].add(p);
        }
    }


    private List<Person>[] createEmptyList(){
        List<Person>[] peopleByValues = new LinkedList[PersonField.AGE_RANGE];

        for(int i = 0; i < peopleByValues.length; i++){
            peopleByValues[i] = new LinkedList<>();
        }
        return peopleByValues;
    }

}
