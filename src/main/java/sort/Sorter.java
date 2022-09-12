package sort;

import person.Person;
import person.fields.*;

import java.util.*;

public class Sorter {

    public Person[] sort(Person[] people, PersonField field){
        PersonFieldData fieldData = fieldDataMap.get(field);

        List<Person>[] peopleByValues = createEmptyList(fieldData);

        fill(people, peopleByValues, fieldData);

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


    private void fill(Person[] people, List<Person>[] peopleByValues, PersonFieldData fieldData){
        for(Person person: people){
            peopleByValues[fieldData.getField(person) - fieldData.getMin()].add(person);
        }
    }


    private List<Person>[] createEmptyList(PersonFieldData fieldData){
        List<Person>[] peopleByValues = new LinkedList[fieldData.getRange()];

        for(int i = 0; i < peopleByValues.length; i++){
            peopleByValues[i] = new LinkedList<>();
        }
        return peopleByValues;
    }

    private static EnumMap<PersonField, PersonFieldData> fieldDataMap = new EnumMap<>(PersonField.class){{
        put(PersonField.AGE, new AgeFieldData());
        put(PersonField.WEIGHT, new WeightFieldData());
        put(PersonField.HEIGHT, new HeightFieldData());
    }};
}
