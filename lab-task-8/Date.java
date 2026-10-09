public class Date {
    int day = 1;
    int month = 1;
    int year = 1;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String displayDate() {
        return String.format("%d-%d-%d", day, month, year);
    }
}
