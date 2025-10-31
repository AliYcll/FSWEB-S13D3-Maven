package org.example;

public class Person {
    private String firstname;
    private String lastName;
    private int age;
    private String gender;
    private String occupation;
    private String nationality;

    public Person(String firstname, String lastName, int age) {
        this(firstname, lastName, age, "Unknown", "Unemployed", "Unknown");
    }

    public Person(String firstname, String lastName, int age, String gender, String occupation, String nationality) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
