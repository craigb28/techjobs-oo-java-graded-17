package org.launchcode.techjobs.oo;

public abstract class JobField {
    // fields
    private int id;
    private static int nextId = 1;
    private String value;

    // Custom Methods

    @Override
    public String toString() {
        return value;
    }


}
