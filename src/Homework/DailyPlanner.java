package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DailyPlanner {
    //3.create an object DailyPlanner(agenda zilnica) that has a list of DaySchedule objects
    private List<DaySchedule> scheduleList = new ArrayList<>();

    //4) add functionality to the DailyPlanner:
    //
    //addActivity(day, activity),   - if the activity is null throw a custom UNCHECKED exception: NoActivityException

    public void addActivity(DayOfTheWeek day, String activity) {
        //validez activitatea si arunc exceptia UNCHECKED NoActivityException
        validateActivity(activity);
        //folosesc un flag found pentru a vedea daca gasim ziua din DaySchedule
        DaySchedule found = getDaySchedule(day);
        if (found == null) {
            //daca nu gasesc ziua in lista de activitati, o adaug si adaug si un arrayList cu o singura activitate
            // prin mtoda .singletonList
            scheduleList.add(new DaySchedule(day, new ArrayList<>(Collections.singletonList(activity))));
        } else {
            found.getActivities().add(activity);
        }

    }

    //remove activity(day, activity) - if the activity doesn't exist throw the custom UNCHECKED exception: NoActivityException
    public void removeActivity(DayOfTheWeek day, String activityToBeRemoved) {
        //validez activitatea si arunc exceptia UNCHECKED NoActivityException
        validateActivity(activityToBeRemoved);
        //folosesc un flag found pentru a vedea daca gasim ziua din DaySchedule
        DaySchedule daySchedule = getDaySchedule(day);
        if (daySchedule == null) {
            //daca nu gasesc ziua in lista de activitati ca sa o pot sterge
            throw new NoActivityException();
        }else{
            boolean wasRemoved = removeActivityFromDay(activityToBeRemoved, daySchedule);
            if(!wasRemoved ){
                throw new NoActivityException();  // daca nu a fost sters arunc exceptia
            }
        }
    }

    private boolean removeActivityFromDay(String activityToBeRemoved, DaySchedule daySchedule) {
        for(String activity : daySchedule.getActivities()){
            if(activity.equals(activityToBeRemoved)){
                daySchedule.getActivities().remove(activity);
                return true;
            }
        }
        return false;
    }

    private void validateActivity(String activity) {
        //Stringul activity pt ca este obiect avemm ==
        if (activity == null) {
            throw new NoActivityException();
        }
    }

    private DaySchedule getDaySchedule(DayOfTheWeek day) {
        // se verifica daca exista ziua in lista scheduleList
        for (DaySchedule daySchedule : scheduleList) {
            if (daySchedule.getDay() == day) {
                return daySchedule;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DailyPlanner{" +
                "scheduleList=" + scheduleList +
                '}';
    }
}
