package main;

import person.Person;
import person.creator.PeopleCreator;
import person.fields.PersonField;
import sort.AgeSorter;
import sort.SameWeightGetter;
import sort.Sorter;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //create array to sort
        PeopleCreator creator = new PeopleCreator();
        Person[] people = creator.createPeople(1000000);


        //create sorters
        AgeSorter ageSorter = new AgeSorter();
        Sorter sorter = new Sorter();
        SameWeightGetter sameWeightGetter = new SameWeightGetter();


        //sort
        Person[] sortedAge = ageSorter.sort(people);
        Person[] sortedHeight = sorter.sort(people, PersonField.HEIGHT);
        List<Person>[] peopleByWeight = sameWeightGetter.getPeopleWithSameWeight(people);


        //out
        Printer printer = new Printer();

//        printer.printPeople(sortedAge);
//        printer.printPeople(sortedHeight);
//        printer.printPeopleByWeight(peopleByWeight);
        printer.printNumberOfPeopleSameWeight(peopleByWeight);






    }
}
