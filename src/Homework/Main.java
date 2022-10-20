package Homework;

public class Main {
    public static void main(String[] args) {DailyPlanner dailyPlanner = new DailyPlanner();
        dailyPlanner.addActivity(DayOfTheWeek.MONDAY, "Curs Engleza" );
        dailyPlanner.addActivity(DayOfTheWeek.TUESDAY,"Curs Romana");
        dailyPlanner.addActivity(DayOfTheWeek.THURSDAY, "Curs Matematica" );
        dailyPlanner.addActivity(DayOfTheWeek.FRIDAY,"Curs IT");
      //dailyPlanner.addActivity(DayOfTheWeek.SUNDAY, null);  -> pentru verificare NoActivityException

        System.out.println(dailyPlanner.toString());

    }
}
