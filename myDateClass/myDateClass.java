import java.util.Calendar;              // Java class for working with dates and times
import java.util.GregorianCalendar;     // Java Calendar Subclass for the Gregorian Calendar System

/* Here we declare and give our MyDate class three
class attributes for the year, month and day. */
public class MyDate {

    /* These attributes are private, meaning that they can only 
    be accesed within the class itself. */
    private int year;
    private int month;
    private int day;

    /* No-arg constructor for current date, a constructor much
    like in C++ creates an instance of a class as an object. */
    public MyDate() {

        // Creating a new instance of a GregorianCalendar Object.
        GregorianCalendar calendar = new GregorianCalendar();

        /* This is used to refer to the current class, and cal
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

    // Constructor with elapsed time in milliseconds passed as a parameter.
    // The parameter is then passed into setDate */
    public MyDate(long elapsedTime) {
        setDate(elapsedTime);
    }

    // Constructor with year, month, and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // Getter methods
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Method to set the date using elapsed time
    public void setDate(long elapsedTime) {
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(elapsedTime);
        this.year = calendar.get(Calendar.YEAR);
        this.month = calendar.get(Calendar.MONTH);
        this.day = calendar.get(Calendar.DAY_OF_MONTH);
    }

}

// Test program for myDateClass 
public class TestMyDate {
    public static void main(String[] args) {
        // Create a MyDate object for the current date
        MyDate date1 = new MyDate();
        System.out.println("Date 1: " + date1.getYear() + "-" + (date1.getMonth() + 1) + "-" + date1.getDay());

        // Create a MyDate object with elapsed time
        MyDate date2 = new MyDate(3455555133101L);
        System.out.println("Date 2: " + date2.getYear() + "-" + (date2.getMonth() + 1) + "-" + date2.getDay());
    }
}