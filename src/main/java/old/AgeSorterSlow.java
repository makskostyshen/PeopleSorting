package old;

import person.Person;

public class AgeSorterSlow {

    public void ageSort(Person[] people){
        ageSortInner(people, 0, people.length-1);
    }


    private void ageSortInner(Person[] people, int beginIndex, int endIndex){
        if (beginIndex < endIndex){
            int borderIndex = makeBorder(people, beginIndex, endIndex);
            ageSortInner(people, beginIndex, borderIndex - 1);
            ageSortInner(people, beginIndex + 1, endIndex);
        }
    }


    private int makeBorder(Person[] people, int beginIndex, int endIndex){
        Person border = people[endIndex];

        int borderNextIndex = beginIndex;

        for(int j = borderNextIndex; j < endIndex; j++){
            if(people[j].getAge() < border.getAge()){
                swap(people, borderNextIndex, j);
                borderNextIndex++;
            }
        }
        swap(people, borderNextIndex, endIndex);
        return borderNextIndex;
    }

    private void swap(Person[] people, int i, int j) {
        Person temporary = people[i];
        people[i] = people[j];
        people[j] = temporary;
    }
}
