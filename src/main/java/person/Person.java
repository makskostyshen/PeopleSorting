package person;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private int height;
    private int weight;
    private int age;

    public Person(int height, int weight, int age) {
        this.height = height;
        this.weight = weight;
        this.age = age;
    }

    @Override
    public String toString() {
        return "h: " + height + ", w: " + weight + ", a: "+ age;
    }
}

