package sort;

import person.Person;
import person.fields.PersonField;


import java.util.LinkedList;
import java.util.List;

public class SameWeightGetter {

    public List<Person>[] getPeopleWithSameWeight(Person[] people){

        List<Person>[] peopleByWeight = createEmptyList();

        fill(people, peopleByWeight);

        return peopleByWeight;
    }


    private List<Person>[] createEmptyList(){
        List<Person>[] peopleByValues = new LinkedList[PersonField.WEIGHT_RANGE];

        for(int i = 0; i < peopleByValues.length; i++){
            peopleByValues[i] = new LinkedList<>();
        }
        return peopleByValues;
    }


    private void fill(Person[] people, List<Person>[] peopleByWeight){

        boolean[][] occurrenceArray =
                new boolean[PersonField.WEIGHT_RANGE][PersonField.HEIGHT_RANGE];

        for(Person person: people){
            int weightIndex = person.getWeight() - PersonField.MIN_WEIGHT;
            int heightIndex = person.getHeight() - PersonField.MIN_HEIGHT;

            if(!occurrenceArray[weightIndex][heightIndex]){
                peopleByWeight[weightIndex].add(person);
                occurrenceArray[weightIndex][heightIndex] = true;
            }
        }
    }

}
