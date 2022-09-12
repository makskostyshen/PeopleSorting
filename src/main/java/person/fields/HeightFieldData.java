package person.fields;

import person.Person;

public class HeightFieldData implements PersonFieldData{


    @Override
    public int getMin() {
        return PersonField.MIN_HEIGHT;
    }

    @Override
    public int getRange() {
        return PersonField.HEIGHT_RANGE;
    }

    @Override
    public int getField(Person person) {
        return person.getHeight();
    }
}
