package person.fields;

import person.Person;

public interface PersonFieldData {
    int getMin();
    int getRange();
    int getField(Person person);
}
