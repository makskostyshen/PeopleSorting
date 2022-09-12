package person.fields;

import person.Person;

public class AgeFieldData implements PersonFieldData{

    @Override
    public int getMin() {
        return PersonField.MIN_AGE;
    }

    @Override
    public int getRange() {
        return PersonField.AGE_RANGE;
    }

    @Override
    public int getField(Person person) {
        return person.getAge();
    }
}
