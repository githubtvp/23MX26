class Date {
    int month, day;

    public Date() {
    }

    public Date(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int daysInMonth(int month) {
        return switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28; // Simplified for non-leap years
            default -> 31;
        };
    }

    public void nextDay() {
        int daysInMonth = daysInMonth(this.month);
        // Check if day is the last day of the month
        if (this.day == daysInMonth) {
            // If it is, wrap to the first day of the next month
            this.day = 1;
            this.month = (this.month % 12) + 1; // Wrap month if needed
        } else {
            // Otherwise, just increment the day
            this.day++;
        }
    }

    @Override
    public String toString() {
        return (day + "/" + month);
    }
}

class CalenderDate extends Date {
    private int year;


    public CalenderDate(int year) {
        super();
        this.year = year;
    }

    public CalenderDate(int year, int month, int day) {
        super(month, day);
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("%04d/%02d/%02d", year, month, day);
    }

    @Override
    public void nextDay() {
        if (day == 31 && month == 12) {
            year++;
        }
        super.nextDay();
    }

    // Implement compareTo method

    public int compareTo(CalenderDate otherDate) {
        if (this.year != otherDate.year) {
            return Integer.compare(this.year, otherDate.year);
        } else if (this.month != otherDate.month) {
            return Integer.compare(this.month, otherDate.month);
        } else {
            return Integer.compare(this.day, otherDate.day);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        CalenderDate date1 = new CalenderDate(2009, 3, 19);
        CalenderDate date2 = new CalenderDate(2010, 1, 1);
        CalenderDate date3 = new CalenderDate(2009, 3, 19);
        pr("\nDate original : " + date1.toString());
        date1.nextDay();
        pr("\nDate after increase : " + date1.toString());
        CalenderDate dt1 = date1;
        CalenderDate dt2 = date2;
        pr("\n" + dt1 + result(date1.compareTo(date2)) + dt2);
    }

    static String result(int n) {
        return switch (n) {
            case -1 -> " is less than ";
            case 0 -> " is same as ";
            case 1 -> " is greater than ";
            default -> " is less than";
        };
    }
    static void pr(String msg) {
        System.out.println(msg);
    }
}