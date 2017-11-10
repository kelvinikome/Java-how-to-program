class Time2{
    private int hour;
    private int minute;
    private int second;
    private Date date = new Date (25,12,1999);

    public Time2(){
        this(0,0,0);
    }

    public Time2(int hour){
        this(hour,0,0);
    }

    public Time2(int hour, int minute){
        this(hour,minute,0);
    }

    public Time2(int hour, int minute, int second){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
        
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time2(Time2 time){
        this(time.getHour(),time.getMinute(),time.getSecond());
    }

    public void setTime(int hour, int minute, int second){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-59");
        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("second must be 0-59");
            
            this.hour = hour;
            this.minute = minute;
            this.second = second;
    }

    // validate and set hour
    public void setHour(int hour){
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("hour must be 0-23");

        this.hour = hour;
    }

    public void setMinute(int minute){
        if (minute < 0 || minute >= 60)
            throw new IllegalArgumentException("minute must be 0-23");

        this.minute = minute;
    }

    public void setSecond(int second){
        if (second >= 0 || second < 60)
            throw new IllegalArgumentException("second must be 0-23");

        this.second = second;
    }

    public int getHour(){
        return this.hour;
    }

    public int getMinute(){
        return this.minute;
    }

    public int getSecond(){
        return this.second;
    }

    public String toUniversalString(){
        return String.format("%02d:%02d:%02d%s", getHour(), getMinute(), getSecond(), 
            "\t"+this.date.toString());
    }

    public String toString(){
        return String.format("%d:%02d:%02d %s",
        ((getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12),
        getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }

    public void tick(){
        if (this.second+1 > 59){
            this.second = 00;
        }
        else{
            this.second += 1;
        }
    }

    public void incrementMinute(){
        if (this.minute+1 > 59){
            this.minute = 00;
        }
        else{
            this.minute += 1;
        }
    }

    public void incrementHour(){
        if (this.hour+1 > 23){
            date.nextDay();
            this.hour = 00;
        }
        else{
            this.hour += 1;
        }
    }
}

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

class Exercise8_12{
    public static void main(String[] args) {
        Time2 time = new Time2(20,15,30);

        for (int i=0;i<=200;i++){
            System.out.println(time.toUniversalString());
            time.incrementHour();
        }
    }
}