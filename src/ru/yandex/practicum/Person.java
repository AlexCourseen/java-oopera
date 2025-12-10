package ru.yandex.practicum;

public class Person {
    private String name;
    private String surname;
    private double height;
    private final Gender gender;

    public Person(String name, String surname, Gender gender, double height) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.gender = gender;
    }

    public Person(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
