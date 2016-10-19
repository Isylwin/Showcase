package nl.enumtest;

/**
 * Created by Oscar on 19-10-2016.
 */
public class GenericEnumHolder<CountryName extends Enum<CountryName>> {
    private Enum<CountryName> testType;

    public GenericEnumHolder(CountryName test) {

        this.testType = test;
    }

    public Enum<CountryName> getEnumValue() {
        return this.testType;
    }
}
