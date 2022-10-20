package Homework;

import java.util.ArrayList;
import java.util.List;

public class DaySchedule {
   //2.create an object that represents a Day Schedule(Programul zilei). It will have the day (the enum) and a list of activities (Strings)

    //planul pe zile va avea ziua si lista de activitati pe zi

    private DayOfTheWeek day;
    private List<String> activities;

    public DaySchedule(DayOfTheWeek day, List<String> activities) {
        this.day = day;
        this.activities = activities;
    }

    public DayOfTheWeek getDay() {
        return day;
    }

    public List<String> getActivities() {
        return activities;
    }

    @Override
    public String toString() {
        return "DaySchedule{" +
                "day=" + day +
                ", activities=" + activities +
                '}';
    }
}
