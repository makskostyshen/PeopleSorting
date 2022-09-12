package main;

import person.Person;
import person.fields.PersonField;

import java.util.List;

public class Printer {

    private static final String DELIMITER = "";


    public void printPeople(Person[] people){
        for(Person person: people){
            System.out.println(person);
        }
        System.out.println(DELIMITER);
    }


    public void printNumberOfPeopleSameWeight(List<Person>[] peopleByWeight){
        int length = peopleByWeight.length;
        for(int i = 0; i < length; i++){
            List<Person> personList = peopleByWeight[i];
            System.out.println("for weight " + (i - PersonField.MIN_WEIGHT)
                    + " number of people: " + personList.size());
        }
        System.out.println(DELIMITER);
    }


    public void printPeopleByWeight(List<Person>[] peopleByWeight){
        int length = peopleByWeight.length;
        for(int i = 0; i < length; i++){
            System.out.println("weight: " + (i + PersonField.MIN_WEIGHT));

            for(Person person: peopleByWeight[i]){
                System.out.println(person);
            }
        }
        System.out.println(DELIMITER);
    }
}
