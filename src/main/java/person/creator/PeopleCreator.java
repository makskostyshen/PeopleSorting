package person.creator;

import person.fields.PersonField;
import person.Person;


public class PeopleCreator {

    private RandomIntegerGenerator heightGenerator;
    private RandomIntegerGenerator weightGenerator;
    private RandomIntegerGenerator ageGenerator;


    public PeopleCreator(){
        heightGenerator = new RandomIntegerGenerator(PersonField.MIN_HEIGHT, PersonField.MAX_HEIGHT);
        weightGenerator = new RandomIntegerGenerator(PersonField.MIN_WEIGHT, PersonField.MAX_WEIGHT);
        ageGenerator = new RandomIntegerGenerator(PersonField.MIN_AGE, PersonField.MAX_AGE);
    }


    public Person[] createPeople(int count){
        Person[] people = new Person[count];

        for(int i = 0; i < count; i++){
            int height = heightGenerator.getNewValue();
            int weight = weightGenerator.getNewValue();
            int age = ageGenerator.getNewValue();

            people[i] = new Person(height, weight, age);
        }
        return people;
    }


}
