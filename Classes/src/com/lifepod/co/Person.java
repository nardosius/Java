package com.lifepod.co;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        }
        if (getFirstName().isEmpty() && !getLastName().isEmpty()) {
            return getLastName();
        }
        if (!getFirstName().isEmpty() && getLastName().isEmpty()) {
            return getFirstName();
        }
        return getFirstName() + " " + getLastName();
    }

    public boolean isTeen() {
        if (this.age > 12 && this.age < 20) {
            return true;
        }
        return false;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }
}
