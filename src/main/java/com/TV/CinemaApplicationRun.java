package com.TV;

import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {
    public static void main(String[] args) {
        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("user1", 25, 10));
        viewers.add(new Viewer("user2", 30, 15));
        viewers.add(new Viewer("user3", 20, 5));
        viewers.add(new Viewer("user4", 35, 20));
        viewers.add(new Viewer("user5", 28, 12));

        double averageAge = ViewerStatistics.averageAge(viewers);
        System.out.println("Средний возраст пользователей: " + averageAge);
    }
}
