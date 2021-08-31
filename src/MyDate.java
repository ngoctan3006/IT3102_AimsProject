import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        Calendar calendar = Calendar.getInstance();
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(String date) {
        String dmy[] = date.split(" ");
        Map<String, Integer> mon = new HashMap<String, Integer>();
        mon.put("January", 1);
        mon.put("February", 2);
        mon.put("March", 3);
        mon.put("April", 4);
        mon.put("May", 5);
        mon.put("June", 6);
        mon.put("July", 7);
        mon.put("August", 8);
        mon.put("September", 9);
        mon.put("October", 10);
        mon.put("November", 11);
        mon.put("December", 12);

        this.day = Integer.parseInt(dmy[1].substring(0, dmy[1].length() - 2));
        this.month = mon.get(dmy[0]);
        this.year = Integer.parseInt(dmy[2]);
    }

    public void printDate() {
        System.out.println(this.getDay() + "/" + this.getMonth() + "/" + this.getYear());
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day >= 1 && day <= 31) {
            this.day = day;
        } else {
            this.day = 0;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if(month >= 1 && month <= 12) {
            this.month = month;
        } else {
            this.month = 0;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
