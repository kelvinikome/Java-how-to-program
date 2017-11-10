class Date{
    private int day, month, year;

    private static final int []daysPerMonth = 
    { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public Date(int day, int month, int year){
        if (month <= 0 || month > 12)
            throw new IllegalArgumentException("month (" + month + ") must be 1-12");
        if (day <= 0 || (day > daysPerMonth[month] && !(month == 2 && day == 29)))
            throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");
        if (month == 2 && day == 29 && !(year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)))
            throw new IllegalArgumentException("day (" + day +
                ") out-of-range for the specified month and year");

        this.month = month;
        this.day = day;
        this. year = year;

        //System.out.printf("Date object constructor for date %s%n", this);
    }

    public String getMonthName(int str){
        String []months = 
        { " ", "Jan", "Feb", "Mar", "April", "May", "June", "July", "August", "Sept", "Oct", "Nov", "Dec" };

        return months[str];
    }

    public String getDayName(int str){
        String []months = 
        { " ", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", 
        "Friday", "Sunday"};

        if (str > 7)
            str = str - 7;
        else if (str > 14)
            str = str - 14;
        else if (str > 21)
            str = str - 21;
        else if (str > 28)
            str = str - 28;
        else
            str = 0;

        return months[1];
    }

    public String toString(){
        String ret = String.format("%d/%d/%d%n%s%s%s%n%s%s%s", month, day, year, 
        this.getMonthName(month), " "+day+", ", year,
        this.getDayName(day), " "+day+" "+this.getMonthName(month)+" ",year);
        return ret;
    }

    public void nextDay(){
        this.day++;
        if (this.day > daysPerMonth[this.month]){
            int tmp = this.day - daysPerMonth[this.month];
            if (tmp > 0){
                //System.out.print("resetting....");
                this.day = tmp;
                this.month++;
            }
        }
        if (this.month > 12){
            this.year++;
            this.month = 1;
        }
    }
}

class Exercise8_14{
    public static void main(String[] args) {
        Date date = new Date(25,8,2017);
        
        System.out.println(date.toString());
    }
}