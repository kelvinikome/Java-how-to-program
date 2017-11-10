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

        System.out.printf("Date object constructor for date %s%n", this);
    }

    public String toString(){
        return String.format("%d/%d/%d", month, day, year);
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
class Exercise8_8{
    public static void main(String[] args) {
        Date date = new Date (28,11,1999);

        for (int i=0;i<=60;i++){
            System.out.println(date.toString());
            date.nextDay();
        }
    }
}