package ru.yandex.practicum;

import java.util.Objects;

public class Actor extends Person {
    public Actor(String name, String surname, Gender gender, double height) {
        super(name, surname, gender, height);
    }

    @Override
    public String toString() {
        String result = "Actor{" +
                "name='" + getName() + "\'" +
                ", surname='" + getSurname() + "\'" +
                "(height='" + getHeight() + "\')";
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Actor otherActor = (Actor) obj;
        return Objects.equals(getName(), otherActor.getName()) &&
                Objects.equals(getSurname(), otherActor.getSurname()) &&
                Objects.equals(getGender(), otherActor.getGender()) &&
                (getHeight() == otherActor.getHeight());
    }

    @Override
    public int hashCode() {
        int hash = 17;
        if (getName() != null) {
            hash = hash + getName().hashCode();
        }
        hash = hash * 31;
        if (getSurname() != null) {
            hash = hash + getSurname().hashCode();
        }
        return hash;
    }
}
