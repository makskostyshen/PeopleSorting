package person.creator;

import person.Person;

import java.util.ArrayList;
import java.util.List;


public class PeopleCreator {

    private RandomIntegerGenerator heightGenerator;
    private RandomIntegerGenerator weightGenerator;
    private RandomIntegerGenerator ageGenerator;


    public PeopleCreator(){
        heightGenerator = new RandomIntegerGenerator(10, 250);
        weightGenerator = new RandomIntegerGenerator(2, 300);
        ageGenerator = new RandomIntegerGenerator(0, 100);
    }


    public List<Person> createPeople(int count){
        List<Person> people = new ArrayList<>();

        for(int i = 0; i < count; i++){
            int height = heightGenerator.getNewValue();
            int weight = weightGenerator.getNewValue();
            int age = ageGenerator.getNewValue();

            people.add(new Person(height, weight, age));
        }
        return people;
    }


}
