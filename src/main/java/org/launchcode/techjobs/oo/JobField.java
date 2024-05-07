package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
    // fields
    int id;
    static int nextId = 1;
    String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }

    // Custom Methods

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof JobField jf)) return false;
        return getId() == jf.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getValue());
    }

    // Getters and Setters

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
