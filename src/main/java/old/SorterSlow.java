package old;

import person.Person;
import person.fields.PersonField;

import java.util.Comparator;
import java.util.EnumMap;

public class SorterSlow {


    private static EnumMap<PersonField, Comparator<Person>> peopleFieldPersonMap = new EnumMap<>(PersonField.class){{
        put(PersonField.AGE, Comparator.comparing(Person::getAge));
        put(PersonField.WEIGHT, Comparator.comparing(Person::getWeight));
        put(PersonField.HEIGHT, Comparator.comparing(Person::getHeight));
    }};


    public void sort(Person[] people, PersonField field){
        Comparator<Person> comparator = peopleFieldPersonMap.get(field);
        sortInner(people, comparator,0, people.length-1);
    }


    private void sortInner(Person[] people, Comparator<Person> comparator, int beginIndex, int endIndex){
        if (beginIndex < endIndex){
            int borderIndex = makeBorder(people, beginIndex, endIndex);
            sortInner(people, comparator, beginIndex, borderIndex - 1);
            sortInner(people, comparator, beginIndex + 1, endIndex);
        }
    }


    private int makeBorder(Person[] people, int beginIndex, int endIndex){
        Person border = people[endIndex];

        int borderNextIndex = beginIndex;

        for(int j = borderNextIndex; j < endIndex; j++){
            if(people[j].getAge() < border.getAge()){
                swap(people, borderNextIndex, j);
                borderNextIndex++;
            }
        }
        swap(people, borderNextIndex, endIndex);
        return borderNextIndex;
    }

    private void swap(Person[] people, int i, int j) {
        Person temporary = people[i];
        people[i] = people[j];
        people[j] = temporary;
    }

}
