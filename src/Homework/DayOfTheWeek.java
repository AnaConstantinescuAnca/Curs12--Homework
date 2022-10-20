package Homework;

public enum DayOfTheWeek {
    //1. enum zilele saptamanii
    MONDAY(1),TUESDAY(2), WEDNESDAY(3),
    THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

    private int number;

    DayOfTheWeek(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
