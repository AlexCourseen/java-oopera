package ru.yandex.practicum;

import java.util.ArrayList;

public class Opera extends MusicalShow{
    private String choirSize;

    public Opera(String title, String duration, Director director, ArrayList<String> listOfActors, String musicAuthor,
                 String librettoText, String choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public String getChoirSize() {
        return choirSize;
    }

    public void setChoirSize(String choirSize) {
        this.choirSize = choirSize;
    }
}
