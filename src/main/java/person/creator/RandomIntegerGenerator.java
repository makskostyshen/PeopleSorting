package person.creator;

import java.util.Random;

public class RandomIntegerGenerator {

    private Random random;
    private int lowerBound;
    private int range;

    public RandomIntegerGenerator(int loverBound, int upperBound){
        random = new Random();
        this.lowerBound = loverBound;
        this.range = upperBound - loverBound;
    }


    public int getNewValue(){
        return lowerBound + random.nextInt(range);
    }
}
