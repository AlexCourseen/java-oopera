package ru.yandex.practicum;

import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printAllActors() {
        if (!isListOfActorsEmpty()) {
            for (Actor actor : listOfActors) {
                System.out.println(actor);
            }
        }
    }

    public void addActorToShow(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (newActor.equals(actor)) {
                System.out.println(newActor + " уже участвует в данном спектакле.");
                break;
            }
        }
        listOfActors.add(newActor);
    }

    public void substituteActorToNewActor(Actor newActor, String actorSurname) {
        if (!isListOfActorsEmpty()) {
            boolean isActorInList=false;
            for (Actor actor : listOfActors) {
                if (actor.getSurname().equals(actorSurname)) {
                    int index = listOfActors.indexOf(actor);
                    listOfActors.remove(index);
                    addActorToShow(newActor);
                    isActorInList = true;
                    break;
                }
            }
            if (!isActorInList) {
                System.out.println("Актера с фамилией " + actorSurname + " нет в данном спектакле.");
            }
        }
    }

    private boolean isListOfActorsEmpty() {
        if (listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст");
            return true;
        }
        return false;
    }
}
