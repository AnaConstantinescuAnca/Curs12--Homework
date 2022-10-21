package Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoActivitiesForDayException {
        DailyPlanner dailyPlanner = new DailyPlanner();
        dailyPlanner.addActivity(DayOfTheWeek.MONDAY, "Curs Engleza" );
        dailyPlanner.addActivity(DayOfTheWeek.TUESDAY,"Curs Romana");
        dailyPlanner.addActivity(DayOfTheWeek.THURSDAY, "Curs Matematica" );
        dailyPlanner.addActivity(DayOfTheWeek.FRIDAY,"Curs IT");
        dailyPlanner.addActivity(DayOfTheWeek.MONDAY, "Curs Engleza" );
        dailyPlanner.addActivity(DayOfTheWeek.MONDAY, "Curs IT" );
      //dailyPlanner.addActivity(DayOfTheWeek.SUNDAY, null);  -> pentru verificare NoActivityException
        System.out.println("DailyPlanner :");
        System.out.println(dailyPlanner.toString());

        dailyPlanner.addActivity(DayOfTheWeek.FRIDAY,"Curs Matematica");
        dailyPlanner.addActivity(DayOfTheWeek.MONDAY,"Curs Matematica");
        System.out.println("DailyPlanner dupa adaugare activitate");
        System.out.println(dailyPlanner.toString());

        dailyPlanner.removeActivity(DayOfTheWeek.MONDAY,"Curs Engleza");
        System.out.println("DailyPlanner dupa stergere activitate: ");
        System.out.println(dailyPlanner.toString());

        //intorc activitatea pe o zi List<String>
        System.out.println(dailyPlanner.getActivitiesOfDay(DayOfTheWeek.MONDAY));

        //afisez endPlanning pentru day Monday
        System.out.println("endPlanning pentru ziua MONDAY");
        System.out.println(dailyPlanner.endPlanning());
    }
}
