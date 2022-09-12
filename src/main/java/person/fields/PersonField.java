package person.fields;

public enum PersonField {
    AGE,
    WEIGHT,
    HEIGHT;

    public static final int MIN_AGE = 0;
    public static final int MAX_AGE = 120;
    public static final int AGE_RANGE = MAX_AGE - MIN_AGE;

    public static final int MIN_HEIGHT = 10;
    public static final int MAX_HEIGHT = 230;
    public static final int HEIGHT_RANGE = MAX_HEIGHT - MIN_HEIGHT;

    public static final int MIN_WEIGHT = 3;
    public static final int MAX_WEIGHT = 250;
    public static final int WEIGHT_RANGE = MAX_WEIGHT - MIN_WEIGHT;

}
