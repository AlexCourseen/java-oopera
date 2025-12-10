package ru.yandex.practicum;

import java.util.ArrayList;

public class Show {
    private String title;
    private String duration;
    private Director director;
    private ArrayList<String> listOfActors;

    public Show(String title, String duration, Director director, ArrayList<String> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<String> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<String> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printAllActors(ArrayList<String> listOfActors) {
        for (String actor:listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorToShow(Actor actor) {

    }
}
