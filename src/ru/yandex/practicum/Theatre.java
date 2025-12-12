package ru.yandex.practicum;

import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 196.5);
        Actor actor2 = new Actor("Петр", "Петров", Gender.MALE, 176.8);
        Actor actor3 = new Actor("Анна", "Аннушкина", Gender.FEMALE, 165.3);

        Director director1 = new Director("Алексей", "Балабанов", Gender.MALE, 4);
        Director director2 = new Director("Никита", "Михалков", Gender.MALE, 10);

        Person musicAuthor = new Person("Йозеф", "Гайден", Gender.MALE);
        Person choreographer = new Person("Майя", "Плисецкая", Gender.FEMALE);

        ArrayList<Actor> simpleShowActors = new ArrayList<>();
        Show simpleShow = new Show("Отцы и дети", 120, director1, simpleShowActors);
        simpleShow.addActorToShow(actor1);
        simpleShow.addActorToShow(actor2);
        simpleShow.printAllActors();
        // замена несуществующего в простом спектакле актера
        simpleShow.substituteActorToNewActor(actor3, "Гришин");
        System.out.println();

        ArrayList<Actor> operaActors = new ArrayList<>();
        String operaLibrettoText = "Черная черная ночь, ла ла ла, троло ло ло!";
        int operaChoirSize = 2;
        Opera opera = new Opera("Черная ночь", 90, director2, operaActors, musicAuthor, operaLibrettoText, operaChoirSize);
        opera.addActorToShow(actor1);
        opera.addActorToShow(actor2);
        opera.addActorToShow(actor3);
        opera.printAllActors();
        opera.printLibretto();
        System.out.println();

        ArrayList<Actor> balletActors = new ArrayList<>();
        String balletLibrettoText = "Жили был лебедь на озере...";
        Ballet ballet = new Ballet("Лебединое озеро", 60, director2, balletActors, musicAuthor, balletLibrettoText, choreographer);
        ballet.addActorToShow(actor3);
        ballet.addActorToShow(actor1);
        ballet.printAllActors();
        ballet.printLibretto();
        // замена актера Аннушкина на actor2
        ballet.substituteActorToNewActor(actor2, "Иванов");
        ballet.printAllActors();
    }
}
