class Date{
	
	int month;
	int day;
	int year;
	
	Date (int d, int m, int y){
		day = d;
		month = m;
		year = y;
	}
	
	int getDay(){
		return day;
	}
	
	void setDay (int d){
		day = d;
	}
	
	int getMonth(){
		return month;
	}
	
	void setMonth (int m){
		month = m;
	}
	
	int getYear (){
		return year;
	}
	
	void setYear (int y){
		year = y;
	}
	
	void displayDate(){
		System.out.println(this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
}

class Exercise3_14{
	public static void main (String [] args){
		Date date = new Date (23,8,2015);
		
		date.displayDate();
	}
}