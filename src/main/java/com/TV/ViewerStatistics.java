package com.TV;

import java.util.List;

public class ViewerStatistics {
    public static double averageAge(List<Viewer> viewers) {
        if (viewers == null || viewers.isEmpty()) {
            return 0.0;
        }
        int sumAge = 0;
        for (Viewer viewer : viewers) {
            sumAge += viewer.getAge();
        }
        return (double) sumAge / viewers.size();
    }
}