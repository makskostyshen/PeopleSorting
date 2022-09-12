package person.fields;

import person.Person;


public class WeightFieldData implements PersonFieldData{


    @Override
    public int getMin() {
        return PersonField.MIN_WEIGHT;
    }

    @Override
    public int getRange() {
        return PersonField.WEIGHT_RANGE;
    }

    @Override
    public int getField(Person person) {
        return person.getWeight();
    }


}
