package nl.enumtest.enumholders;

/**
 * Created by Oscar on 19-10-2016.
 */
public class NonGenericEnumHolder {
    private Enum test;

    public NonGenericEnumHolder(Enum test) {
        this.test = test;
    }

    public Enum getEnumValue() {
        return this.test;
    }
}
