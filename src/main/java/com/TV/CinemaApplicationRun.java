package com.TV;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        Viewer viewer1 = new Viewer("user1", 25);
        viewer1.addMovie(new Cinema("Movie1", "Action", 2.0));
        viewer1.addMovie(new Cinema("Movie2", "Drama", 1.5));
        viewers.add(viewer1);

        Viewer viewer2 = new Viewer("user2", 30);
        viewer2.addMovie(new Cinema("Movie3", "Comedy", 1.8));
        viewers.add(viewer2);

        Viewer viewer3 = new Viewer("user3", 20);
        viewer3.addMovie(new Cinema("Movie4", "Horror", 2.2));
        viewers.add(viewer3);

        Viewer viewer4 = new Viewer("user4", 35);
        viewer4.addMovie(new Cinema("Movie5", "Action", 2.0));
        viewers.add(viewer4);

        Viewer viewer5 = new Viewer("user5", 28);
        viewer5.addMovie(new Cinema("Movie6", "Drama", 1.7));
        viewers.add(viewer5);

        ViewerStatistics stats = new ViewerStatistics();
        double averageAge = stats.averageAge(viewers);
        System.out.println("Средний возраст пользователей: " + averageAge);

        for (Viewer viewer : viewers) {
            System.out.println(viewer.getNickname() + " просмотрел " + viewer.getMoviesWatched() + " фильмов:");
            for (Cinema movie : viewer.getWatchedMovies()) {
                System.out.println("- " + movie.getTitle() + " (" + movie.getGenre() + ", " + movie.getDurationHours() + " ч)");
            }
        }
    }
}