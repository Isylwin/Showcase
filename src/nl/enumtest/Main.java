package nl.enumtest;


import nl.enumtest.enumholders.GenericEnumHolder;
import nl.enumtest.enumholders.NonGenericEnumHolder;
import nl.enumtest.enums.BasicTestType;
import nl.enumtest.enums.OtherTestType;

public class Main {

    public static void main(String[] args) {
        GenericEnumHolder<BasicTestType> genericBasicEnum = new GenericEnumHolder<>(BasicTestType.GERT);
        GenericEnumHolder<OtherTestType> genericOtherEnum = new GenericEnumHolder<>(OtherTestType.AAP);
        NonGenericEnumHolder nonGenericBasicEnum = new NonGenericEnumHolder(BasicTestType.GERT);
        NonGenericEnumHolder nonGenericOtherEnum = new NonGenericEnumHolder(OtherTestType.AAP);

        System.out.println("Generic basicEnum value: " + genericBasicEnum.getEnumValue());
        System.out.println("Generic otherEnum value: " + genericOtherEnum.getEnumValue());
        System.out.println("NonGeneric basicEnum value: " + nonGenericBasicEnum.getEnumValue());
        System.out.println("NonGeneric otherEnum value: " + nonGenericOtherEnum.getEnumValue());

        if(genericOtherEnum.getEnumValue() == nonGenericOtherEnum.getEnumValue()) {
            System.out.println("Comparing generic with nonGeneric, with the same enum type, is allowed and will succeed.");
        }

        if(nonGenericBasicEnum.getEnumValue() == nonGenericOtherEnum.getEnumValue()) {
            System.out.println("Comparing nonGeneric basic enum with nonGeneric other enum is allowed. But it will always fail (without exception)");
        }

        /*if(genericOtherEnum.getEnumValue() == genericBasicEnum.getEnumValue()) {
            System.out.println("Comparing generic basic enum with generic other enum will generate a compile error.");
        }*/
    }
}